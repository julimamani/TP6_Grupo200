package ar.edu.unju.edm.model;

public class Calculadora {
	private int numero1;
	private int numero2;
	public Calculadora() {
		// TODO Auto-generated constructor stub
	}
	public int getNumero1() {
		return numero1;
	}
	public void setNumero1(int numero1) {
		this.numero1 = numero1;
	}
	public int getNumero2() {
		return numero2;
	}
	public void setNumero2(int numero2) {
		this.numero2 = numero2;
	}
	public Calculadora(int numero1, int numero2) {
		super();
		this.numero1 = numero1;
		this.numero2 = numero2;
	}
	
	public double sumarNum() {
		return (getNumero1()+getNumero2());
	}
	
	public double restarNum() {
		return (getNumero1()-getNumero2());
	}
	
	public double multiplicarNum() {
		return (getNumero1()*getNumero2());
	}
	
	public double dividirNum() {
		return (getNumero1()/(double)getNumero2());
	}
	
	public int obtenerMaximoValor(int[] numeros) {
		int aux= numeros[0];
		for(int i=1;i<numeros.length;i++) {
			if(aux<numeros[i]) {
				aux=numeros[i];
			}
		}
		return aux;
	}
}
