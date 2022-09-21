package ex01;

public class Assistente extends Funcionario{

	private String matricula;
	
	public Assistente(String nome, double salario, String matricula) {
		super(nome, salario);
		this.matricula = matricula;
	}

	
	
	@Override
	public void dados() {
		System.out.println(super.getNome());
		System.out.println(super.getSalario());
		System.out.println(this.matricula);
	}



	public String getMatricula() {
		return matricula;
	}

	public void setMatricula(String matricula) {
		this.matricula = matricula;
	}
	
	
}
