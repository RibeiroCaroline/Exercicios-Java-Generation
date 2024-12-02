package exercicios_0112;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		
		
		float SalarioBruto, AdicionalNoturno;
		float HorasExtras, Descontos;
		float SalarioLiquido;
		
		Scanner leia = new Scanner (System.in);
		
		System.out.println("Digite o valor do Salário Bruto: R$");
		SalarioBruto = leia.nextFloat();
		
		System.out.println("Digite o valor do Adicional Noturno: R$");
		AdicionalNoturno = leia.nextFloat();
		
		System.out.println("Digite o valor das Horas Extras: R$");
		HorasExtras = leia.nextFloat();
		
		System.out.println("Digite o valor dos Descontos: R$");
		Descontos = leia.nextFloat();
		
		SalarioLiquido = SalarioBruto + AdicionalNoturno + (HorasExtras * 5) - Descontos; 
		
		System.out.printf("O valor do Salário Líquido é: R$ %.2f ",SalarioLiquido);
		

	}

}
