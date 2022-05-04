package br.com.residencia;

import java.util.Scanner;

public class Lista1n1 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		String nome;
		String sobrenome;

		System.out.println("Qual o seu nome? ");
		nome = scan.next();

		System.out.println("Qual o seu sobrenome? ");
		sobrenome = scan.next();

		System.out.println("Olá " + nome + " " + sobrenome + ", seja bem-vindo(a) ao universo da programação!");

		scan.close();
	}

}
//exercicio 1 - lista 1 de portugol
//O programa “bem-vindo” pergunta seu nome e sobrenome, e depois gentilmente te cumprimenta.