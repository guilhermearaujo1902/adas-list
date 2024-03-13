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
			
		} while(opcao != 0);
		
		scan.close();
	}

}
