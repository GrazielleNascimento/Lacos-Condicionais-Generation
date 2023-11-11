//escreva um algoritmo em Java, que simule uma Calculadora simples. O programa deverá ler dois números float: numero1 e numero2, e na sequência ler o Código da operação matemática (número inteiro de 1 a 4). A seguir, mostre na tela o resultado da operação entre os 2 números. Caso a operação seja diferente do intervalo 1 a 4, mostre a mensagem Operação Inválida!

package lacoscondicionais;

import java.util.Locale;
import java.util.Scanner;

public class Ex07Calculadora {

	public static void main(String[] args) {
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		float num1, num2;
		int cod;
		
		System.out.print("Digite o 1º número: ");
		num1 = sc.nextFloat();
		System.out.print("Digite o 2º número: ");
		num2 = sc.nextFloat();
		
		System.out.print("Operação: ");
		cod = sc.nextInt();
		
		switch(cod) {
		
		case 1:
			System.out.println(num1 + " + " + num2 + " = " + (num1+num2));
			break;
		case 2:
			System.out.println(num1 + " - " + num2 + " = " + (num1-num2));
			break;
		case 3:
			System.out.println(num1 + " * " + num2 + " = " + (num1*num2));
			break;
		case 4:
			System.out.println(num1 + " / " + num2 + " = " + (num1/num2));
			break;
		default: 
			System.out.println("Opção Inválida");
			
			sc.close();
			
		}
		

	}

}
