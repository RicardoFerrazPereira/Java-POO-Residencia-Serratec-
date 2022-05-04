package br.com.residencia;

import java.util.Scanner;

public class Monitoria2 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		double raio;
		double tt = 3.14159;

		System.out.println("Insira o valor do raio de um circulo: ");
		raio = sc.nextDouble();
		sc.close();
		double area = tt * (raio * raio);

		System.out.printf("O Valor da área desse circulo é %.4f m2", area);

	}

}
/* Faça um programa para ler o valor do raio de um círculo, e depois mostrar
 * o valor da área deste círculo com quatro casas decimais. Fórmula da área: 
 * area = tt . raio². Considere o valor de tt = 3.14159.
 */