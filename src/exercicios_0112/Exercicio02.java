package exercicios_0112;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		
		float Nota1, Nota2, Nota3, Nota4, MediaFinal;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite a primeira nota: ");
		Nota1 = leia.nextFloat();
		
		System.out.println("Digite a segunda nota: ");
		Nota2 = leia.nextFloat();
		
		System.out.println("Digite a terceira nota: ");
		Nota3 = leia.nextFloat();
		
		System.out.println("Digite a quarta nota: ");
		Nota4 = leia.nextFloat();
		
		MediaFinal = (Nota1 + Nota2 + Nota3 + Nota4)/4;
		
		System.out.printf("A Média Final é: %.1f ", MediaFinal);
		

	}

}
