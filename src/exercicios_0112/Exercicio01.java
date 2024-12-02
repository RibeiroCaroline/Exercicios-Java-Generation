package exercicios_0112;

import java.util.Scanner;

public class Exercicio01 {

	public static void main(String[] args) {
		
		float Salario, Abono, NovoSalario;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o Salário: ");
		Salario = leia.nextFloat();
		
		System.out.println("Digite o Abono: ");
		Abono = leia.nextFloat();
		
		NovoSalario = Salario + Abono; 
		
		System.out.println("O Novo Salário é: R$" + NovoSalario);
		

	}

}
