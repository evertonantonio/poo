package q3;

public class Main {

	public static void main(String[] args) {
		
		Conta c = new ContaEspecial("Eriw", "4578-98", 1000);
		
		System.out.println(c.getLimite());
		
		c.saque(400);
		System.out.println(c.getSaldo());
		c.saque(600.1);
	}
}
