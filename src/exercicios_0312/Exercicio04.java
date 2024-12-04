package exercicios_0312;

import java.util.Scanner;

public class Exercicio04 {

	public static void main(String[] args) {
		String NomeColaborador;
		int CodigoColaborador;
		float Salario;
		float NovoSalario;

		Scanner leia = new Scanner(System.in);

		System.out.println("Digite o nome do colaborador: ");
		NomeColaborador = leia.next();

		System.out.println("Digite o Salário: R$");
		Salario = leia.nextFloat();

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Gerente--");
		System.out.println("--Digite 2 para Vendedor--");
		System.out.println("--Digite 3 para Supervisor--");
		System.out.println("--Digite 4 para Motorista--");
		System.out.println("--Digite 5 para Estoquista--");
		System.out.println("--Digite 6 para Técnico de TI--");

		CodigoColaborador = leia.nextInt();

		switch (CodigoColaborador) {
		case 1:
			NovoSalario = Salario + (0.10f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Gerente");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		case 2:
			NovoSalario = Salario + (0.07f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Vendedor");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		case 3:
			NovoSalario = Salario + (0.09f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Supervisor");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		case 4:
			NovoSalario = Salario + (0.06f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Motorista");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		case 5:
			NovoSalario = Salario + (0.05f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Estoquista");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		case 6:
			NovoSalario = Salario + (0.08f * Salario);
			System.out.println("Nome do Colaborador: " + NomeColaborador);
			System.out.println("Cargo: Técnico de TI");
			System.out.println("Salário: R$" + NovoSalario);
			break;
		default:
			System.out.println("Opção Inválida");
		}

	}

}
