package ex01;

public class Main {

	public static void main(String[] args) {
		
		System.out.println("-----------------------------------------------");
		
		Funcionario f = new Funcionario("Everton", 1500);
		System.out.println("antes do aumento: R$" + f.ganhoAnual());
		f.addAumento(500);
		System.out.println("Depois do aumento: R$" + f.ganhoAnual());
		f.dados();
		
		
		System.out.println("-----------------------------------------------");
		
		Assistente a = new Assistente("Maria" , 2000, "87178719");
		System.out.println("antes do aumento: R$" + a.ganhoAnual());
		a.dados();
		a.addAumento(500);
		System.out.println("Depois do aumento: R$" + a.ganhoAnual());
		
		
		System.out.println("-----------------------------------------------");
		
		AssistenteAdm aA = new AssistenteAdm("Magrão", 100, "123456789", 500);
		System.out.println("antes do aumento: R$" + aA.ganhoAnual());
		aA.dados();
		aA.addAumento(500);
		System.out.println("Depois do aumento: R$" + aA.ganhoAnual());
		
		
		System.out.println("-----------------------------------------------");
		
		AssistenteTecnico aT = new AssistenteTecnico("Ana", 3000, "800458" , true);
		System.out.println("antes do aumento: R$" + aT.ganhoAnual());
		aT.dados();
		aT.addAumento(500);
		System.out.println("Depois do aumento: R$" + aT.ganhoAnual());
		
	}
}
