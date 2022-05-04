package br.com.residencia;

import java.util.Scanner;

public class Lista3N5 {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		float horasTrab;
		float valorHora;

		System.out.println("Informe a qtde. de horas trabalhadas: ");
		horasTrab = sc.nextFloat();
		System.out.println("Informe quanto o funcionario quecebe por hora: R$");
		valorHora = sc.nextFloat();

		sc.close();

		double salBruto = horasTrab * valorHora;
		double descInss;

		if (salBruto <= 1212) {
			descInss = 7.5;
		} else if (salBruto > 1212 && salBruto <= 2427.35) {
			descInss = 9;
		} else if (salBruto > 2427.35 && salBruto <= 3641.03) {
			descInss = 12;
		} else {
			descInss = 12;
		}

		double valorInss = salBruto / 100 * descInss;
		double salLiquido = salBruto - valorInss;

		System.out.println("#####  CONTRA-CHEQUE  #####\n");
		System.out.printf("Salário Bruto = R$ %.2f\n", salBruto);
		System.out.printf("Valor do desconto INSS = R$ %.2f\n", valorInss);
		System.out.printf("Salário Liquido = R$ %.2f", salLiquido);

	}

}
