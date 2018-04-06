package br.org.fundatec.lp1.testEx2;

import br.org.fundatec.lp1.ex2.Empregado;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class TestFuncionario {
	
	private Empregado empregado;
	
	@Before
	public void setUp() throws Exception{
		Empregado empregado = new Empregado(18, 10, " ");
		this.empregado = empregado;
	}
	
	@Test
	public void TestaSalarioEmpregado() {
		Assert.assertEquals(3600, this.empregado.CalcularSalario());
	}
	
}
