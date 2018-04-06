package br.org.fundatec.lp1.testEx3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex3.Fluorescente;

public class TesteFluorecente {
	
	private Fluorescente fluorescente;
	
	@Before
	public void setUp() throws Exception{
		Fluorescente fluorescente = new Fluorescente(2, 2);
		this.fluorescente = fluorescente;
	}
	
	@Test
	public void TesteLigado() {
		this.fluorescente.Ligar();
		Assert.assertEquals(true, this.fluorescente.isStatus());
	}
	
	@Test
	public void TesteDesligado() {
		this.fluorescente.desligar();
		Assert.assertEquals(false, this.fluorescente.isStatus());
	}
	
	@Test
	public void testCalcularConsumo() {
		Assert.assertEquals(new Double(2.8),new Double(this.fluorescente.CalcularConsumo()));
	}
}
