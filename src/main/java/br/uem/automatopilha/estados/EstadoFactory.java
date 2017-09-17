package br.uem.automatopilha.estados;

import java.util.List;

import br.uem.automatopilha.view.util.AutomatoUtil;

/**
 *
 * @author Fernando
 */
public class EstadoFactory {

	public Estado factory(Integer posicaoAtual, String palavra) {
		EstadoTransicao estadoTransicao = EstadoTransicao.getCurrent(posicaoAtual, palavra);
		return estadoTransicao.getInstance();
	}
}

enum EstadoTransicao {

	INICIAL {
		@Override
		public Estado getInstance() {
			return new EstadoInicial();
		}
	},
	INTERMEDIARIO {
		@Override
		public Estado getInstance() {
			return new EstadoIntermediario();
		}
	},
	FINAL {
		@Override
		public Estado getInstance() {
			return new EstadoFinal();
		}
	};

	public abstract Estado getInstance();

	public static EstadoTransicao getCurrent(Integer current, String palavra) {
		List<String> firstHalf = AutomatoUtil.getFirstHalf(AutomatoUtil.toList(palavra));
		Integer currentPosition = (firstHalf.size() - current);
	
		if (currentPosition == firstHalf.size()) {
			return EstadoTransicao.INICIAL;
		} else if (currentPosition >= 0) {
			return EstadoTransicao.INTERMEDIARIO;
		} else {
			return EstadoTransicao.FINAL;
		}

	}

}
