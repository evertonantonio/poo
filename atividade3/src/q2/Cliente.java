package q2;

public class Cliente {

	private String nome;
	private String endereco;
	private double valor;
	
	public Cliente(String nome, String endereco, double valor) {
		this.nome = nome;
		this.endereco = endereco;
		this.valor = valor;
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getEndereco() {
		return endereco;
	}

	public void setEndereco(String endereco) {
		this.endereco = endereco;
	}

	public double getValor() {
		return valor;
	}

	public void setValor(double valor) {
		this.valor = valor;
	}
	
	
}
