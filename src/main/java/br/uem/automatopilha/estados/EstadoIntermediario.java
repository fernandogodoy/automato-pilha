package br.uem.automatopilha.estados;

import java.awt.Color;

import javax.swing.JPanel;

public class EstadoIntermediario implements Estado {

	@Override
	public Boolean isEstadoInicial() {
		return false;
	}

	@Override
	public Boolean isEstadoItermediario() {
		return true;
	}

	@Override
	public Boolean isEstadoFinal() {
		return false;
	}

	@Override
	public void atualizarView(JPanel panelEstadoAtual, JPanel panelEstadoAnterior) {
		panelEstadoAnterior.setBackground(null);
		panelEstadoAnterior.updateUI();
		panelEstadoAtual.setBackground(Color.GREEN);
		panelEstadoAtual.updateUI();

	}

}
