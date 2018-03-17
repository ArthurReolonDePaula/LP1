package br.fundatec.lp1.abstracaoEx1;

public class Sofa extends Venda{

	private int numeroLugares;
	private boolean bracoDescanso;
	
	public Sofa(double preco, int codigoDoProduto, String material) {
		super(preco, codigoDoProduto, material);
	}

	public int getNumeroLugares() {
		return numeroLugares;
	}

	public void setNumeroLugares(int numeroLugares) {
		this.numeroLugares = numeroLugares;
	}

	public boolean isBracoDescanso() {
		return bracoDescanso;
	}

	public void setBracoDescanso(boolean bracoDescanso) {
		this.bracoDescanso = bracoDescanso;
	}


	
	
}
