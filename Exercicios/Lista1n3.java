package br.com.residencia;

import java.util.Scanner;

public class Lista1n3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float num1, num2, soma, sub, multi, divi;

		System.out.println("Escolha um n�mero: ");
		num1 = scan.nextFloat();
		
		System.out.println("Escolha um n�mero: ");
		num2 = scan.nextFloat();
		
		soma = num1 + num2;
		sub = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtra��o = " + sub);
		System.out.println("Multiplica��o = " + multi);
		System.out.println("Divis�o = " + divi);
		
		
		scan.close();

	}

}
// exercico 3 lista 1 de portugol
// Crie o programa �mini calculadora�, que ap�s ler dois n�meros
//inteiros apresenta as opera��es de soma, subtra��o, multiplica��o
//e divis�o com eles. Obs.: Trate o maior n�mero poss�vel de erros
//(ex: opera��es com n�meros negativos, divis�o por zero, uso de letras, etc).