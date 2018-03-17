package br.fundatec.lp1.abstracaoEx1;

abstract class Venda {
	private double preco;
	private int codigoDoProduto;
	private String Material;

	public Venda(double preco, int codigoDoProduto, String material) {
		super();
		this.preco = preco;
		this.codigoDoProduto = codigoDoProduto;
		Material = material;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}

	public int getCodigoDoProduto() {
		return codigoDoProduto;
	}

	public void setCodigoDoProduto(int codigoDoProduto) {
		this.codigoDoProduto = codigoDoProduto;
	}

	public String getMaterial() {
		return Material;
	}

	public void setMaterial(String material) {
		Material = material;
	}	
}
