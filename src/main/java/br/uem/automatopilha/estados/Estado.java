package br.uem.automatopilha.estados;

import javax.swing.JPanel;

/**
 *
 * @author Fernando
 */
public interface Estado {

    Boolean isEstadoInicial();
    
    Boolean isEstadoItermediario();
    
    Boolean isEstadoFinal();

	void atualizarView(JPanel panelEstadoAtual, JPanel panelEstadoAnterior);


}
