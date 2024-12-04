package exercicios_0312;

import java.util.Scanner;

public class Exercicio03 {

	public static void main(String[] args) {
		int Opcao;
		int Quantidade;
		int ValorTotal;
		int Preco;

		Scanner leia = new Scanner(System.in);

		System.out.println("# ## ### #### #########   Menu   ########## #### ### ## #");
		System.out.println("\n--Digite 1 para Cachorro-Quente--");
		System.out.println("--Digite 2 para X-Salada--");
		System.out.println("--Digite 3 para X-Bacon--");
		System.out.println("--Digite 4 para Bauru--");
		System.out.println("--Digite 5 para Refrigerante--");
		System.out.println("--Digite 6 para Suco de Laranja--");

		Opcao = leia.nextInt();

		System.out.println("Quantidade que comprou do item: ");

		Quantidade = leia.nextInt();

		switch (Opcao) {
		case 1:
			Preco = 10;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: Cachorro-Quente");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		case 2:
			Preco = 15;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: X-Salada");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		case 3:
			Preco = 18;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: X-Bacon");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		case 4:
			Preco = 12;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: Bauru");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		case 5:
			Preco = 8;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: Refrigerante");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		case 6:
			Preco = 13;
			ValorTotal = Quantidade * Preco;
			System.out.println("Produto: Suco de Laranja");
			System.out.println("Valor Total: R$ " + ValorTotal);
			break;
		default:
			System.out.println("Opção Inválida");
		}

	}

}
