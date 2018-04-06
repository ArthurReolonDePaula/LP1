package br.org.fundatec.lp1.ex5;

public class ContaPoupanca implements Conta, Aplicacao {

	private int saldo;
	private int taxaPercentual;

	public ContaPoupanca(int saldo, int taxaPercentual) {
		super();
		this.saldo = saldo;
		this.taxaPercentual = taxaPercentual;
	}

	public int getSaldo() {
		return saldo;
	}

	public int getTaxaPercentual() {
		return taxaPercentual;
	}

	@Override
	public int aplicaTaxaDeAplicacao() {
		this.taxaPercentual = this.taxaPercentual * 2;
		this.saldo = this.saldo + (this.saldo * this.taxaPercentual / 100);
		return saldo;
	}

	@Override
	public int modificaTaxaDeAplicacao() {
		this.taxaPercentual = this.taxaPercentual * 3;
		return taxaPercentual;
	}

	@Override
	public int depositar(int valor) {
		this.saldo = this.saldo + valor;
		return saldo;
	}

	@Override
	public int sacar(int valor) {
		this.saldo = this.saldo - valor;
		return saldo;
	}

}
