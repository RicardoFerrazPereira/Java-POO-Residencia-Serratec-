package br.com.residencia;

import java.util.HashSet;
import java.util.Set;

public class ArrayAula {

	public static void main(String[] args) {

		int tamanho = 10;

		double[] arrayVar = new double[tamanho];

		for (int i = 0; i < tamanho; i++) {
			arrayVar[i] = i * tamanho;

		}
		for (int i = 0; i < arrayVar.length; i++) {
			System.out.println(arrayVar[i]);

		}

	}

}
