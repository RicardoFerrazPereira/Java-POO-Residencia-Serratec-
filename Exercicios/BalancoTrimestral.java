package br.com.residencia;

public class BalancoTrimestral {

	public static void main(String[] args) {
		
		int gastosJan = 15000;
		int gastosFev = 23000;
		int gastosMar = 17000;
		int gastosTrimestre = gastosJan+gastosFev+gastosMar;
				
		System.out.println("Os gastos do trimestre foi de R$ "+ gastosTrimestre);
		
		int media = gastosTrimestre / 3;
				
		System.out.println("Média dos gastos = R$ " + media);
				
	}

}
