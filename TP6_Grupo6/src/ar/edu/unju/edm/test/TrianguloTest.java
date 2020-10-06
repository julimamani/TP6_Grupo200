package ar.edu.unju.edm.test;

import org.junit.Test;

import ar.edu.unju.edm.model.Triangulo;
import junit.framework.TestCase;

public class TrianguloTest extends TestCase{

	@Test
	public void testVerificarTriangulo() {
		Triangulo triangulo=new Triangulo(10,7,3);
		assertEquals(true,triangulo.verificarEquilatero());
	}

}
