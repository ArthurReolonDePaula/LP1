package br.fundatec.lp1.abstracaoEx2;

public class Parceiro extends Bilhete{

	public Parceiro(double preco) {
		super(preco);
	}

	@Override
	public void modificador() {
		this.preco = this.preco - (this.preco * 0.25);
	}
}
