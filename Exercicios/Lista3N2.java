package br.com.residencia;

import java.util.Scanner;

public class Lista3N2 {

	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cupons;
		
		System.out.println(">>>>>> Bem-vindo ao Programa de Fidelidade! <<<<<<");
		System.out.println("Multiplique seus ganhos!!!");
		System.out.println("\tDigite a qtde. de cupons: ");
		cupons = scan.nextInt();
		int multi = cupons * 3;
		
		scan.close();
		
		System.out.println("Você tem "+ multi +" pontos no programa de fidelidade!");
	}

}
/* O “Programa de fidelidade” aumentou o sistema, criando o botão “Multiplique seus pontos”. 
 *  O cliente irá digitar quantos cupons tem, e o sistema irá triplicar o valor.
 */