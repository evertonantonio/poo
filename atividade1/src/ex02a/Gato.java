package ex02a;

public class Gato extends Animal{

	public Gato() {
		
	}
	
	public Gato(String nome, String raca) {
		super(nome,raca);
	}
	
	public void miar() {
		System.out.println("miau");
	}
}
