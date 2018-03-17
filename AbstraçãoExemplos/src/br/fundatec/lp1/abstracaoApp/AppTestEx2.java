package br.fundatec.lp1.abstracaoApp;

import br.fundatec.lp1.abstracaoEx2.Estudante;
import br.fundatec.lp1.abstracaoEx2.Idoso;
import br.fundatec.lp1.abstracaoEx2.Normal;
import br.fundatec.lp1.abstracaoEx2.Parceiro;

public class AppTestEx2 {
	public static void main(String[] args) {
	
	Normal normal = new Normal(30);
	Estudante estudante = new Estudante(30);
	Parceiro parceiro = new Parceiro(30);
	Idoso idoso = new Idoso(30);
	
	idoso.modificador();
	System.out.println("Idoso teve " + idoso.getPreco() + " Reais de desconto.");
	
	System.out.println(" ");
	
	estudante.modificador();
	System.out.println("Estudante teve " + estudante.getPreco() + " Reais de desconto.");
	
	System.out.println(" ");
	
	parceiro.modificador();
	System.out.println("Parceiro teve " + parceiro.getPreco() + " Reais de desconto.");
	
	System.out.println(" ");
	
	normal.modificador();
	System.out.println("Pessoa normal teve " + normal.getPreco() + " Reais de desconto.");
	

	
	
	
	
	}
}
