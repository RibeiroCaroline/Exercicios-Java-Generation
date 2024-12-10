package exercicios_0912;

import java.util.Iterator;
import java.util.Scanner;
import java.util.Stack;

public class ExercicioStack {

	public static void main(String[] args) {
		Stack<String> pilha = new Stack<String>();
		int opcao = 0;
		Scanner leia = new Scanner(System.in);
		String livro;

		do {

			System.out.println("***************** M E N U ********************");
			System.out.println("\n1 - Adicionar Livro na pilha");
			System.out.println("2 - Listar todos os Livros");
			System.out.println("3 - Retirar Livro da pilha");
			System.out.println("0 - Sair");
			System.out.println("\n*************************************+++****");
			System.out.println("Entre com a opção desejada: ");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("Digite o nome: ");
					leia.skip("\\R?");
					livro = leia.nextLine();
					pilha.push(livro);
					System.out.println("\nPilha: ");

					Iterator<String> listarLivros = pilha.iterator();

					while (listarLivros.hasNext()) {
						System.out.println(listarLivros.next());
					}
					
					System.out.println("\nLivro adicionado!");
				} while (opcao != 1);
				break;
			case 2:
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					System.out.println("\nLista de Livros na Pilha: ");
					Iterator<String> listarLivros = pilha.iterator();

					while (listarLivros.hasNext()) {
						System.out.println(listarLivros.next());
					}
				}
				break;
			case 3:
				if (pilha.isEmpty()) {
					System.out.println("\nA Pilha está vazia!");
				} else {
					pilha.pop();
					Iterator<String> listarLivros = pilha.iterator();

					while (listarLivros.hasNext()) {
						System.out.println(listarLivros.next());
					}
					System.out.println("\nUm livro foi retirado da pilha!");
				}

			}

		} while (opcao != 0);
		System.out.println("\nPrograma Finalizado! ");

	}

}
