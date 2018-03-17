package br.fundatec.lp1.herancaEx1;

public class Pessoa {

	protected String nome;
	protected int idade;
	protected String cpf;
	protected int cotaDeImpressao;

	public Pessoa(String nome, int idade, String cpf, int cotaDeImpressao) {
		super();
		this.nome = nome;
		this.idade = idade;
		this.cpf = cpf;
		this.cotaDeImpressao = cotaDeImpressao;
	}

	public String getNome() {
		return nome;
	}

	public int getIdade() {
		return idade;
	}

	public String getCpf() {
		return cpf;
	}

	public int getCotaDeImpressao() {
		return cotaDeImpressao;
	}

	public void adicionaCotasDeImpressao() {
	}
}
