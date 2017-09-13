package br.uem.automatopilha.observer;

import br.uem.automatopilha.AutomatoPilha;

/**
 * 
 * @author Fernando
 *
 */
public class Observer {

	private AutomatoPilha sujeito;

	public Observer(AutomatoPilha sujeito) {
		this.sujeito = sujeito;
	}

	public void update() {
		Boolean estado = sujeito.getEstadoExecucao();
		if (estado) {
			System.out.println("Palavra Aceita!");
		} else {
			System.out.println("Palavra Rejeitada!");
		}

	}

}
