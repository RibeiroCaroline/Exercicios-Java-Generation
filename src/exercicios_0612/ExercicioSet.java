package exercicios_0612;

import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class ExercicioSet {

	public static void main(String[] args) {
		Set<Integer> numeros = new HashSet<Integer>();
		Scanner leia = new Scanner (System.in);
		
		for (int indice = 0; indice < 10; indice++) {
			System.out.println("Digite um valor inteiro: ");
			Integer numerosDigitados = leia.nextInt(); 
			numeros.add(numerosDigitados);
		}
		
		System.out.println("Listar dados do Set: ");
		
		for (Integer numero : numeros) {
			System.out.println(numero);
			
		}
	}

}
