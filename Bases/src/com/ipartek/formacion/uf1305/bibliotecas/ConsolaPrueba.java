package com.ipartek.formacion.uf1305.bibliotecas;

import static com.ipartek.formacion.uf1305.bibliotecas.Consola.*;

public class ConsolaPrueba {

	public static void main(String[] args) {
		pl("Hola a todos");
		
		int i = getInt("Dime un número");
		
		String s = getString("Dime un texto");
		
		pl(i);
		pl("[" + s + "]");
	}

}
