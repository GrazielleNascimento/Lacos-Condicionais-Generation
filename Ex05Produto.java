package lacoscondicionais;

import java.util.Scanner;

//5)Com base na tabela abaixo, escreva um algoritmo em Java
//que leia o código de um item (número inteiro de 1 a 6)
//e a quantidade comprada deste item (número inteiro). 
//A seguir, mostre na tela o valor total da conta e o nome do produto que foi comprado.
public class Ex05Produto {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int codProduto = 0, qtdProduto;
		double valorTotal;
	
		System.out.print("Código Produto: ");
		codProduto = sc.nextInt();
		System.out.print("Quantidade: ");
		qtdProduto = sc.nextInt();

		switch (codProduto)// a variavel verificada
		{
		case 1:
			System.out.println("Produto: Cachorro-Quente");
			valorTotal = qtdProduto * 10;
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 2:
			System.out.println("Produto: X-Salada");
			valorTotal = qtdProduto * 15;
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 3:
			System.out.println("Produto: X-Bacon");
			valorTotal = qtdProduto * 18;
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 4:
			System.out.println("Produto: Bauro");
			valorTotal = qtdProduto * 12;
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 5:
			System.out.println("Produto: Refrigerante");
			valorTotal = qtdProduto * 8;
			System.out.println("Valor Total: " + valorTotal);
			break;
		case 6:
			System.out.println("Produto: Suco de Laranja");
			valorTotal = qtdProduto * 13;
			System.out.println("Valor Total: " + valorTotal);
			break;
		default:
			System.out.println("Código incorreto");
			
			sc.close();
			
		}

	}
}
