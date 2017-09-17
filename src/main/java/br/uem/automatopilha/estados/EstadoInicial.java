package br.uem.automatopilha.estados;

import java.awt.Color;

import javax.swing.JPanel;

/**
 *
 * @author Fernando
 */
public class EstadoInicial implements Estado {

	@Override
	public Boolean isEstadoInicial() {
		return true;
	}

	@Override
	public Boolean isEstadoItermediario() {
		return false;
	}

	@Override
	public Boolean isEstadoFinal() {
		return false;
	}

	@Override
	public void atualizarView(JPanel panelEstadoAtual, JPanel panelEstadoAnterior) {
		panelEstadoAtual.setBackground(Color.GREEN);
		panelEstadoAtual.updateUI();
	}

}
