package ex04;

public class Imovel {

	private String endereco;
	private double preco;
	
	public Imovel(String endereco, double preco) {
		this.endereco = endereco;
		this.preco = preco;
	}
	
	public void dados() {
		System.out.println("O endere�o da casa �: " + this.endereco);
		System.out.println("O valor da casa � de: R$" + this.preco);
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getPreco() {
		return preco;
	}

	public void setPreco(double preco) {
		this.preco = preco;
	}
	
	
}
