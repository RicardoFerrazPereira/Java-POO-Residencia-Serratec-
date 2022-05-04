package br.com.residencia;

import java.time.LocalDate;
import java.time.Period;

public class Dia {

	public static void main(String[] args) {

		LocalDate data = LocalDate.now().minusDays(1);
		System.out.println("Data: " + data);
		System.out.println("Dia Semana: " + data.getDayOfWeek().name());
		System.out.println("Dia Semana: " + data.getDayOfWeek().getValue());
		System.out.println("M�s: " + data.getMonthValue());
		System.out.println("M�s Nome: " + data.getMonth().name());
		System.out.println("Ano: " + data.getYear());

		LocalDate dataAniv = LocalDate.of(1980, 01, 10);

		Period p = Period.between(dataAniv, data);
		System.out.println(p);
		System.out.println(p.getYears());

	}

}
