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

		System.out.printf("O Valor da �rea desse circulo � %.4f m2", area);

	}

}
/* Fa�a um programa para ler o valor do raio de um c�rculo, e depois mostrar
 * o valor da �rea deste c�rculo com quatro casas decimais. F�rmula da �rea: 
 * area = tt . raio�. Considere o valor de tt = 3.14159.
 */