package lacoscondicionais;

import java.util.Scanner;

//4)	Escreva um algoritmo em Java, que leia 3 palavras (String),
//que definem as características de um tipo de animal possível
//segundo o diagrama abaixo, que deve ser lido da esquerda para a direita.
public class Ex04TipoAnimal {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		String carac1, carac2, carac3;

		System.out.println("Informe a primeira caracteristica: ");
		carac1 = sc.next();

		System.out.println("Informe a segunda caracteristica: ");
		carac2 = sc.next();

		System.out.println("Informe a terceira caracteristica: ");
		carac3 = sc.next();

		if (carac1.equalsIgnoreCase("vertebrado")) {
			if (carac2.equalsIgnoreCase("ave")) {
				
				if(carac3.equalsIgnoreCase("Carnivoro"))
				{
					System.out.println("Águia");
					
				} else if (carac3.equalsIgnoreCase("Onivoro")) {
					
					System.out.println("Pomba");
				}else {
					System.out.println("Inexistente");
				}
				
				

			} else if (carac2.equalsIgnoreCase("Mamifero")) {
				
				if(carac3.equalsIgnoreCase("Onivoro")) {
					
					System.out.println("Homem");
					
				}else if(carac3.equalsIgnoreCase("Herbivoro")) {
					
					System.out.println("Vaca");
				}else {
					System.out.println("Inexistente");
				}
				

			}else {
				System.out.println("Inexistente");
			}
			
			
			
		} else if (carac1.equalsIgnoreCase("Invertebrado")) {
			if(carac2.equalsIgnoreCase("Inseto")) {
				
				if(carac3.equalsIgnoreCase("Hematofago")) {
					
					System.out.println("Pulga");
					
				}else if(carac3.equalsIgnoreCase("Herbivoro")) {
					System.out.println("Lagarta");
				}else {
					System.out.println("Inexistente");
				}
				
			} else if(carac2.equalsIgnoreCase("Anelideo")) {
				if(carac3.equalsIgnoreCase("Hematofago")) {
					
					System.out.println("Sanguessuga");
					
				}else if(carac3.equalsIgnoreCase("Onivoro")) {
					
					System.out.println("Minhoca");
				}
			}else {
				System.out.println("Inexistente");
			}
			
		} else{
			System.out.println("ERRO! Entre com Vertebrado ou Invertebrado");
		}
		

		sc.close();
	}
}