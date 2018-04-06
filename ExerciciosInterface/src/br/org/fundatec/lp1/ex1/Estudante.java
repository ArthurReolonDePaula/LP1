package br.org.fundatec.lp1.ex1;

public class Estudante implements CotaImpressao{

	private String nome;
	private String cpf;
	private int cotaImpressao;
	
	public Estudante(String nome, String cpf, int cotaImpressao) {
		this.nome = nome;
		this.cpf = cpf;
		this.cotaImpressao = cotaImpressao;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public int getCotaImpressao() {
		return cotaImpressao;
	}

	@Override
	public void adicionaCotaDeImpressao() {
		this.cotaImpressao = this.cotaImpressao + 50;
	}
	
	
}
