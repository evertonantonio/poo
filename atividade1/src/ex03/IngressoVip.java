package ex03;

public class IngressoVip extends Ingresso{

	@Override
	public void imprimeValor() {
		System.out.println(super.getValor() + 50);
	}

}
