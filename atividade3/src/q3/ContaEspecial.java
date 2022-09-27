package q3;

public class ContaEspecial extends Conta{
	
	private double limite;

	public ContaEspecial(String nome, String conta, double saldo) {
		super(nome,conta, saldo);
		this.limite = super.getSaldo() * 3;
	}
	
	

	@Override
	public void deposito(double aumento) {
		super.setSaldo(super.getSaldo() + aumento);
	}



	@Override
	public void saque(double tirar) {
		if(super.getSaldo() >= tirar) {
			System.out.println("Saque autorizado");
			super.setSaldo(super.getSaldo() - tirar);
		}else {
			System.out.println("Não autorizado");
		}
	}



	public double getLimite() {
		return limite;
	}

	public void setLimite(double limite) {
		this.limite = limite;
	}
	
}
