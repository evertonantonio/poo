package ex03;

public class IngressoNomal extends Ingresso{

	@Override
	public void imprimeValor() {
		System.out.println("Ingresso normal, valor de R$" + super.getValor());
	}

	
	
}
