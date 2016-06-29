package co.usbcali.com.calculadora;

import co.usbcali.com.calculadora.suport.Calculadora;
import static org.junit.Assert.*;
import junit.framework.Assert;

import org.junit.Test;

public class CalculadoraTest {

	Icalculadora calculadora;

	@Test
	public void testa() {
		calculadora = new Calculadora();
		calculadora.sumar(3, 4);
		assertEquals(calculadora.getresultado(), 7);
		// fail("Not yet implemented");
	}

	@Test
	public void testb() {
		calculadora = new Calculadora();
		calculadora.restar(123, 20);
		assertEquals(calculadora.getresultado(), 103);
		// fail("Not yet implemented");
	}
}
