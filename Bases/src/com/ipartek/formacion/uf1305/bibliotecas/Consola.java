package com.ipartek.formacion.uf1305.bibliotecas;

import java.util.Scanner;

public class Consola {
	private static final Scanner sc = new Scanner(System.in);
	
	private Consola() {}
	
	/**
	 * Imprime el objeto recibido en consola con una finalización de enter
	 * @param o objeto a mostrar
	 */
	public static void pl(Object o) {
		System.out.println(o);
	}
	
	public static void p(Object o) {
		System.out.print(o);
	}
	
	public static int getInt(String mensaje) {
		p(mensaje + ": ");
		
		int i = sc.nextInt();
		sc.nextLine();
		
		return i;
	}
	
	public static String getString(String mensaje) {
		p(mensaje + ": ");
		
		return sc.nextLine();
	}
	
	public static double sin(double prueba) {
		return 0.0;
	}
}
