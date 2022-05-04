package br.com.residencia;

import java.util.Scanner;

public class Exercicio01 {
	public static void main(String[] args) {

		String nome, sobrenome;
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite seu nome: ");
		nome = scan.next();
		System.out.println("Digite seu sobrenome: ");
		sobrenome = scan.next();   
		for (int i = 0; i <= 20; i++) {  // comando 'para' pular linha 20 vezes
			System.out.println("\n");
		}
		System.out.println("Meu nome é " + nome + " " + sobrenome);
		scan.close();
	}
}
//exercico01 - aula 02 - dia 07 abril quinta-feira