package ar.edu.unju.edm.principal;

import java.util.Scanner;

import ar.edu.unju.edm.model.Triangulo;

public class Principal {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Triangulo triangulo= new Triangulo();
		Scanner ing = new Scanner(System.in);
		System.out.println("----------------BIENVENIDO----------------");
		System.out.println("Ingrese 3 lados");
		System.out.println("Lado A: ");
		triangulo.setLadoA(ing.nextInt());
		System.out.println("Lado B");
		triangulo.setLadoB(ing.nextInt());
		System.out.println("Lado C");
		triangulo.setLadoC(ing.nextInt());
		if(triangulo.verificarTriangulo()!=false) {
			if(triangulo.verificarEquilatero()!=false) {
				System.out.println("El triangulo es del tipo Equilatero");
			}else {
				if(triangulo.verificarEscaleno()!=false) {
					System.out.println("El triangulo es del tipo Escaleno");
				}else {
					System.out.println("El triangulo es del tipo Isosceles");
				}
			}
		}else {
			System.out.println("Con las medidas ingresadas no es posible construir un triangulo");
		}
		
		ing.close();
	}

}
