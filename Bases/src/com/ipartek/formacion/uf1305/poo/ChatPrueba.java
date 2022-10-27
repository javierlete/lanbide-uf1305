package com.ipartek.formacion.uf1305.poo;

import static com.ipartek.formacion.uf1305.bibliotecas.Consola.*;

public class ChatPrueba {

	public static void main(String[] args) {
		Chat c1 = new Chat("chateador1");
		Chat c2 = new Chat("chateador2");

		String mensaje = null;

		boolean primero = true;

		Chat chateadorActual;

		boolean salir = false;
		
		do {
			chateadorActual = primero ? c1 : c2;
			primero = !primero;
			
			mensaje = getString("Dime tu mensaje (" + chateadorActual.getNombre() + ")");
			
			if("salir".equals(mensaje)) {
				salir = true;
			} else {
				chateadorActual.mandarMensaje(mensaje);
			}
		} while (!salir);

		System.out.println(Chat.obtenerChatGlobal());
	}

}
