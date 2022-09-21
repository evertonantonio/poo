package ex02a;

public class Cachorro extends Animal{

	public Cachorro() {
		
	}
	
	public Cachorro(String nome, String raca) {
		super(nome,raca);
	}
	
	public void late() {
		System.out.println("auau");
	}
}
