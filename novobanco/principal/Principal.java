package br.com.novobanco.principal;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.novobanco.contas.Conta;
import br.com.novobanco.contas.ContaCorrente;
import br.com.novobanco.menus.Menu;

public class Principal {

	public static void main(String[] args) {
		Conta minhasContas[] = new Conta[2];
		
		Menu m = new Menu();
		Conta c1 = new Conta("1", "CC", "Ricardo");
		Conta c2 = new Conta("2", "CC", "Ziva");
		Conta c3 = new ContaCorrente("3", "CC", "Farroch", 1);
		Conta c4 = new ContaCorrente("4", "CC", "Kyra", 2);
		minhasContas[0] = c1;
		minhasContas[1] = c2;
		c1.saldo = 1000;
		c2.saldo = 5000;
		c3.saldo = 3000;
		c4.saldo = 4000;
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		System.out.println(c3.saldo);
		System.out.println(c4.saldo);
		
		Map<String, Conta> mapaContas = new HashMap<>();
		mapaContas.put("Ricardo", c1);
	    mapaContas.put("Maria do Carmo", c2);
	    mapaContas.put("Farroch", c3);
		
		
//	    System.out.println(mapaContas);
//		System.out.println("Numero de contas = " + Conta.mapaContas.keySet());
		
//		m.relatorio();
		m.menuOpcoes();
		int opcao;
		
		Scanner sc = new Scanner(System.in);

		
		//m.menuOpcoes();
		opcao = sc.nextInt();

		switch (opcao) {
		case 1:
			m.operacoes();
			opcao = sc.nextInt();
			if (opcao == 1) {
				
				System.out.println("Digite o valor de saque: ");
				double valor = sc.nextDouble();
				c1.sacar(valor);

			} else if (opcao == 2) {
				
				System.out.println("Digite o valor do deposito: ");
				double valor = sc.nextDouble();
				c1.depositar(valor);

			} else if (opcao == 3) {
				System.out.println("Digite o valor da transferência: ");
				double valor = sc.nextDouble();
				System.out.println("Digite o número da conta destino: ");
				String numContaDestino = sc.next();
				for (int i = 0; i < 2; i++) {
					if(minhasContas[i].numConta.equals(numContaDestino)) {
					Conta contaDestino = minhasContas[i];
				//	c1.transferir(100.0, c2);
					c1.transferir(valor, minhasContas, contaDestino);
					}   
				} 
				
			} else if (opcao == 4) {
				System.out.println("sair");
				break;
			}

		case 2:
			System.out.println("Relatórios");
			break;

		case 3:
			System.out.println("SAIR");
			
			break;

		default:
			System.out.println("Opção inválida.");
		}
		sc.close();
		System.out.println(c1.saldo);
		System.out.println(c2.saldo);
		System.out.println(c3.saldo);
		System.out.println(c4.saldo);
		
		System.out.println("ok");

		
	}
}

