package lacoscondicionais;

import java.util.Scanner;

//1)Faça um algoritmo em Java que leia 3 valores inteiros A, B e C
//e imprima na tela se a soma de A + B é maior, menor ou igual a C.

public class Ex01MaiorMenorIgual {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		int a, b, c, soma;
		
		System.out.print("Digite o número A: ");
		a = sc.nextInt();
		System.out.print("Digite o número B: ");
		b = sc.nextInt();
		System.out.print("Digite o número C: ");
		c = sc.nextInt();
		
		soma = a + b;
		
		if(soma > c) {
			System.out.println(a + " + " + b +  " = " + soma + " > " + c);
			System.out.println("A Soma de A + B é Maior do que C");
		} else if(soma < c) {
			System.out.println(a + " + " + b +  " = " + soma + " < " + c);
			System.out.println("A Soma de A + B é Menor do que C");
		} else {
			System.out.println(a + " + " + b +  " = " + soma + " = " + c);
			System.out.println("A Soma de A + B é Igual a C");	
		}
		sc.close();
	}

}
