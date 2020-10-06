package ar.edu.unju.edm.model;

public class Triangulo {
	private int ladoA;
	private int ladoB;
	private int ladoC;
	
	public Triangulo(int ladoA, int ladoB, int ladoC) {
		super();
		this.ladoA = ladoA;
		this.ladoB = ladoB;
		this.ladoC = ladoC;
	}

	public Triangulo() {
		// TODO Auto-generated constructor stub
	}

	public int getLadoA() {
		return ladoA;
	}

	public void setLadoA(int ladoA) {
		this.ladoA = ladoA;
	}

	public int getLadoB() {
		return ladoB;
	}

	public void setLadoB(int ladoB) {
		this.ladoB = ladoB;
	}

	public int getLadoC() {
		return ladoC;
	}

	public void setLadoC(int ladoC) {
		this.ladoC = ladoC;
	}
	
	public boolean verificarTriangulo() {
		int aux1=getLadoA()+getLadoC();
		int aux2=getLadoC()+getLadoB();
		int aux3=getLadoA()+getLadoB();
		if((aux1>getLadoB())&&(aux2>getLadoA())&&(aux3>getLadoC())) {
			return true;
		}
		return false;
	}
	public boolean verificarIsosceles() {
		if((getLadoA()==getLadoB())&&(getLadoA()!=getLadoC())){
			return true;
		}else {
			if((getLadoC()==getLadoB())&&(getLadoA()!=getLadoC())){
				return true;
			}else {
				if((getLadoA()==getLadoC())&&(getLadoA()!=getLadoB())){
					return true;
				}
			}
		}
		return false;
	}
	
	public boolean verificarEscaleno() {
		if((getLadoA()!=getLadoB())&&(getLadoA()!=getLadoC())&&(getLadoB()!=getLadoC())){
			return true;
		}
		return false;
	}
	
	public boolean verificarEquilatero() {
		if((getLadoA()==getLadoB())&&(getLadoA()==getLadoC())){
			return true;
		}
		return false;
	}
}
