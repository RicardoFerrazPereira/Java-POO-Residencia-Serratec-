package br.com.residencia;

import java.util.Scanner;

public class Monitoria3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Insira um número inteiro: ");
		num = sc.nextInt();

		sc.close();

		if (num <= -1) {
			System.out.println("O numero " + num + " é negativo");
		} else {
			System.out.println("O numero " + num + " é positivo");
		}
	}

}
/* Fazer um programa para ler um número inteiro, e depois dizer se este
 * número é negativo ou não.
 */
