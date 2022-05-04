// exercico 02 aula 02 dia 07 março - quinta

package br.com.residencia;

import java.util.Scanner;

public class Exercicio02 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int num1, num2, soma;

		System.out.println("Digite o primeiro numero: ");
		num1 = scan.nextInt();
		System.out.println("Digite o segundo numero: ");
		num2 = scan.nextInt();
		soma = num1 + num2;
		System.out.println("A soma dos dois numeros é = " + soma);

		scan.close();
			}
}
