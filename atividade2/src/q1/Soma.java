package q1;

public class Soma extends OperacaoMatematica{

	private double valor1;
	private double valor2;
	
	public Soma(double valor1, double valor2) {
		this.valor1 = valor1;
		this.valor2 = valor2;
	}
	
	@Override
	public double calcula() {
		return this.valor1 + this.valor2;
	}
	
	
}