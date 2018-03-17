package br.fundatec.lp1.abstracaoEx2;

public class Estudante extends Bilhete{

	public Estudante(double preco) {
		super(preco);
	}
	
	@Override
	public void modificador(){
		this.preco = this.preco - (this.preco *0.40);
	}
}
