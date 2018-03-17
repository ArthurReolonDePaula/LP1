package br.fundatec.lp1.abstracaoEx1;

public class Mesa extends Venda {

	private int numeroCadeiras;
	private String formato;
	
	public Mesa(double preco, int codigoDoProduto, String material) {
		super(preco, codigoDoProduto, material);
	}

	public int getNumeroCadeiras() {
		return numeroCadeiras;
	}

	public void setNumeroCadeiras(int numeroCadeiras) {
		this.numeroCadeiras = numeroCadeiras;
	}

	public String getFormato() {
		return formato;
	}

	public void setFormato(String formato) {
		this.formato = formato;
	}
	
	
}
