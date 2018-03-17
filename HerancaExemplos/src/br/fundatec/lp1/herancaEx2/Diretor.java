package br.fundatec.lp1.herancaEx2;

public class Diretor extends Empregado{

	public Diretor(String nome, String cpf, double salario) {
		super(nome, cpf, salario);
	}

	@Override
	public void bonificacaoSalario() {
		super.bonificacaoSalario();
		this.salario = this.salario + (this.salario * 0.20) + 1000;
	}

	
}
