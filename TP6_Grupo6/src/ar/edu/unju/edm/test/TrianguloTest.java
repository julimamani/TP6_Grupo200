package ar.edu.unju.edm.test;

import org.junit.Test;

import ar.edu.unju.edm.model.Triangulo;
import junit.framework.TestCase;

public class TrianguloTest extends TestCase{

	@Test
	public void testVerificarTriangulo1() {
		Triangulo triangulo=new Triangulo(10,7,3);
		assertEquals(true,triangulo.verificarTriangulo());
	}
	
	@Test
	public void testVerificarTriangulo2() {
		Triangulo triangulo=new Triangulo(1,20,40);
		assertEquals(true,triangulo.verificarTriangulo());
	}
	
	@Test
	public void testVerificarTriangulo3() {
		Triangulo triangulo=new Triangulo(9,6,4);
		assertEquals(true,triangulo.verificarTriangulo());
	}
	
	@Test
	public void testVerificarTriangulo4() {
		Triangulo triangulo=new Triangulo(14,14,6);
		assertEquals(true,triangulo.verificarTriangulo());
	}

	@Test
	public void testVerificarTriangulo5() {
		Triangulo triangulo=new Triangulo(30,5,6);
		assertEquals(true,triangulo.verificarTriangulo());
	}
}
