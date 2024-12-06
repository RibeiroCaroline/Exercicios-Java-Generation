package exercicio_0512;

import java.util.Scanner;

public class ExercicioVetor02 {

	public static void main(String[] args) {

		int[] numero = new int[10];
		Scanner leia = new Scanner(System.in);
		int soma = 0;
		float media = 0;

		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite o " + (indice + 1) + " º número:");
			numero[indice] = leia.nextInt();
		}

		System.out.println("Elementos nos índices ímpares: ");

		for (int indice = 0; indice < 10; indice++) {
			if (numero[indice] % 2 != 0) {
				System.out.print(numero[indice] + " ");

			}
		}

		System.out.println("\nElementos nos índices pares: ");

		for (int indice = 0; indice < 10; indice++) {
			if (numero[indice] % 2 == 0) {
				System.out.print(numero[indice] + " ");
			}
			soma = soma + numero[indice];
			media = soma/10;
		}
		System.out.println("\nSoma: "+ soma);
		System.out.printf("Média: "+ media);
		
	}

}
