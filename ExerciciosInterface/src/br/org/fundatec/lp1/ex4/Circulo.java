package br.org.fundatec.lp1.ex4;

public class Circulo implements FiguraGeometrica{

	private int raio;

	public Circulo(int raio) {
		super();
		this.raio = raio;
	}

	public double getRaio() {
		return raio;
	}

	@Override
	public int calcularArea() {
		int area = (int) (Math.pow(this.raio, 2) * Math.PI);
		return area;
	}

	@Override
	public String nomeGeometrico() {
		return "Circulo";
	}
	
	
}
