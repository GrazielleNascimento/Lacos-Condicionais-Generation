package lacoscondicionais;

import java.util.Scanner;

//3)Para doar sangue é necessário ter entre 18 e 69 anos de idade. 
//Pessoas com idade entre 60 e 69 anos, só podem doar se não for a sua primeira doação. 
//Escreva um Algoritmo em Java que obtenha via teclado 
//o nome do doador (String), a idade (inteiro) do doador
//e se é a primeira doação (boolean). 
//De acordo com as Regras para a doação, 
//mostre na tela se o doador está Apto ou Não Apto para doar sangue. 

public class Ex03Doadorcondicao {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		String nome;
		int idade;
		boolean primeiraDoacao;

		System.out.print("Digite o nome do Doador: ");
		nome = sc.next();
		System.out.print("Digite a idade do Doador: ");
		idade = sc.nextInt();
		System.out.print("É sua primeira doação: ");
		primeiraDoacao = sc.nextBoolean();

		if (idade >= 18 && idade <= 69) { // condição para doar sangue

			if (idade >= 60 && idade <= 69 && primeiraDoacao) { // só podem doar se não for a sua primeira doação.
				System.out.println(nome + " não está apto para doar sangue!");

			} else {
				System.out.println(nome + " está apto para doar sangue!");
			}
			
		}else {
			System.out.println(nome + " não está apto para doar sangue!");
		}
	
		sc.close();
	}

}
