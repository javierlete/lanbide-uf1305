package com.ipartek.formacion.uf1305.bibliotecas;

import java.util.Scanner;

public class Consola {
	private static final Scanner sc = new Scanner(System.in);
	
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
}
