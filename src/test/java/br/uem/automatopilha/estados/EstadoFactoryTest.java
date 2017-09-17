package br.uem.automatopilha.estados;

import org.junit.Assert;
import org.junit.Test;

public class EstadoFactoryTest {

	@Test
	public void deveriaRetornarEstadoInicial() {
		Integer index = 0;
		String palavra = "01";
		Estado estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoInicial);;
	}
	
	@Test
	public void deveriaRetornarEstadoIntermediarioAlfabeto01() {
		Integer index = 1;
		String palavra = "01";
		Estado estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoIntermediario);
	}
	
	@Test
	public void deveriaRetornarEstadoFinalAlfabeto01() {
		Integer index = 2;
		String palavra = "01";
		Estado estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoFinal);
	}
	
	@Test
	public void deveriaRetornarEstadoIntermediarioAlfabeto0101() {
		Integer index = 1;
		String palavra = "0101";
		Estado estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoIntermediario);
		
		index = 2;
		estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoIntermediario);
	}
	
	@Test
	public void deveriaRetornarEstadoFinalAlfabeto0101() {
		Integer index = 3;
		String palavra = "0101";
		Estado estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoFinal);
		
		index = 4;
		estado = new EstadoFactory().factory(index, palavra);
		Assert.assertTrue(estado instanceof EstadoFinal);
	}
	

}
