package exercicios_0412;

import java.util.Scanner;

public class Exercicio2 {

	public static void main(String[] args) {
		
		int idade, menorVinteUm = 0, maiorCinquenta = 0; 
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite uma idade: ");
		idade = leia.nextInt();
		
		while (idade > 0) {
			if (idade < 21) {
				menorVinteUm = menorVinteUm + 1;
				
			}else if (idade > 50) {
				maiorCinquenta = maiorCinquenta + 1;
				
			}
			System.out.println("Digite uma idade: ");
			idade = leia.nextInt();
		}
		System.out.println("Total de pessoas menores de 21 anos: " + menorVinteUm);
		System.out.println("Total de pessoas maiores de 50 anos: " + maiorCinquenta);
	}
}
