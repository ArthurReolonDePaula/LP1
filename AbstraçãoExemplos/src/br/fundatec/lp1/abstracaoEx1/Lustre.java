package br.fundatec.lp1.abstracaoEx1;

public class Lustre extends Venda{
	
	private String formato;
	private boolean iluminação;
	
	public Lustre(double preco, int codigoDoProduto, String material) {
		super(preco, codigoDoProduto, material);
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}

	public boolean isIluminação() {
		return iluminação;
	}

	public void setIluminação(boolean iluminação) {
		this.iluminação = iluminação;
	}
	
	
}
