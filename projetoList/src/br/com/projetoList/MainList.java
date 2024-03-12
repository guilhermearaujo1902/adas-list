package br.com.projetoList;

import java.util.ArrayList;
import java.util.List;

public class MainList {

	public static void main(String[] args) {
		
		// Declarar e Inicializar uma Lista
		List<String> listaNomes = new ArrayList<>();
		
		
		// Descobrindo o tamanho da lista
		System.out.println(listaNomes.size());
		
		
		// Aplicando CRUD
		
		
		// Create: Inserindo elementos
		listaNomes.add("Harry");
		listaNomes.add("Rony");
		listaNomes.add("Hermione");
		listaNomes.add("Luna");
		
		
		// Read: Listar elementos
		System.out.println("- Lista de presença -");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
		
		// Encontrar o index de um elemento
		int indexAlterar = listaNomes.indexOf("Rony");
		int indexExcluir = listaNomes.indexOf("Luna");
		
		
		// Edit: Editar elementos
		listaNomes.set(indexAlterar, "Rony Weasley");
		
		
		// Delete: Remover elementos
		listaNomes.remove("Luna");
		
		System.out.println("----------");
		for (String nome : listaNomes) {
			System.out.println(nome);
		}
		
	}

}
