package br.com.residencia;

import java.util.Scanner;

public class Lista1n4 {

	public static void main(String[] args) {
		
		Scanner scan = new Scanner(System.in);
		
		int c;
		double f;
		
		System.out.println("Informe a temperatura em Celsious: ");
		c = scan.nextInt();
		
		f = (c * 1.8 + 32);
		
        System.out.println("Temperatura em °C: " +c+"°");
        System.out.println("Temperatura em °F: " +f+"°");
        
        scan.close();
        
		}

}
// exercico 4 da lista 1 de portugol
//O programa “termômetro” lê uma temperatura em graus celsius, 
//e devolve sua equivalência na escala fahrenheit. 
//(Use: F = C * 1, 8 + 32)