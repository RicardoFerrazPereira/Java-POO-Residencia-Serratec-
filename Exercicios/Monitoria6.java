package br.com.residencia;

import java.util.Scanner;

public class Monitoria6 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int num;
		
		System.out.println("Digite um numero entre 1 e 1000: ");
		num = sc.nextInt();
		
		int i;
		
		 while (num < 1 || num > 1000) {
			 System.out.println("Erro! Digite um número entre 1 e 1000: ");
			 num = sc.nextInt();
			 
		 }
		 for (i = 0; i <= num; i++) {
			 if (i % 2 == 1) {
			 System.out.println(i);
			}			
		}
		 sc.close();
	}	
}	
				


