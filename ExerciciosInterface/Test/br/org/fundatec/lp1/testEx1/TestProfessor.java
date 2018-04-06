package br.org.fundatec.lp1.testEx1;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex1.Professor;

public class TestProfessor {

	private Professor professorTest;
	
	@Before
	public void setUp() throws Exception {
		Professor professor = new Professor("Thiago", "02136559863", 50, 3000);
		this.professorTest = professor;
	}

	@Test
	public void deveTestarCotaImpressaoDoProfessor() {
		professorTest.adicionaCotaDeImpressao();
		Assert.assertEquals(150, professorTest.getCotaImpressao());
	}
}
