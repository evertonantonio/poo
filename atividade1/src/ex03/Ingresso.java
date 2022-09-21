package ex03;

public class Ingresso {

	private double valor = 100;
	
	public void imprimeValor() {
		System.out.println("Ingresso impresso R$" + this.valor);
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
