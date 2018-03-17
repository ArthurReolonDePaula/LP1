package br.fundatec.lp1.herancaTestApp;

import br.fundatec.lp1.herancaEx1.Estudante;
import br.fundatec.lp1.herancaEx1.Professor;

public class TestAppEx1 {
	public static void main(String[] args) {

		Estudante arthur = new Estudante("Arthur", 21, "03212456232", 20);
		Professor daniel = new Professor("Daniel", 30, "45625986954", 50);
		
		System.out.println("O estudante " + arthur.getNome() + " tinha " + arthur.getCotaDeImpressao() + " cotas de impressão.");
		arthur.adicionaCotasDeImpressao();
		System.out.println("Com o limite adicional ficou com " + arthur.getCotaDeImpressao() + " cotas de impressão.");
		
		System.out.println(" ");
		
		System.out.println("O professor " + daniel.getNome() + " tinha " + daniel.getCotaDeImpressao() + " cotas de impressão.");
		daniel.adicionaCotasDeImpressao();
		System.out.println("Com o limite adicional ficou com " + daniel.getCotaDeImpressao() + " cotas de impressão.");
	}
}
