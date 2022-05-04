package br.com.residencia;

import java.util.Scanner;

public class Lista1n3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		float num1, num2, soma, sub, multi, divi;

		System.out.println("Escolha um número: ");
		num1 = scan.nextFloat();
		
		System.out.println("Escolha um número: ");
		num2 = scan.nextFloat();
		
		soma = num1 + num2;
		sub = num1 - num2;
		multi = num1 * num2;
		divi = num1 / num2;
		
		System.out.println("Soma = " + soma);
		System.out.println("Subtração = " + sub);
		System.out.println("Multiplicação = " + multi);
		System.out.println("Divisão = " + divi);
		
		
		scan.close();

	}

}
// exercico 3 lista 1 de portugol
// Crie o programa “mini calculadora”, que após ler dois números
//inteiros apresenta as operações de soma, subtração, multiplicação
//e divisão com eles. Obs.: Trate o maior número possível de erros
//(ex: operações com números negativos, divisão por zero, uso de letras, etc).