package br.com.residencia;

import java.util.Scanner;

public class Monitoria3 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;

		System.out.println("Insira um n�mero inteiro: ");
		num = sc.nextInt();

		sc.close();

		if (num <= -1) {
			System.out.println("O numero " + num + " � negativo");
		} else {
			System.out.println("O numero " + num + " � positivo");
		}
	}

}
/* Fazer um programa para ler um n�mero inteiro, e depois dizer se este
 * n�mero � negativo ou n�o.
 */
