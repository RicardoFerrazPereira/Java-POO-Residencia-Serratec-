package br.com.residencia;

import java.util.Scanner;

public class Monitoria4 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		int num;

		System.out.println("Digite um n�mero inteiro para saber se � par ou �mpar: ");
		num = sc.nextInt();

		sc.close();

		if (num % 2 == 0) {
			System.out.println("O n�mero " + num + " � par!");
		} else {
			System.out.println("O n�mero " + num + " � �mpar!");
		}

	}

}
/* Fazer um programa para ler um n�mero inteiro e dizer se este n�mero � par ou �mpar.
*/