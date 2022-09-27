package q1;

public class Analista extends Funcionario{
	
	public Analista(String nome, double salario) {
		super(nome,salario);
	}

	@Override
	public void aumentaSalario() {
		super.setSalario(super.getSalario() + (super.getSalario() * 0.2));
	}
}
