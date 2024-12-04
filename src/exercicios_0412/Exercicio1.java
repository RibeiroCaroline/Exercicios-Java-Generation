package exercicios_0412;

import java.util.Scanner;

public class Exercicio1 {

	public static void main(String[] args) {

		int numero = 0, totalPar = 0, totalImpar = 0;
		int contador;

		Scanner leia = new Scanner(System.in);

		for (contador = 1; contador < 11; contador++) {
			System.out.println("Digite o " + contador + "º número: ");
			numero = leia.nextInt();

			if (numero % 2 == 0) {
				totalPar++;

			} else {
				totalImpar++;
			}
		}
		System.out.println("Total de números pares: " + totalPar);
		System.out.println("Total de números ímpares: " + totalImpar);
	}
}
