package br.fundatec.lp1.abstracaoEx1;

public class Lustre extends Venda{
	
	private String formato;
	private boolean ilumina��o;
	
	public Lustre(double preco, int codigoDoProduto, String material) {
		super(preco, codigoDoProduto, material);
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isIlumina��o() {
		return ilumina��o;
	}

	public void setIlumina��o(boolean ilumina��o) {
		this.ilumina��o = ilumina��o;
	}
	
	
}
