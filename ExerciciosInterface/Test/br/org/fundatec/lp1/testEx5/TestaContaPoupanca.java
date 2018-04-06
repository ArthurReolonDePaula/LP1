package br.org.fundatec.lp1.testEx5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex5.ContaPoupanca;

public class TestaContaPoupanca {
	
	private ContaPoupanca poupanca;
	
	@Before
	public void setUp() throws Exception{
		ContaPoupanca contaPoupanca = new ContaPoupanca(1000, 4);
		this.poupanca = contaPoupanca;
	}
	
	@Test
	public void testaAplicaTaxaDeAplicacao() {
		Assert.assertEquals(1080, this.poupanca.aplicaTaxaDeAplicacao());
	}
	
	@Test
	public void testaModificaTaxaDeAplicacao() {
		Assert.assertEquals(12,this.poupanca.modificaTaxaDeAplicacao());
	}
	
	@Test
	public void testaDepositar() {
		Assert.assertEquals(1100, this.poupanca.depositar(100));
	}
	
	@Test
	public void testaSacar() {
		Assert.assertEquals(500, this.poupanca.sacar(500));
	}
}
