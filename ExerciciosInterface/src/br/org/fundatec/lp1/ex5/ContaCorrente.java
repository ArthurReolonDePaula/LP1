package br.org.fundatec.lp1.ex5;

public class ContaCorrente implements Conta, Aplicacao{

	private int taxaPercentual;
	private int saldo;
	
	public ContaCorrente(int taxaPercentual, int saldo) {
		super();
		this.taxaPercentual = taxaPercentual;
		this.saldo = saldo;
	}

	public int getTaxaPercentual() {
		return taxaPercentual;
	}

	public int getSaldo() {
		return saldo;
	}

	@Override
	public int aplicaTaxaDeAplicacao() {
		this.saldo = this.saldo + (this.saldo * this.taxaPercentual/100);
		return saldo;
	}

	@Override
	public int modificaTaxaDeAplicacao() {
		this.taxaPercentual = this.taxaPercentual * 2;
		return taxaPercentual;
	}

	@Override
	public int depositar(int valor) {
		this.saldo = this.saldo + valor;
		return saldo;
	}

	@Override
	public int sacar(int valor) {
		this.saldo =this.saldo - valor;
		return saldo;
	}
	
	
	
}
