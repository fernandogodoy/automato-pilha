package br.uem.automatopilha;

import java.util.List;

/**
 * 
 * @author Fernando
 *
 */
public interface AutomatoPilha {

	Boolean run();

	List<String> getSimbolos();

	List<String> getEstados();

	Boolean getEstadoExecucao();
	
	Boolean isValidSize();

}
