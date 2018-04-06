package br.org.fundatec.lp1.testEx3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex3.Incandecente;

public class TestIncandescente {

	private Incandecente incandecente;
	
	@Before
	public void setUp() throws Exception{
		Incandecente incandecente = new Incandecente(5, 8);
		this.incandecente = incandecente;
	}
	
	@Test
	public void TesteLigado() {
		this.incandecente.Ligar();
		Assert.assertEquals(true, this.incandecente.isStatus());
	}
	
	@Test
	public void TesteDesligado() {
		this.incandecente.desligar();
		Assert.assertEquals(false, this.incandecente.isStatus());
	}
	
	@Test
	public void testeCalculaConsumo() {
		Assert.assertEquals(new Double(40), new Double(this.incandecente.CalcularConsumo()));
	}
}
