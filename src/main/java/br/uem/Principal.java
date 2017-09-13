package br.uem;

import br.uem.automatopilha.AutomatoPilha;
import br.uem.automatopilha.AutomatoPilhaImpl;

/**
 * Alfabeto = {0,1}
 * 
 * Expressão: {0n,1n} | n > 0
 * 
 * 
 * @author Fernando
 *
 */
public class Principal {

	private static final String PALAVRA = "000000111111";

	public static void main(String[] args) {
		AutomatoPilha automatoPilha = new AutomatoPilhaImpl(PALAVRA);
		automatoPilha.run();
	}

}
