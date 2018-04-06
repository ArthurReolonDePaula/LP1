package br.org.fundatec.lp1.testEx4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex4.Quadrilatero;

public class TesteQuadrilatero {
	private Quadrilatero quadrilatero;
	
	@Before
	public void setUp() throws Exception{
		Quadrilatero quadrilatero = new Quadrilatero(2, 2);
		this.quadrilatero = quadrilatero;
	}
	
	@Test
	public void testCalculaAreaQuadrilatero() {
		Assert.assertEquals(4,  this.quadrilatero.calcularArea());
	}
	
	@Test
	public void testaNomeQuadrilatero() {
		Assert.assertEquals("Quadrilatero", this.quadrilatero.nomeGeometrico());
	}
}
