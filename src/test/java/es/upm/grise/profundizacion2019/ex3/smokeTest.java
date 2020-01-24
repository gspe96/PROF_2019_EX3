package es.upm.grise.profundizacion2019.ex3;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class smokeTest {
	MyClass my;
	Time prueba;
	String deseado;
	
	@Before
	public void setUp() {
		my = new MyClass();
		prueba = new Time();
		deseado = "2020/01/01 00:02:00";
	}

	@Test
	public void smoleTest() {
		long SECONDS = 60;
		my.nextTime(SECONDS);
	}
	
	@Test
	public void testTimeAddition() {
		prueba.setTime("2020/01/01 00:00:00");
		String devuelto = prueba.getFutureTime(120);
		assertEquals(deseado, devuelto);
		
	}
	
}