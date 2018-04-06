package br.org.fundatec.lp1.testEx5;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex5.ContaCorrente;

public class TestaContaCorrente {
	
	private ContaCorrente corrente;
	
	@Before
	public void setUp() throws Exception{
		ContaCorrente contaCorrente = new ContaCorrente(2, 500);
		this.corrente = contaCorrente;
	}
	
	@Test
	public void TestaAplicaTaxaDeAplicacao() {
		Assert.assertEquals(510, this.corrente.aplicaTaxaDeAplicacao());
	}
	
	@Test
	public void TestaModificaTaxaDeAplicacao() {
		Assert.assertEquals(4, this.corrente.modificaTaxaDeAplicacao());
	}
	
	@Test
	public void TestaDeposito() {
		Assert.assertEquals(520, this.corrente.depositar(20));
	}
	
	@Test
	public void TestaSacar() {
		Assert.assertEquals(480, this.corrente.sacar(20));
	}
}
