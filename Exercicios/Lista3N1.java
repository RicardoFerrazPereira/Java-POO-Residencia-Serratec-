package br.com.residencia;

import java.util.Scanner;
	
public class Lista3N1 {
		
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		int cupons;
		
		System.out.println(">>>>>> Bem-vindo ao Programa de Fidelidade! <<<<<<");
		System.out.println("\tDigite a qtde. de cupons: ");
		cupons = scan.nextInt();
		
		scan.close();
		
		System.out.println("Voc� tem "+ cupons +" pontos no programa de fidelidade!");
	}

}
/* O �Programa de fidelidade� solicitou a cria��o do sistema �Ver os seus pontos�,
 *  onde o cliente poder� consultar seu saldo de pontos. O cliente ir� digitar um 
 *  n�mero inteiro correspondente aos seus cupons. Cada cupom corresponde a 1 ponto.
 */