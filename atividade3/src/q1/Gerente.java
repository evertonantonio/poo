package q1;

public class Gerente extends Funcionario{
	
	public Gerente(String nome, double salario) {
		super(nome,salario);
	}
	
	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() + (super.getSalario() * 0.05));
	}

	
}
