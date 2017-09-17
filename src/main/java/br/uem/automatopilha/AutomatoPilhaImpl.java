package br.uem.automatopilha;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Stack;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.apache.commons.lang3.StringUtils;

import br.uem.automatopilha.observer.Observer;
import br.uem.automatopilha.view.util.AutomatoUtil;

public class AutomatoPilhaImpl implements AutomatoPilha {

	private Boolean estadoExecucao;
	private final Observer observer = new Observer(this);

	private static final String FUNDO_PILHA = "#";
	private static final String SEGUNDA_PARTE = "SEGUNDA_PARTE";
	private static final String PRIMEIRA_PARTE = "PRIMEIRA_PARTE";

	private static final List<String> alfabeto = Arrays.asList("0", "1");

	private final List<String> characters;
	private final List<String> estados;
	private final Stack<String> pilha = new Stack<>();

	public AutomatoPilhaImpl(String palavra) {
		pilha.push(FUNDO_PILHA);
		this.characters = AutomatoUtil.toList(palavra);
		this.estados = Stream.iterate(0, size -> ++size)
				.map(size -> String.format("q%s", size))
				.limit(characters.size())
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Boolean run() {
		execute();
		return getEstadoExecucao();
	}

	private void execute() {
		try {
			Map<String, List<String>> map = divideLista();
			Iterator<String> iterator = estados.stream().iterator();
			empilhar(map.get(PRIMEIRA_PARTE), hasNextGet(iterator));
			desempilhar(map.get(SEGUNDA_PARTE), hasNextGet(iterator));
		} catch (AutomatoPilhaException ex) {
			this.estadoExecucao = false;
		}
		this.estadoExecucao = pilha.isEmpty();
		observer.update();
	}

	private String hasNextGet(Iterator<String> iterator) {
		if (iterator.hasNext()) {
			return iterator.next();
		}
		throw new AutomatoPilhaException();
	}

	private Map<String, List<String>> divideLista() {
		Map<String, List<String>> map = new HashMap<>();
		map.put(PRIMEIRA_PARTE, AutomatoUtil.getFirstHalf(characters));
		map.put(SEGUNDA_PARTE, AutomatoUtil.getSecondHalf(characters));

		if (map.get(PRIMEIRA_PARTE).size() != map.get(SEGUNDA_PARTE).size()) {
			throw new AutomatoPilhaException();
		}

		return map;
	}

	private void empilhar(List<String> simbolos, String estado) {
		simbolos.stream()
			.filter(simbolo -> alfabeto.contains(simbolo))
			.forEach(pilha::push);
	}

	private void desempilhar(List<String> simbolos, String estado) {
		simbolos.stream()
				.filter(simbolo -> alfabeto.contains(simbolo))
				.filter(simbolo -> StringUtils.contains(estado, simbolo))
				.forEach(item -> pilha.pop());
		descarregarPilha();
	}

	private void descarregarPilha() {
		if (restouApenasFundoDePilha()) {
			pilha.pop();
		}
	}

	private boolean restouApenasFundoDePilha() {
		return pilha.size() == 1 && pilha.get(0).equals(FUNDO_PILHA);
	}

	@Override
	public List<String> getSimbolos() {
		return characters;
	}

	@Override
	public List<String> getEstados() {
		return estados;
	}

	@Override
	public Boolean getEstadoExecucao() {
		return estadoExecucao;
	}

}
