package exercicio_0512;

import java.util.Scanner;

public class ExercicioVetor01 {

	public static void main(String[] args) {
		int[] numeros = {2, 5, 1, 3, 4, 9, 7, 8, 10, 6 };
		int numeroDigitado; 
		int indiceEncontrado = -1;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o número que você deseja encontrar: ");
		numeroDigitado = leia.nextInt();
		
		for (int indice = 0; indice < 10; indice++) {
			if (numeros[indice] == numeroDigitado) {
				indiceEncontrado = indice; 
			}
		}
		if (indiceEncontrado == -1) {
			System.out.println("O número " + numeroDigitado + " não foi encontrado!");
			
		}else {
			System.out.println("O número " + numeroDigitado + " está localizado na posição "
		+ indiceEncontrado); 
		}	
	}
}
