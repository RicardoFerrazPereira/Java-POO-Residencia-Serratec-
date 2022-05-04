package br.com.novobanco.contas;

import java.util.HashMap;
import java.util.Map;
import java.util.Scanner;

import br.com.novobanco.contas.Conta;

public class Conta {

	Scanner sc = new Scanner(System.in);
		

	public String numConta;
	public String tipoConta;
	public String nome;
	public double saldo;
//	public ContaCorrente idContaCorrente;
	public Conta conta;
//	public Conta contaDestino;
	
	// Coloquei depois
	//public static Map<String, Conta> mapaContas = new HashMap<>();

	public Conta(String numConta, String tipoConta, String nome) {
		super();
		this.numConta = numConta;
		this.tipoConta = tipoConta;
		this.nome = nome;
		this.saldo = 0;
	}

	// Métodos

	public boolean sacar(double valor) {
		if (this.saldo < valor) {
			return false;
		} else {
			double novoSaldo = this.saldo - valor;
			this.saldo = novoSaldo;
			return true;
		}
	}

	public void depositar(double valor) {
		this.saldo += valor;
	}

//	public void transferir(double valor, Conta destino) {
//		if (this.saldo > valor) {
//			this.sacar(valor);
//			destino.depositar(valor);
//			// return true;
//		} else {
//			System.out.println("Não tem dinheiro");
//			// return false;
//		}
//	}
	
	
	public void transferir(double valor, Conta minhasContas[], Conta contaDestino) {
			if (this.saldo > valor) {
			this.sacar(valor);
			contaDestino.depositar(valor);
			}else {
				System.out.println("Não tem dinheiro");
			// return false;
		    }
		
	}

	@Override
	public String toString() {
		return "Conta [sc=" + sc + ", numConta=" + numConta + ", tipoConta=" + tipoConta + ", nome=" + nome + ", saldo="
				+ saldo +  ", conta=" + conta + "]";
	}
	

}
