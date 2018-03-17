package br.fundatec.lp1.abstracaoEx2;

abstract class Bilhete {
	
	protected double preco;

	public Bilhete(double preco) {
		super();
		this.preco = preco;
	}

	public double getPreco() {
		return preco;
	}
	
	abstract void modificador();
	
}
