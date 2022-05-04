package br.com.residencia;

import java.util.Scanner;

public class Lista3N4 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		double capacidade;

		System.out.println("Digite a capacidade da garrafa em mililitros: ");
		capacidade = scan.nextDouble();

		scan.close();

		double alcool = capacidade * 0.7;
		double gel = capacidade * 0.3;

		System.out.printf("Volume de Alcool: %2.2f mililitros", alcool);
		System.out.printf("\nVolume de Gel: %2.2f mililitros", gel);

	}

}
/* O laborat�rio fabricante de �lcool em gel precisa saber se o produto est� atingindo
 *  a concentra��o ideal para desinfec��o, que � de 70%. Para a ajudar o laborat�rio, 
 *  crie um programa onde ser� preenchida a capacidade da garrafa em mililitros, e o 
 *  resultado ser�o os volumes de �lcool e de gel que precisam ser misturados para 
 *  preenchimento do vasilhame.
 */