package br.org.fundatec.lp1.ex3;

public abstract class CaracteristicaLampada implements Lampada {

	private int quilowhat;
	private int potencia;
	private boolean status;

	public CaracteristicaLampada(int quilowhat, int potencia) {
		this.quilowhat = quilowhat;
		this.potencia = potencia;
	}

	public int getQuilowhat() {
		return quilowhat;
	}

	public int getPotencia() {
		return potencia;
	}

	public boolean isStatus() {
		return status;
	}

	public void setStatus(boolean status) {
		this.status = status;
	}
}
