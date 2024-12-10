package exercicios_0912;

import java.util.Iterator;
import java.util.LinkedList;
import java.util.Scanner;

public class ExercicioQueue {

	public static void main(String[] args) {
		LinkedList<String> fila = new LinkedList<String>();
		int opcao = 0;
		Scanner leia = new Scanner(System.in);
		String cliente;

		do {

			System.out.println("***************** M E N U ********************");
			System.out.println("\n1 - Adicionar Cliente na Fila");
			System.out.println("2 - Listar todos os Clientes");
			System.out.println("3 - Retirar Cliente da Fila");
			System.out.println("0 - Sair");
			System.out.println("\n********************************************");
			System.out.println("Entre com a opção desejada: ");

			opcao = leia.nextInt();

			switch (opcao) {
			case 1:
				do {
					System.out.println("Digite o nome: ");
					cliente = leia.next();
					fila.add(cliente);
					System.out.println("\nFila: ");

					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}

					System.out.println("\nCliente adicionado!");
				} while (opcao != 1);
				break;
			case 2:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					System.out.println("\nLista de Clientes na Fila: ");
					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}
				}
				break;
			case 3:
				if (fila.isEmpty()) {
					System.out.println("\nA Fila está vazia!");
				} else {
					fila.remove();
					Iterator<String> listarClientes = fila.iterator();

					while (listarClientes.hasNext()) {
						System.out.println(listarClientes.next());
					}
					System.out.println("\nO Cliente foi Chamado!");
				}

			}

		} while (opcao != 0);
		System.out.println("\nPrograma Finalizado! ");
	}

}