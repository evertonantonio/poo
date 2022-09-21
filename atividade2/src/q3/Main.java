package q3;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Soma so = new Soma();
		Subtracao su = new Subtracao();
		Multiplicacao m = new Multiplicacao();
		Divisao d = new Divisao();
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Digite o primeiro valor: ");
		double valor1 = sc.nextDouble();
		System.out.println("Digite o segundo valor: ");
		double valor2 = sc.nextDouble();
		
		System.out.println(so.calcula(valor1, valor2));
		System.out.println(su.calcula(valor1, valor2));
		System.out.println(m.calcula(valor1, valor2));
		System.out.println(d.calcula(valor1, valor2));
		
		sc.close();
	}
}
