package br.com.residencia;

import java.util.Scanner;

public class Monitoria4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Digite um número inteiro para saber se é par ou ímpar: ");
		num = sc.nextInt();

		sc.close();

		if (num % 2 == 0) {
			System.out.println("O número " + num + " é par!");
		} else {
			System.out.println("O número " + num + " é ímpar!");
		}

	}

}
/* Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.
*/