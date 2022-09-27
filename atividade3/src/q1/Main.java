package q1;

import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Funcionario g = new Gerente("Everton", 2000);
		Funcionario p = new Programador("Eren", 4000);
		Funcionario a = new Analista("Capitão Levi", 7000);
		
		Scanner sc = new Scanner(System.in);
		
		while(true) {
			System.out.println("De quem você deseja ver as informações?");
			System.out.println("Digite 1 pro gerente");
			System.out.println("Digite 2 pro gerente");
			System.out.println("Digite 3 pro gerente");
			System.out.println("Digite sua opção: ");
			
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Nome: " + g.getNome());
				System.out.println("Salario: R$" + g.getSalario());
				break;
			}else if(opcao == 2) {
				System.out.println("Nome: " + p.getNome());
				System.out.println("Salario: R$" + p.getSalario());
				break;
			}else if(opcao == 3) {
				System.out.println("Nome: " + a.getNome());
				System.out.println("Salario: R$" + a.getSalario());
				break;
			}
			
		}
		
		while(true) {
			System.out.println("De quem você deseja aumenta o salário: ");
			System.out.println("Digite 1 pro gerente");
			System.out.println("Digite 2 pro gerente");
			System.out.println("Digite 3 pro gerente");
			System.out.println("Digite sua opção: ");
			
			int opcao = sc.nextInt();
			
			if(opcao == 1) {
				System.out.println("Salario antes do aumento: R$" + g.getSalario());
				g.aumentaSalario();
				System.out.println("Salario depois do aumento: R$" + g.getSalario());
				break;
			}else if(opcao == 2) {
				System.out.println("Salario antes do aumento: R$" + p.getSalario());
				p.aumentaSalario();
				System.out.println("Salario depois do aumento: R$" + p.getSalario());
				break;
			}else if(opcao == 3) {
				System.out.println("Salario antes do aumento: R$" + a.getSalario());
				a.aumentaSalario();
				System.out.println("Salario depois do aumento: R$" + a.getSalario());
				break;
			}
		}
		
		sc.close();
	}
}
