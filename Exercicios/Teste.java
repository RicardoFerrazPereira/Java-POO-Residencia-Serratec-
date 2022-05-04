package br.com.residencia;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

public class Teste {

	private static int DAY_OF_YEAR;
	private static int MOUTH;

	public static void main(String[] args) throws ParseException {
//		Date date = new Date();
//		System.out.println(date);
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");    // data atual do sistema
//		Date date = new Date();
//		System.out.println("Data antes de formatar: " + date);
//		System.out.println("Data depois de formatar: " + sdf.format(date));
		
//		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");	  // data fixada
//		String stx = "07/11/1978";
//		Date dataUsuario = sdf.parse(stx);
//		System.out.println("Date digitado e formatado: " + sdf.format(dataUsuario));
		
		GregorianCalendar gc = new GregorianCalendar();
		
		//System.out.println(gc.DAY_OF_WEEK);
		
		gc.add(gc.MONTH, 4);
		
		System.out.println(gc.get(2));
		
		
		
		
		

	}

}
