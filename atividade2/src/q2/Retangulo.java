package q2;

public class Retangulo implements FormaGeometrica{

	private double base;
	private double altura;
	
	public Retangulo(double base, double altura) {
		this.base = base;
		this.altura = altura;
	}

	@Override
	public double area() {
		return this.altura * this.base;
	}

	@Override
	public double comprimento() {
		return (this.base * 2) + (this.altura * 2);
	}
	
	
}
