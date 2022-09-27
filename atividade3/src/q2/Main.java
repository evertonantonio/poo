package q2;

public class Main {

	public static void main(String[] args) {
		
		ClienteFidelidade c = new ClienteFidelidadeEspecial("Everton", "Felix Peixoto", 1000, 50, "13/11/1999");
		
		System.out.println(c.getValor());
		c.pegarPromocao();
		System.out.println(c.getValor());
	}
}
