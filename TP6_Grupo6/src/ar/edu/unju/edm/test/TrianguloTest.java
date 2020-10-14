package ar.edu.unju.edm.test;

import org.junit.Test;

import ar.edu.unju.edm.model.Triangulo;
import junit.framework.TestCase;

public class TrianguloTest extends TestCase{
//testVerificarTriangulo()
	@Test
	public void testVerificarTriangulo1() {
		Triangulo triangulo=new Triangulo(10,7,3);
		assertEquals(false,triangulo.verificarTriangulo());
	}
	
	@Test
	public void testVerificarTriangulo2() {
		Triangulo triangulo=new Triangulo(1,20,40);
		assertEquals(false,triangulo.verificarTriangulo());
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
		assertEquals(false,triangulo.verificarTriangulo());
	}
//testVerificarIsosceles()
	@Test
	public void testVerificarIsosceles1() {
		Triangulo triangulo=new Triangulo(9,6,4);
		assertEquals(false,triangulo.verificarIsosceles());
	}
	
	@Test
	public void testVerificarIsosceles2() {
		Triangulo triangulo=new Triangulo(14,14,5);
		assertEquals(true,triangulo.verificarIsosceles());
	}
	
	@Test
	public void testVerificarIsosceles3() {
		Triangulo triangulo=new Triangulo(9,6,9);
		assertEquals(true,triangulo.verificarIsosceles());
	}
	
	@Test
	public void testVerificarIsosceles4() {
		Triangulo triangulo=new Triangulo(14,14,14);
		assertEquals(true,triangulo.verificarIsosceles());
	}
	
	
	//testVerificarEquilatero()
		@Test
		public void testVerificarEquilatero1() {
			Triangulo triangulo=new Triangulo(11,7,2);
			assertEquals(false,triangulo.verificarEquilatero());
		}
		
		@Test
		public void testVerificarEquilatero2() {
			Triangulo triangulo=new Triangulo(14,18,4);
			assertEquals(false,triangulo.verificarEquilatero());
		}
		
		@Test
		public void testVerificarEquilatero3() {
			Triangulo triangulo=new Triangulo(9,9,9);
			assertEquals(true,triangulo.verificarEquilatero());
		}
		
		@Test
		public void testVerificarEquilatero4() {
			Triangulo triangulo=new Triangulo(6,6,6);
			assertEquals(true,triangulo.verificarEquilatero());
		
		}
		
		
		
		//testVerificarEscaleno()
			@Test
			public void testVerificarEscaleno1() {
				Triangulo triangulo=new Triangulo(7,7,7);
				assertEquals(false,triangulo.verificarEscaleno());
			}
			
			@Test
			public void testVerificarEscaleno2() {
				Triangulo triangulo=new Triangulo(4,6,6);
				assertEquals(false,triangulo.verificarEscaleno());
			}
			
			@Test
			public void testVerificarEscaleno3() {
				Triangulo triangulo=new Triangulo(8,5,4);
				assertEquals(true,triangulo.verificarEscaleno());
			}
			
			@Test
			public void testVerificarEscaleno4() {
				Triangulo triangulo=new Triangulo(14,5,6);
				assertEquals(true,triangulo.verificarEscaleno());
			
			}
		
}
