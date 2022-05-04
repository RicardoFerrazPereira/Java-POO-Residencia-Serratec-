package br.com.residencia;

import java.util.Scanner;

public class Lista1n3if {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);

		System.out.println("Digite [1] para somar");
		System.out.println("Digite [2] para subtrair");
		System.out.println("Digite [3] para multiplicar");
		System.out.println("Digite [4] para dividir");
		
		int n = scan.nextInt();
		
		System.out.println("Escolha um número: ");
		double num1 = scan.nextDouble();

		System.out.println("Escolha um número: ");
		double num2 = scan.nextDouble();
		
		if(n == 1) {
			System.out.println(num1 + num2);
		}else {
			if(n == 2) {
				System.out.println(num1 - num2);
			}else {
				if(n == 3 ) {
					System.out.println(num1 * num2);
				}else {
					if(n == 4 ) {
						System.out.println(num1 / num2);
					}
				}		
			}
		}
		scan.close();
	}	
}		
	


