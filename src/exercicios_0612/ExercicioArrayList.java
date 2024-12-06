package exercicios_0612;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class ExercicioArrayList {

	public static void main(String[] args) {
		ArrayList<String> cores = new ArrayList<String>();
		Scanner leia = new Scanner (System.in);
		
		
	
		for (int indice = 0; indice < 5; indice++) {
			System.out.println("Digite as cores: ");
			String corDigitada = leia.next(); 
			cores.add(corDigitada); 
			
		}
		System.out.println("\nListar todas as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
		}
		
		Collections.sort(cores);	
		System.out.println("\nOrdenar as cores: ");
		for (String cor : cores) {
			System.out.println(cor);
			
		}
		
	}
}