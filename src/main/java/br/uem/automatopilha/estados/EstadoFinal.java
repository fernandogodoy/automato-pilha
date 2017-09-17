package br.uem.automatopilha.estados;

import java.awt.Color;

import javax.swing.JPanel;

public class EstadoFinal implements Estado {

	@Override
	public Boolean isEstadoInicial() {
		return false;
	}

	@Override
	public Boolean isEstadoItermediario() {
		return false;
	}

	@Override
	public Boolean isEstadoFinal() {
		return true;
	}

	@Override
	public void atualizarView(JPanel panelEstadoAtual, JPanel panelEstadoAnterior) {
		panelEstadoAnterior.setBackground(null);
		panelEstadoAnterior.updateUI();
		panelEstadoAtual.setBackground(Color.GREEN);
		panelEstadoAtual.updateUI();
		
	}

}
