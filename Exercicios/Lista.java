package br.com.residencia;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class Lista {

	public static void main(String[] args) {

		List<String> lista = new ArrayList<>();

		lista.add("Maria");
		lista.add("Ana");
		lista.add("Bob");
		lista.add("Paulo");
		// vou adicionar um elemento na posição 2 (Bob).
		lista.add(2, "Marco");
		// ver o tamanho da lista
		System.out.println(lista.size());
		//

		for (String x : lista) {
			System.out.println(x);
		}
		System.out.println("Index of Bob: " + lista.indexOf("Bob")); // encontrar a posição do elemento (Bob)
		System.out.println("Indx of Marco: " + lista.indexOf("Marcelo")); //encontrar um elemento que não existe na lista (retorna -1)
		//lista.removeIf("M");
		System.out.println("------------------------------");
		List<String> result = lista.stream().filter(x -> x.charAt(0) == 'A').collect(Collectors.toList());
		for (String x : result) {
			System.out.println(x);
		}
		System.out.println("------------------------------");
		
	}

}
