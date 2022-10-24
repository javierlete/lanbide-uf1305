package com.ipartek.formacion.uf1305;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Scanner;

public class Fechas {

	public static void main(String[] args) {
		LocalDate hoy = LocalDate.now();
		
		System.out.println(hoy);
		
		LocalDate inicioCurso = LocalDate.of(2022, 10, 30);
		
		System.out.println(inicioCurso);
		
		System.out.println(inicioCurso.plusDays(100));
		System.out.println(inicioCurso.plusMonths(4));
		
		System.out.println(String.format("%1$td de %1$tm de %1$tY", hoy));
		System.out.printf("%1$td de %1$tm de %1$tY\n", hoy.plusDays(3));
		
		// 01/12/2023 12:34:56
		DateTimeFormatter dtf = DateTimeFormatter.ofPattern("dd'/'MM'/'yyyy' 'HH':'mm':'ss");
		
		Scanner sc = new Scanner(System.in);
		
		String fechaTexto = sc.nextLine();
		
		LocalDateTime ldt = LocalDateTime.parse(fechaTexto, dtf);
		
		System.out.println(ldt);
		
		sc.close();
		
		System.out.println(ldt.format(dtf));
	}

}
