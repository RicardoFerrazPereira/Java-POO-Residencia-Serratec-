package br.com.novobanco.contas;

public class ContaCorrente extends Conta {

	public Integer idContaCorrente;
	// public double taxaManut;

	public ContaCorrente(String numConta, String tipoConta, String nome, Integer idContaCorrente) {
		super(numConta, tipoConta, nome);
		this.idContaCorrente = idContaCorrente;
	}

}
