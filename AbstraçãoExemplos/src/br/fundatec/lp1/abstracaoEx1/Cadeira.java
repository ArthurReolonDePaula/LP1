package br.fundatec.lp1.abstracaoEx1;

public class Cadeira extends Venda{

	private boolean almofada;
	private boolean descancoBraco;
	
	public Cadeira(double preco, int codigoDoProduto, String material) {
		super(preco, codigoDoProduto, material);
	}

	public boolean isAlmofada() {
		return almofada;
	}

	public void setAlmofada(boolean almofada) {
		this.almofada = almofada;
	}

	public boolean isDescancoBraco() {
		return descancoBraco;
	}

	public void setDescancoBraco(boolean descancoBraco) {
		this.descancoBraco = descancoBraco;
	}


	
	
	
	
	
	
	
	
}
