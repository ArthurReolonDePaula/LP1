package br.org.fundatec.lp1.ex4;

public class Triangulo implements FiguraGeometrica{

	private int base;
	private int altura;
	
	public Triangulo(int base, int altura) {
		super();
		this.base = base;
		this.altura = altura;
	}

	public int getBase() {
		return base;
	}

	public int getAltura() {
		return altura;
	}

	@Override
	public int calcularArea() {
		int area = (this.base * this.altura) /2;
		return area;
	}

	@Override
	public String nomeGeometrico() {
		return "Triangulo";
	}
	
	
}
