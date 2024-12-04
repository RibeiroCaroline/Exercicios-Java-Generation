package exercicios_0412;

import java.util.Scanner;

public class Exercicio3 {

	public static void main(String[] args) {
		int numero = 0, somaNumeros = 0;
		
		Scanner leia = new Scanner(System.in);

		do {
			System.out.println("Digite um número: ");
			numero = leia.nextInt();
			if (numero > 0 ) {
				somaNumeros = somaNumeros + numero;
			}
			
		} while (numero != 0);
		
		System.out.println("A soma dos números positivos é: " +somaNumeros);
	}

}
