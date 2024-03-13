package br.com.projetoList;

import java.util.Scanner;

public class MainProduto {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int opcao;

		do {
			System.out.println("*** Menu de opções ***");
			System.out.println("[1] - Listar produtos ");
			System.out.println("[2] - Adicionar       ");
			System.out.println("[3] - Alterar         ");
			System.out.println("[4] - Excluir         ");
			System.out.println("[0] - Sair            ");
			System.out.println("Escolha uma opção: ");

			opcao = scan.nextInt();

			switch (opcao) {
			case 1:
				// Listar os produtos
				break;
			case 2:
				// Adicionar novos elementos
				break;
			case 3:
				// Editar elementos
				break;
			case 4:
				// Excluir elementos
				break;
			case 0:
				System.out.println("Saindo do menu ...");
				break;
			}

		} while (opcao != 0);

		scan.close();
	}

}
