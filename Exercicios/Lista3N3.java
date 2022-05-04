package br.com.residencia;

import java.util.Scanner;

public class Lista3N3 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		double kg;
		double g;
		double tara = 465;

		System.out.println("Digite o pre�o do Kg: ");
		kg = scan.nextDouble();
		System.out.println("Digite o total em gramas: ");
		g = scan.nextDouble();

		scan.close();

		double gramas = kg / 10;
		double pesoConsumido = g - tara;
		double valorTotal = pesoConsumido * gramas / 100;

		System.out.println("#####  SELF-SERVICE  #####");
		System.out.println("Tara do Pratos: " + tara + " gramas");
		System.out.printf("Pre�o de 100 gramas: R$ %2.2f\n", gramas);
		System.out.println("Peso consumido: " + pesoConsumido);
		System.out.println("Valor Total = R$ " + valorTotal);

	}

}
/* O restaurante "Self-Service" precisa de um programa para imprimir as
 * etiquetas de "comanda" na pesagem dos pratos. O operador da balan�a ir� 
 * digitar o pre�o do quilo e o total em gramas da refei��o, considerando 
 * que o prato vazio pesa 465 gramas (tara). A etiqueta ir� conter o nome 
 * do restaurante, o tara do prato, o pre�o de 100 gramas, o peso consumido
 *  e o valor total.
 */