package br.fundatec.lp1.herancaEx1;

public class Professor extends Pessoa {

	private int numeroDeTurmas;
	private int horas;

	public Professor(String nome, int idade, String cpf, int cotaDeImpressao) {
		super(nome, idade, cpf, cotaDeImpressao);
	}

	public int getNumeroDeTurmas() {
		return numeroDeTurmas;
	}

	public void setNumeroDeTurmas(int numeroDeTurmas) {
		this.numeroDeTurmas = numeroDeTurmas;
	}

	public int getHoras() {
		return horas;
	}

	public void setHoras(int horas) {
		this.horas = horas;
	}

	@Override
	public void adicionaCotasDeImpressao() {
		this.cotaDeImpressao = this.cotaDeImpressao + 50;
	}

}
