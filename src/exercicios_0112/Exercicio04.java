package exercicios_0112;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		
		float Numero01, Numero02, Numero03, Numero04;
		float Calculo;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o primeiro número: ");
		Numero01 = leia.nextFloat(); 
		
		System.out.println("Digite o segundo número: ");
		Numero02 = leia.nextFloat();
		
		System.out.println("Digite o terceiro número: ");
		Numero03 = leia.nextFloat();
		
		System.out.println("Digite o quarto número: ");
		Numero04 = leia.nextFloat();
		
		Calculo = (Numero01 * Numero02) - (Numero03 * Numero04);
		
		System.out.println("A Diferença do produto entre o " + Numero01 + 
				" e o " + Numero02 + " pelo produto entre o " + Numero03 + 
				" e o " + Numero04 + " é: " + Calculo);
	}

}
