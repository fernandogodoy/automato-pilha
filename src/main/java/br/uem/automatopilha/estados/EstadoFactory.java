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
		List<String> primeiraMetade = AutomatoUtil.getFirstHalf(AutomatoUtil.toList(palavra));
		Integer currentPosition = (primeiraMetade.size() - current);
		if (currentPosition == primeiraMetade.size()) {
			return EstadoTransicao.INICIAL;
		} else if (currentPosition >= 0) {
			return EstadoTransicao.INTERMEDIARIO;
		} else {
			return EstadoTransicao.FINAL;
		}

	}

}
