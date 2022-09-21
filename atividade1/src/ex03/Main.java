package ex03;

public class Main {

	public static void main(String[] args) {
		
		Ingresso i = new Ingresso();
		IngressoVip iv = new IngressoVip();
		VIpCamaroteInferior vi = new VIpCamaroteInferior();
		VipCamaroteSuperior vs = new VipCamaroteSuperior();
		
		i.imprimeValor();
		iv.imprimeValor();
		vi.imprimeValor();
		vs.imprimeValor();
	}
}
