package q2;

public class Circulo implements FormaGeometrica{

	private double raio;
	private final double PI = 3.1415;
	
	public Circulo(double raio) {
		this.raio = raio;
	}

	@Override
	public double area() {
		return PI * (raio * raio);
	}

	@Override
	public double comprimento() {
		return 2 * PI * raio;
	}
	
	
}
