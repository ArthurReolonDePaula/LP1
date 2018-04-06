package br.org.fundatec.lp1.testEx3;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import br.org.fundatec.lp1.ex3.Led;

public class TesteLed {
	
	private Led led;
	
	@Before
	public void setUp() throws Exception{
		Led led = new Led(5,8);
		this.led = led;
	}
	
	@Test
	public void testeLigado() {
		this.led.Ligar();
		Assert.assertEquals(true, this.led.isStatus());
	}
	
	@Test
	public void testeOff() {
		this.led.desligar();
		Assert.assertEquals(false, this.led.isStatus());
	}
	
	@Test
	public void testCalcularConsumo() {
		Assert.assertEquals(new Double(16),new Double(this.led.CalcularConsumo()));
	}
}
