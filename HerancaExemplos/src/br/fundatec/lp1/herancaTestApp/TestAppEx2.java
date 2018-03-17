package br.fundatec.lp1.herancaTestApp;

import br.fundatec.lp1.herancaEx2.Diretor;
import br.fundatec.lp1.herancaEx2.Estagiario;
import br.fundatec.lp1.herancaEx2.Gerente;
import br.fundatec.lp1.herancaEx2.Junior;
import br.fundatec.lp1.herancaEx2.Senior;

public class TestAppEx2 {
	public static void main(String[] args) {
		
		Estagiario joao = new Estagiario("João", "02565895625", 1000.0);
		Junior douglas = new Junior ("Douglas", "02103625658", 2000.0);
		Senior vitor = new Senior ("Vitor", "03625625785", 3000.0);
		Gerente nathalia = new Gerente("Nathalia", "02845698502", 4000.0);
		Diretor arthur = new Diretor("Arthur", "03614256985", 5000.0);
		
		System.out.println("ESTAGIARIO:");
		System.out.println("Salário do estagiario " + joao.nome + " ANTES da bonificação: " + joao.salario);
		joao.bonificacaoSalario();
		System.out.println("Salário DEPOIS da bonificação: " + joao.salario);
		
		System.out.println("------------------------------------------------------------------------------");
		
		System.out.println("JUNIOR:");
		System.out.println("Salário do junior " + douglas.nome + " ANTES da bonificação: " + douglas.salario);
		douglas.bonificacaoSalario();
		System.out.println("Salario DEPOIS da bonificação: " + douglas.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("SENIOR:");
		System.out.println("Salário do senior " + vitor.nome + " ANTES da bonificação: " + vitor.salario);
		vitor.bonificacaoSalario();
		System.out.println("Salário DEPOIS da bonificação: " + vitor.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("GERENTE:");
		System.out.println("Salário do gerente " + nathalia.nome + " ANTES da bonificação: " + nathalia.salario);
		nathalia.bonificacaoSalario();
		System.out.println("Salário DEPOIS da bonificação " + nathalia.salario);
		
		System.out.println("-------------------------------------------------------------------------------");
		
		System.out.println("DIRETOR:");
		System.out.println("Salário do diretor " + arthur.nome + " ANTES da bonificação: " + arthur.salario);
		arthur.bonificacaoSalario();
		System.out.println("Salario DEPOIS da bonificiação " + arthur.salario);
	}
}
