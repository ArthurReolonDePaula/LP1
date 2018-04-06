package br.org.fundatec.lp1.testEx4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex4.Circulo;


public class TesteCirculo {
	private Circulo circulo;
	
	@Before
	public void setUp() throws Exception {
		Circulo circulo = new Circulo(20);
		this.circulo = circulo;
	}
	
	@Test
	public void testaCalculaAreaCircule() {
		Assert.assertEquals(1256,circulo.calcularArea());
	}
	
	@Test
	public void TestaNomeCirculo() {
		Assert.assertEquals("Circulo", this.circulo.nomeGeometrico());
	}
}
