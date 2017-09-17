package br.uem.automatopilha.view;

import java.util.Collections;
import java.util.Stack;

import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableModel;

/**
 *
 * @author Fernando
 */
public class TableModelPilha extends AbstractTableModel implements TableModel {

	private static final long serialVersionUID = 1L;

	private Stack<String> pilha = new Stack<>();

	public void empilhar(String item) {
		pilha.push(item);
	}

	public String desempilhar() {
		return pilha.pop();
	}

	@Override
	public String getColumnName(int column) {
		return "Stack";
	}

	@Override
	public int getRowCount() {
		return pilha.size();
	}

	@Override
	public int getColumnCount() {
		return 1;
	}

	@Override
	public String getValueAt(int rowIndex, int columnIndex) {
		Collections.reverse(pilha);
		String row = pilha.get(rowIndex);
		Collections.reverse(pilha);
		return row;
	}

	public Stack<String> getPilha() {
		return pilha;
	}

}
