package q2;

public class Quadrado implements FormaGeometrica{

	private double lado;
	
	public Quadrado(double lado) {
		this.lado = lado;
	}
	
	@Override
	public double area() {
		return this.lado * this.lado;
	}

	@Override
	public double comprimento() {
		return (this.lado * 2) + (this.lado * 2);
	}

	public double getLado() {
		return lado;
	}

	public void setLado(double lado) {
		this.lado = lado;
	}

	
	
}
