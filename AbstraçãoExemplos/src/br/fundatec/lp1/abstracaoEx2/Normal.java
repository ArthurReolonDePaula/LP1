package br.fundatec.lp1.abstracaoEx2;

public class Normal extends Bilhete{

	public Normal(double preco) {
		super(preco);
	}

	@Override
	public void modificador() {
		this.preco = this.preco - (this.preco * 0.05);
	}
	
	
}
