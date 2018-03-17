package br.fundatec.lp1.abstracaoApp;

import br.fundatec.lp1.abstracaoEx1.Cadeira;
import br.fundatec.lp1.abstracaoEx1.Mesa;
import br.fundatec.lp1.abstracaoEx1.Lustre;
import br.fundatec.lp1.abstracaoEx1.Sofa;

public class AppTestEx1 {
	public static void main(String[] args) {

		Cadeira cadeira = new Cadeira(180.00, 663, "Madeira");
		Mesa mesa = new Mesa(200.00, 664, "Madeira R�stica");
		Sofa sofa = new Sofa(799.00, 665, "Couro");
		Lustre lustre = new Lustre(500.00, 666, "Vidro");

		cadeira.setAlmofada(false);
		cadeira.setDescancoBraco(false);
		System.out.println("A cadeira n�o possui almofadas e descan�o de bra�o, � feita de " 
		+ cadeira.getMaterial() + " e custa " + cadeira.getPreco() + " Reais.");
		
		System.out.println(" ");
		
		mesa.setFormato("quadrado");
		mesa.setNumeroCadeiras(6);
		System.out.println("A mesa tem um formato " + mesa.getFormato() + " com " + mesa.getNumeroCadeiras() 
		+ " cadeiras e � feita de " + mesa.getMaterial() + ". Custa " + mesa.getPreco() + " Reais.");
		
		System.out.println(" ");
		
		sofa.setBracoDescanso(true);
		sofa.setNumeroLugares(4);
		System.out.println("Esse sof� tem " + sofa.getNumeroLugares() + " lugares com descan�o para bra�o, "
				+ "feito de " + sofa.getMaterial() + ".Custa " + sofa.getPreco() + "Reais.");
		
		System.out.println(" ");
		
		lustre.setFormato("Redondo");
		lustre.setIlumina��o(true);
		System.out.println("O lustre possui um formato " + lustre.getFormato() + " possui ilumina��o. Feito de " 
		+ lustre.getMaterial() + " custando " + lustre.getPreco() + " Reais.");
	}
}
