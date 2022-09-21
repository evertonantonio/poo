package ex02b;

public class Rica extends Pessoa{

	private double dinheiro;
	
	public Rica() {
		
	}
	
	public Rica(String nome, int idade, double dinheiro) {
		super(nome,idade);
		this.dinheiro = dinheiro;
	}
	
	
	public void fazCompras() {
		System.out.println("Foi fazer compras! R$ R$ R$ R$");
	}
	

	public double getDinheiro() {
		return dinheiro;
	}

	public void setDinheiro(double dinheiro) {
		this.dinheiro = dinheiro;
	}
	
}
