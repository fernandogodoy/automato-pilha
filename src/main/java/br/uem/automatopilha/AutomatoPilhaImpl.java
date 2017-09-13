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

public class AutomatoPilhaImpl implements AutomatoPilha {

	private Boolean estadoExecucao;
	private Observer observer = new Observer(this);

	private static final String FUNDO_PILHA = "#";
	private static final String SEGUNDA_PARTE = "SEGUNDA_PARTE";
	private static final String PRIMEIRA_PARTE = "PRIMEIRA_PARTE";

	private static final List<String> ALFABETO = Arrays.asList("0", "1");

	private List<String> characters;
	private List<String> estados;
	private Stack<String> pilha = new Stack<>();

	public AutomatoPilhaImpl(String palavra) {
		pilha.push(FUNDO_PILHA);
		this.characters = new LinkedList<>(Arrays.asList(palavra.split("\\B")));
		this.estados = Stream.iterate(0, size -> ++size)
				.map(size -> String.format("q%s", size))
				.limit(characters.size())
				.collect(Collectors.toCollection(LinkedList::new));
	}

	@Override
	public Boolean run() {
		start();
		return getEstadoExecucao();
	}

	private void start() {
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
		map.put(PRIMEIRA_PARTE, characters.subList(0, characters.size() / 2));
		map.put(SEGUNDA_PARTE, characters.subList(characters.size() / 2, characters.size()));

		if (map.get(PRIMEIRA_PARTE).size() != map.get(SEGUNDA_PARTE).size()) {
			throw new AutomatoPilhaException();
		}

		return map;
	}

	private void empilhar(List<String> primeiraParte, String estado) {
		primeiraParte.stream()
			.filter(simbolo -> ALFABETO.contains(simbolo))
			.forEach(pilha::push);
	}

	private void desempilhar(List<String> segundaParte, String estado) {
		segundaParte.stream()
				.filter(simbolo -> ALFABETO.contains(simbolo))
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
