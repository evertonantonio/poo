package q1;

public class Programador extends Funcionario{
	
	public Programador(String nome, double salario) {
		super(nome,salario);
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() + (super.getSalario() * 0.1));
	}
}
