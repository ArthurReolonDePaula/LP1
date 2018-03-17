package br.fundatec.lp1.herancaEx2;

public class Estagiario extends Empregado {

	public Estagiario(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void bonificacaoSalario() {
		super.bonificacaoSalario();
		this.salario = this.salario + 100;
	}
}
