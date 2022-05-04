package br.com.novobanco.menus;

import java.util.Scanner;

public class Menu {
		 
		Scanner sc = new Scanner(System.in);
		
		public void menuOpcoes() {
			
			System.out.println("===========================================");
			System.out.println("     G R U P O  3  B A N K I N G           ");
			System.out.println("===========================================");
			System.out.println("[1] Movimentação da Conta");
			System.out.println("[2] Relatórios");
			System.out.println("[3] Sair");
			System.out.print("Operação: ");
			//int opcao = sc.nextInt();
		}	
		public void operacoes() {
			System.out.println("===========================================");
			System.out.println("  S I S T E M A   B A N C A R I O          ");
			System.out.println("===========================================");
			System.out.println("[1] Saque");
			System.out.println("[2] Depósito");
			System.out.println("[3] Transferência");
			System.out.println("[4] Sair");
			System.out.print("Escolha uma opção: ");
			//int oper = sc.nextInt();
		}
		public void relatorio() {
			
			System.out.println("===================================================");
			System.out.println("        S I S T E M A   I N T E R N O              ");
			System.out.println("===================================================");
			System.out.println("[1] Relatório de número de contas da agência.");
			System.out.println("[2] Relatório de todos os clientes do sistema.");
			System.out.println("[3] Relatório com o valor total armazenado no banco");
			System.out.println("[4] Sair");
			System.out.print("Digite a opção desejada:");
			int relatorio = sc.nextInt();
			
			switch (relatorio) {
			case 1: 
				System.out.println("Gerente");
				break;
			case 2:
				System.out.println("Diretor");
				break;
			case 3:
				System.out.println("Presidente");
			case 4: 
				System.out.println("Chamar menu inicial");// chamar menu inicial
				break;
			
			default:
				System.out.println("Opção Inválida!");
			}
			
		}
		
}	
				 
//	public void menuOpcoes() {
//		System.out.println("------------------------------");
//		System.out.println("      MENU DE OPÇÕES          ");
//		System.out.println("------------------------------");
//		System.out.println("[1] Movimentação da Conta");
//		System.out.println("[2] Relatórios");
//		System.out.println("[3] Sair");
//		System.out.print("Operação: ");
//	}
//	public void operacoes() {
//		System.out.println("------------------------------");
//		System.out.println("      ESCOLHA UMA OPERAÇÃO    ");
//		System.out.println("------------------------------");
//		System.out.println("[1] Saque");
//		System.out.println("[2] Depósito");
//		System.out.println("[3] Transferência");
//		System.out.println("[4] Sair");
//		System.out.println("Escolha uma opção: ");
//		
//	}
//	
//}
