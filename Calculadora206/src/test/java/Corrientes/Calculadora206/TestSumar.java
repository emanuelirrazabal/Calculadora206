package Corrientes.Calculadora206;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class TestSumar {

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}

	@Test
	public void test() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(2,2);
		assertEquals(4,resultado);
		
	}
	
	@Test
	public void test2() {
		Calculadora c = new Calculadora();
		int resultado = c.sumar(Integer.MAX_VALUE,Integer.MAX_VALUE);
		assertEquals(Integer.MAX_VALUE,resultado);
		
	}

}
