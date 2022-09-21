package ex02a;

public class Main {

	public static void main(String[] args) {
		
		Cachorro c = new Cachorro("dino","pastor alemão");
		System.out.println(c.getNome());
		System.out.println(c.getRaca());
		c.late();
		c.caminha();
		
		System.out.println("--------------------------------------------");
		
		Gato g = new Gato("kepu", "não identificado");
		System.out.println(g.getNome());
		System.out.println(g.getRaca());
		g.miar();
		g.caminha();
	}
}
