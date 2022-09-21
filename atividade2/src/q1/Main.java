package q1;

public class Main {

	public static void main(String[] args) {
		
		Soma so = new Soma(10, 8);
		Subtracao su = new Subtracao(10, 8);
		Multiplicacao m = new Multiplicacao(10, 8);
		Divisao d = new Divisao(10, 8);
		
		System.out.println(so.calcula());
		System.out.println(su.calcula());
		System.out.println(m.calcula());
		System.out.println(d.calcula());
	}
}
