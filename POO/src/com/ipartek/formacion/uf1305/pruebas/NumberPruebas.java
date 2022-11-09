package com.ipartek.formacion.uf1305.pruebas;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.List;

public class NumberPruebas {

	public static void main(String[] args) {
		List<Number> numeros = //new ArrayList<>();
				List.of(5, 4.3, new BigDecimal("1234.123"), new BigInteger("1234561"));
		
//		numeros.add(5);
//		numeros.add(4.3);
//		numeros.add(new BigDecimal("1234.123"));
//		numeros.add(new BigInteger("123461"));

		double total = 0.0;
		double num;
		for(Number numero: numeros) {
			num = numero.doubleValue();
			total += num;
			
			System.out.println(num);
		}
		
		System.out.println("Total = " + total);
		
		
	}
}
