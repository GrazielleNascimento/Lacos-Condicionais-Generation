//8)	Desenvolva um algoritmo em Java para uma conta bancária. O programa deverá ler o tipo de operação a ser realizada com base na tabela abaixo (número inteiro entre 1 e 3) e o valor a ser depositado ou sacado (somente nas opções 2 e 3). Considere que um saque só pode ser realizado caso haja saldo suficiente. Ao final de cada operação, exiba o novo Saldo na tela. A variável saldo (float), será inicializada com o valor de R$ 1000.00. Caso a operação seja diferente do intervalo 1 a 3, mostre a mensagem Operação Inválida!
package lacoscondicionais;

import java.util.Scanner;

public class Ex08ContaBancaria {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int operacao;
		float valor, saldo = 1000.00f;

		System.out.print("Operação: ");
		operacao = sc.nextInt();

		switch (operacao) {
		case 1:
			System.out.println("\nOperacao - Saldo");
			System.out.println("Saldo: R$ " + saldo);
			break;

		case 2:
			System.out.println("\nOperacao - Saque");
			System.out.print("\nvalor: R$ ");
			valor = sc.nextFloat();

			if (valor <= saldo) {
				saldo = saldo - valor;
				System.out.println("Novo Saldo: " + saldo);
			} else {
				System.out.println("Saldo Insuficiente!");
			}
			break;

		case 3:
			System.out.println("\nOperacao - Depósito");
			System.out.print("valor: R$ ");
			valor = sc.nextFloat();
			
			saldo = saldo + valor;
			System.out.println("Novo Saldo: R$ " + saldo);
			break;
		default:
			System.out.println("Operação inválida");

		}

		sc.close();
	}

}
