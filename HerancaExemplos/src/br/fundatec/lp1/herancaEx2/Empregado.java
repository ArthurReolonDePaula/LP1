package br.fundatec.lp1.herancaEx2;

public class Empregado {

	public String nome;
	public String cpf;
	public double salario;

	public Empregado(String nome, String cpf, double salario) {
		super();
		this.nome = nome;
		this.cpf = cpf;
		this.salario = salario;
	}

	public String getNome() {
		return nome;
	}

	public String getCpf() {
		return cpf;
	}

	public double getSalario() {
		return salario;
	}

	public void bonificacaoSalario() {
		this.salario = this.salario + (this.salario * 0.10);
	}
}
