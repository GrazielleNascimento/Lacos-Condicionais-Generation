package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;
//6) escreva um algoritmo em Java que leia o Nome do Colaborador (String),
//o Código do Cargo do Colaborador (número inteiro de 1 a 6) e o Salário (número float).
//A seguir, mostre na tela o Nome do Colaborador, o Cargo e o novo Salário reajustado.
public class Ex06ColaboradorSalario {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);

		int codCargo;
		String nome;
		float salario, novoSalario, reajuste;

		System.out.print("Nome do colaborador: ");
		nome = sc.nextLine();

		System.out.print("Cargo: ");
		codCargo = sc.nextInt();

		System.out.print("Salário: ");
		salario = sc.nextFloat();

		switch (codCargo) {

		case 1:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Gerente");
			reajuste = 0.1f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		case 2:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Vendedor");
			reajuste = 0.07f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		case 3:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Supervisor");
			reajuste = 0.09f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		case 4:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Motorista");
			reajuste = 0.06f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		case 5:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo: Estoquista");
			reajuste = 0.05f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		case 6:
			System.out.println("Nome do colaborador: " + nome);
			System.out.println("Cargo:Técnico de TI");
			reajuste = 0.08f;
			novoSalario = salario + (reajuste * salario);
			System.out.printf("Salário:R$ %.2f", novoSalario);
			break;

		default:
			System.out.println("Código inválido");
			
			sc.close();

		}

	}

}
