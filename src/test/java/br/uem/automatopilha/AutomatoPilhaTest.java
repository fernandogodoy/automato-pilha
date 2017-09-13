package br.uem.automatopilha;

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import java.util.Arrays;

import org.junit.Assert;
import org.junit.Test;

public class AutomatoPilhaTest {

	@Test
	public void deveriaAceitarPalavra0011() {
		AutomatoPilha executar = new AutomatoPilhaImpl("0011");
		Boolean isAceita = executar.run();
		assertTrue(isAceita);
	}

	@Test
	public void deveriaRejeitarPalavra0101() {
		AutomatoPilha executar = new AutomatoPilhaImpl("0101");
		Boolean isAceita = executar.run();
		assertFalse(isAceita);
	}

	@Test
	public void deveriaRejeitarPalavra00111() {
		AutomatoPilha executar = new AutomatoPilhaImpl("00111");
		Boolean isAceita = executar.run();
		assertFalse(isAceita);
	}

	@Test
	public void deveriaAceitarPalavra01() {
		AutomatoPilha executar = new AutomatoPilhaImpl("01");
		Boolean isAceita = executar.run();
		assertTrue(isAceita);
	}

	@Test
	public void deveriaRejeitarPalavra0() {
		AutomatoPilha executar = new AutomatoPilhaImpl("0");
		Boolean isAceita = executar.run();
		assertFalse(isAceita);
	}

	@Test
	public void deveriaRejeitarPalavra1() {
		AutomatoPilha executar = new AutomatoPilhaImpl("1");
		Boolean isAceita = executar.run();
		assertFalse(isAceita);
	}

	@Test
	public void deveriaRejeitarPalavraNaoPertencenteAoAlfabeto() {
		AutomatoPilha executar = new AutomatoPilhaImpl("A");
		Boolean isAceita = executar.run();
		assertFalse(isAceita);
	}

	@Test
	public void deveriaValidarQtdCharacteres() {
		AutomatoPilha executar = new AutomatoPilhaImpl("01");
		Assert.assertEquals(2, executar.getSimbolos().size());
	}

	@Test
	public void deveriaValidarQtdEstados() {
		AutomatoPilha executar = new AutomatoPilhaImpl("01");
		Assert.assertEquals(2, executar.getEstados().size());
		Assert.assertEquals(Arrays.asList("q0", "q1"), executar.getEstados());
	}

}
