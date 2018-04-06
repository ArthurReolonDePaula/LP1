package br.org.fundatec.lp1.testEx4;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex4.Triangulo;

public class TesteTriangulo {
	
	private Triangulo triangulo;
	
	@Before
	public void setUp() throws Exception{
		Triangulo triangulo = new Triangulo(4, 8);
		this.triangulo = triangulo;
	}
	
	@Test
	public void TestaCalculaAreaTriangulo() {
		Assert.assertEquals(16, this.triangulo.calcularArea());
	}
	
	@Test
	public void TestaNomeTriangulo() {
		Assert.assertEquals("Triangulo", this.triangulo.nomeGeometrico());
	}
}
