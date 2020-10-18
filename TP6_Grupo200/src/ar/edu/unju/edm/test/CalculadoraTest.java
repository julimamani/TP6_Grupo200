package ar.edu.unju.edm.test;

import org.junit.Test;

import ar.edu.unju.edm.model.Calculadora;
import junit.framework.TestCase;

public class CalculadoraTest extends TestCase {

//sumarTest
	@Test
	public void testSumar1() {
		Calculadora calculadora = new Calculadora(25,30);
		assertEquals(55.0,calculadora.sumarNum());
	}
	
	@Test
	public void testSumar2() {
		Calculadora calculadora = new Calculadora(6,14);
		assertEquals(20.0,calculadora.sumarNum());
	}
	
	@Test
	public void testSumar3() {
		Calculadora calculadora = new Calculadora(9,12);
		assertEquals(21.0,calculadora.sumarNum());
	}
	
//restarTest	
	@Test
	public void testRestar1() {
		Calculadora calculadora = new Calculadora(24,8);
		assertEquals(16.0,calculadora.restarNum());
	}
	
	@Test
	public void testRestar2() {
		Calculadora calculadora = new Calculadora(50,55);
		assertEquals(-5.0,calculadora.restarNum());
	}
	
	@Test
	public void testRestar3() {
		Calculadora calculadora = new Calculadora(-3,-8);
		assertEquals(5.0,calculadora.restarNum());
	}
	
//multiplicarTest	
	@Test
	public void testMultiplicar1() {
		Calculadora calculadora = new Calculadora(5,9);
		assertEquals(45.0,calculadora.multiplicarNum());
	}
	
	@Test
	public void testMultiplicar2() {
		Calculadora calculadora = new Calculadora(-3,4);
		assertEquals(-12.0,calculadora.multiplicarNum());
	}
	
	@Test
	public void testMultiplicar3() {
		Calculadora calculadora = new Calculadora(-5,-8);
		assertEquals(40.0,calculadora.multiplicarNum());
	}
	

//dividirTest
	@Test
	public void testDividir1() {
		Calculadora calculadora = new Calculadora(9,2);
		assertEquals(4.5,calculadora.dividirNum(),0);
	}
	
	@Test
	public void testDividir2() {
		Calculadora calculadora = new Calculadora(12,-3);
		assertEquals(-4.0,calculadora.dividirNum(),0);
	}
	
	@Test
	public void testDividir3() {
		Calculadora calculadora = new Calculadora(-3,2);
		assertEquals(-1.5,calculadora.dividirNum(),0);
	}
	
//obtenerMaximoValorTest
	
	
	@Test
	public void testObtenerMaximoValor1() {
		int[] numeros= {5,8,6,4,1};
		Calculadora calculadora = new Calculadora();
		assertEquals(8,calculadora.obtenerMaximoValor(numeros));
	}
	
	@Test
	public void testObtenerMaximoValor2() {
		int[] numeros= {9,8,9,2,9};
		Calculadora calculadora = new Calculadora();
		assertEquals(9,calculadora.obtenerMaximoValor(numeros));
	}

/*
 * {8,10,4,14,5} 10 -> son valores de la tabla para esta prueba, sin embargo, el maximo 
 * valor es 14, por ello como resutlado esperado pusimo 14 y no 10.
 */
	@Test
	public void testObtenerMaximoValor3() {
		int[] numeros= {8,10,4,14,5};
		Calculadora calculadora = new Calculadora();
		assertEquals(14,calculadora.obtenerMaximoValor(numeros));
	}
	
	@Test
	public void testObtenerMaximoValor4() {
		int[] numeros= {1,1,1,1,1};
		Calculadora calculadora = new Calculadora();
		assertEquals(1,calculadora.obtenerMaximoValor(numeros));
	}
	
	@Test
	public void testObtenerMaximoValor5() {
		int[] numeros= {-9,-8,-9,-2,-6};
		Calculadora calculadora = new Calculadora();
		assertEquals(-2,calculadora.obtenerMaximoValor(numeros));
	}
	

}
