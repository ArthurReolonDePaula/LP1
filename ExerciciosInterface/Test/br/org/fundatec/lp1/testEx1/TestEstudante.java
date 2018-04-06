package br.org.fundatec.lp1.testEx1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex1.Estudante;

public class TestEstudante {
	
	private Estudante estudanteTest;
	
	@Before
	public void setUp() throws Exception {
		Estudante arthur = new Estudante("Arthur", "025612545698", 50);
		this.estudanteTest = arthur;
	}
	
	@Test
	public void deveTestarCotaImpressaoDoEstudante() {
		estudanteTest.adicionaCotaDeImpressao();
		Assert.assertEquals(100, estudanteTest.getCotaImpressao());
	}
}
