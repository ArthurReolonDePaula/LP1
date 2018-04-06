package br.org.fundatec.lp1.ex3;

public class Led extends CaracteristicaLampada{

	public Led(int quilowhat, int potencia) {
		super(quilowhat, potencia);
	}

	@Override
	public boolean Ligar() {
		if(!isStatus()) {
			setStatus(true);
			return true;
		}
		return false;
	}

	@Override
	public boolean desligar() {
		if(isStatus()) {
			setStatus(false);
			return false;
		}
		return true;
	}

	@Override
	public double CalcularConsumo() {
		double consumo = (getQuilowhat() * getPotencia()) *0.4;
		return consumo;
	}

	
}
