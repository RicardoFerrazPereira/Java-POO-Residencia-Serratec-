package br.com.residencia;

import java.util.Scanner;

public class Lista1n2 {

	public static void main(String[] args) {

		Scanner scan = new Scanner(System.in);

		int co1;
		int co2;
		int co3;
		int co4;
		int co5;
		int mi;
		int soma;

		System.out.println("Idede colega 1: ");
		co1 = scan.nextInt();

		System.out.println("Idede colega 2: ");
		co2 = scan.nextInt();

		System.out.println("Idede colega 3: ");
		co3 = scan.nextInt();

		System.out.println("Idede colega 4: ");
		co4 = scan.nextInt();

		System.out.println("Idede colega 5: ");
		co5 = scan.nextInt();

		System.out.println("Minha idade: ");
		mi = scan.nextInt();

		soma = co1 + co2 + co3 + co4 + co5 + mi;

		System.out.println("O tempo de vida meu e dos meus colegas é = " + soma);

		scan.close();

	}

}
// exercicio 2 lista 1 de portugol
//O programa “Tempo de vida” irá imprimir a soma das idades de todos os colegas da 
//sua equipe (6 pessoas). Pergunte a cada um a idade e não esqueça a sua! Depois faça
//a atribuição direta da expressão em uma variável inteira.