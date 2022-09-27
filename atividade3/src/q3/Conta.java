package q3;

public class Conta {
	
	private String nome;
	private String conta;
	private double saldo;
	private double limite;
	
	public Conta(String nome, String conta, double saldo) {
		this.nome = nome;
		this.conta = conta;
		this.saldo = saldo;
		this.limite = this.saldo - (this.saldo * 0.3);
	}
	
	public void deposito(double aumento) {
		this.saldo += aumento;
	}
	
	public void saque(double tirar) {
		if(this.saldo >= tirar) {
			System.out.println("Saque autorizado");
			this.saldo -= tirar;
		}else {
			System.out.println("Não autorizado");
		}
	}

	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public String getConta() {
		return conta;
	}

	public void setConta(String conta) {
		this.conta = conta;
	}

	public double getSaldo() {
		return saldo;
	}

	public void setSaldo(double saldo) {
		this.saldo = saldo;
	}

	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
	
}
