package br.fundatec.lp1.herancaTestApp;

import br.fundatec.lp1.herancaEx2.Diretor;
import br.fundatec.lp1.herancaEx2.Estagiario;
import br.fundatec.lp1.herancaEx2.Gerente;
import br.fundatec.lp1.herancaEx2.Junior;
import br.fundatec.lp1.herancaEx2.Senior;

public class TestAppEx2 {
	public static void main(String[] args) {
		
		Estagiario joao = new Estagiario("Jo�o", "02565895625", 1000.0);
		Junior douglas = new Junior ("Douglas", "02103625658", 2000.0);
		Senior vitor = new Senior ("Vitor", "03625625785", 3000.0);
		Gerente nathalia = new Gerente("Nathalia", "02845698502", 4000.0);
		Diretor arthur = new Diretor("Arthur", "03614256985", 5000.0);
		
		System.out.println("ESTAGIARIO:");
		System.out.println("Sal�rio do estagiario " + joao.nome + " ANTES da bonifica��o: " + joao.salario);
		joao.bonificacaoSalario();
		System.out.println("Sal�rio DEPOIS da bonifica��o: " + joao.salario);
		
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("JUNIOR:");
		System.out.println("Sal�rio do junior " + douglas.nome + " ANTES da bonifica��o: " + douglas.salario);
		douglas.bonificacaoSalario();
		System.out.println("Salario DEPOIS da bonifica��o: " + douglas.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("SENIOR:");
		System.out.println("Sal�rio do senior " + vitor.nome + " ANTES da bonifica��o: " + vitor.salario);
		vitor.bonificacaoSalario();
		System.out.println("Sal�rio DEPOIS da bonifica��o: " + vitor.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("GERENTE:");
		System.out.println("Sal�rio do gerente " + nathalia.nome + " ANTES da bonifica��o: " + nathalia.salario);
		nathalia.bonificacaoSalario();
		System.out.println("Sal�rio DEPOIS da bonifica��o " + nathalia.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("DIRETOR:");
		System.out.println("Sal�rio do diretor " + arthur.nome + " ANTES da bonifica��o: " + arthur.salario);
		arthur.bonificacaoSalario();
		System.out.println("Salario DEPOIS da bonificia��o " + arthur.salario);
	}
}
