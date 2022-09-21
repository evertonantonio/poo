package q2;

public class Main {

	public static void main(String[] args) {
		
		Quadrado q = new Quadrado(5);
		Circulo c = new Circulo(5);
		Retangulo r = new Retangulo(10, 2);
		
		System.out.println(q.area());
		System.out.println(q.comprimento());
		System.out.println(c.area());
		System.out.println(c.comprimento());
		System.out.println(r.area());
		System.out.println(r.comprimento());
	}
}
