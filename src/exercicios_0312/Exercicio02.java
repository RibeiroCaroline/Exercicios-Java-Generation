package exercicios_0312;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		int Numero;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite um número: ");
		Numero = leia.nextInt();

		if ((Numero % 2 == 0) && (Numero > 0)) {
			System.out.println("O número " + Numero + " é par e positivo!");
		} else if ((Numero % 2 != 0) && (Numero < 0)) {
			System.out.println("O número " + Numero + " é ímpar e negativo!");
		} else if ((Numero % 2 == 0) && (Numero < 0)) {
			System.out.println("O número " + Numero + " é par e negativo!");
		} else {
			System.out.println("O número " + Numero + " é ímpar e positivo!");
		}

	}

}
