package br.fundatec.lp1.abstracaoEx2;

public class Idoso extends Bilhete{

	public Idoso(double preco) {
		super(preco);
	}

	@Override
	public void modificador() {
		this.preco = this.preco - (this.preco * 0.50);
	}

	
	
}
