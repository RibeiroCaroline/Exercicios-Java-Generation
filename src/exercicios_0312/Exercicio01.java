package exercicios_0312;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		int NumeroA, NumeroB, NumeroC;
		int Soma;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o número A: ");
		NumeroA = leia.nextInt();

		System.out.println("Digite o número B: ");
		NumeroB = leia.nextInt();

		System.out.println("Digite o número C: ");
		NumeroC = leia.nextInt();
		
		Soma = NumeroA + NumeroB;
		
		if (Soma > NumeroC ) {
			System.out.println("A soma de A + B é maior do que C");
		}else if (Soma == NumeroC){
			System.out.println("A soma de A + B é igual a C");
		}else {
			System.out.println("A soma de A + B é menor do que C");
		}
	}

}
