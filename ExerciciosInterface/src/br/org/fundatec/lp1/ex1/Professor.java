package br.org.fundatec.lp1.ex1;

public class Professor implements CotaImpressao{
	private String nome;
	private String cpf;
	private int cotaImpressao;
	private double salario;
	
	public Professor(String nome, String cpf, int cotaImpressao, double salario) {
		this.nome = nome;
		this.cpf = cpf;
		this.cotaImpressao = cotaImpressao;
		this.salario = salario;
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

	public double getSalary() {
		return salario;
	}

	@Override
	public void adicionaCotaDeImpressao() {
		this.cotaImpressao = this.cotaImpressao + 100;
	}
	
	
}
