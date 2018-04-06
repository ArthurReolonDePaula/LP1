package br.org.fundatec.lp1.ex1;

public class Main {
	public static void main(String[] args) {
		Estudante arthur = new Estudante("Arthur", "03614568958", 50);
		Professor everton = new Professor("Everton", "12546958752", 50, 2500);
		
		System.out.println("Cotas de impressão do professor " + everton.getNome() + ": " + everton.getCotaImpressao() );
		System.out.println(" ");
		everton.adicionaCotaDeImpressao();
		System.out.println("Cotas de impressão do professor com o bônus de cotas: " + everton.getCotaImpressao());
		
		System.out.println("-------------------------------------------------------------------------------------------------");
		
		System.out.println("Cotas de impressão do estudante " + arthur.getNome() + ": " + arthur.getCotaImpressao());
		System.out.println(" ");
		arthur.adicionaCotaDeImpressao();
		System.out.println("Cotas de impressao do estudante com o bônus de cotas: " + arthur.getCotaImpressao());
	}
}
