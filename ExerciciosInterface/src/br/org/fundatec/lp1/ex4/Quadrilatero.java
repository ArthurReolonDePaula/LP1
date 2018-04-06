package br.org.fundatec.lp1.ex4;

public class Quadrilatero implements FiguraGeometrica{
	
	private int lado1;
	private int lado2;
	
	public Quadrilatero(int lado1, int lado2) {
		super();
		this.lado1 = lado1;
		this.lado2 = lado2;
	}

	public int getLado1() {
		return lado1;
	}

	public int getLado2() {
		return lado2;
	}

	@Override
	public int calcularArea() {
		int area = (this.lado1 * this.lado2);
		return area;
	}

	@Override
	public String nomeGeometrico() {
		return "Quadrilatero";
	}
	
	
	
}
