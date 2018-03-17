package br.fundatec.lp1.herancaEx2;

public class Gerente extends Empregado {

	public Gerente(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void bonificacaoSalario() {
		super.bonificacaoSalario();
		this.salario = this.salario + (this.salario * 0.05);
		this.salario = this.salario + (this.salario * 0.18);
	}
}
