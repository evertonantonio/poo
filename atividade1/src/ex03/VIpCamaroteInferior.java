package ex03;

public class VIpCamaroteInferior extends IngressoVip{

	public void localizacao() {
		System.out.println("Sua localiza��o � na parte inferior!");
	}
	
	public void imprimeValor() {
		System.out.println(super.getValor() + 80);
	}
}
