package com.ipartek.formacion.uf1305.bibliotecas;

import static com.ipartek.formacion.uf1305.bibliotecas.Consola.*;
import static java.lang.Math.*;

public class ConsolaPrueba {

	public static void main(String[] args) {
//		Scanner sc = new Scanner(System.in);
//		
//		System.out.println("Hola a todos");
//		
//		System.out.print("Dime un número: ");
//		int i = sc.nextInt();
//		sc.nextLine();
//		
//		System.out.print("Dime un texto: ");
//		String s = sc.nextLine();
//		
//		System.out.println(i);
//		System.out.println("[" + s + "]");

		pl("Hola a todos");
		
		int i = getInt("Dime un número");
		
		String s = getString("Dime un texto");
		
		pl(i);
		pl("[" + s + "]");
		
		pl(Math.sin(5));
		pl(sqrt(5));
	}
}
