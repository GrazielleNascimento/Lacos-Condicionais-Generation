package lacoscondicionais;

import java.util.Scanner;

//2)	Escreva um algoritmo em Java, que leia um número inteiro via teclado 
//e mostre na tela uma mensagem indicando se este número é par ou ímpar 
//e se o número é positivo ou negativo. Veja os exemplos abaixo:

public class Ex02ParImparPositivoNegativo {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int num;
		
		System.out.println("Digite um numero: ");
		num = sc.nextInt();
		
		if(num % 2 == 0 && num > 0) {
			System.out.println("O Número " + num + " é par e positivo!");	
		} else if(num % 2 == 0 && num < 0) {
			System.out.println("O Número " + num + " é par e negativo!");	
		}else if(num % 2 != 0 && num > 0) {
			System.out.println("O Número " + num + " é ímpar e positivo!");
		} else {
			System.out.println("O Número " + num + " é ímpar e negativo!");
		}
		
		sc.close();
	}

}
