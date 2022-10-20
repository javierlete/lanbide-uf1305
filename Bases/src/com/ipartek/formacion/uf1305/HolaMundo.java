package com.ipartek.formacion.uf1305;

import java.util.Scanner;

/**
 * Clase básica para ver cosas básicas
 * 
 * @author javierlete
 *
 */
public class HolaMundo {

	/**
	 * Método de inicio de la aplicación
	 * 
	 * @param args Argumentos recibidos por consola
	 */
	@SuppressWarnings("unused")
	public static void main(String[] args) {
		/*
		 * Ejemplos básicos de sintaxis
		 */
		System.out.println("Hola"); // Muestra por consola hola

		char a = 'a';
		char enter = '\n';
		char contrabarra = '\\';

		long l = 1234123123123L;
		float f = 4.5f;
		boolean b = false;

		String s = "     Prueba      ";

		System.out.println(s.toUpperCase());

		System.out.println(s.trim());

		System.out.println(s.length());

		System.out.println(s.contains("rue"));

		System.out.println(s.indexOf("rue"));

		System.out.println(s.trim().equals("prueba"));

		System.out.println(s.trim().equalsIgnoreCase("prueba"));

		System.out.println(s.substring(7, 10));

		Scanner sc = new Scanner(System.in);

		System.out.println("Dame un número: ");

		int i = sc.nextInt();
		sc.nextLine();

		System.out.println(i);

		System.out.print("Dime tu nombre: ");

		String nombre = sc.nextLine();

		System.out.println("Hola " + nombre);
		
		sc.close();
	}

}
