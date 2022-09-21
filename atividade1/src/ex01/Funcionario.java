package ex01;

public class Funcionario {

	private String nome;
	private double salario;
	
	public Funcionario(String nome, double salario) {
		this.nome = nome;
		this.salario = salario;
	}
	
	public void addAumento(double aumento ) {
		this.salario += aumento ;
	}
	
	public double ganhoAnual() {
		return this.salario * 12;
	}
	
	public void dados() {
		System.out.println(this.nome);
		System.out.println(this.salario);
	}

	
	
	public String getNome() {
		return nome;
	}

	public void setNome(String nome) {
		this.nome = nome;
	}

	public double getSalario() {
		return salario;
	}

	public void setSalario(double salario) {
		this.salario = salario;
	}
	
}
