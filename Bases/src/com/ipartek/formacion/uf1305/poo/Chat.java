package com.ipartek.formacion.uf1305.poo;

public class Chat {
	// private static String salaGlobal = "";
	private static final StringBuffer salaGlobal = new StringBuffer();

	private String nombre;

	public Chat(String nombre) {
		this.nombre = nombre;
	}

	public String getNombre() {
		return nombre;
	}

	public void mandarMensaje(String mensaje) {
		// salaGlobal += nombre + ": " + mensaje + "\n";
		
		// salaGlobal = new StringBuffer(salaGlobal).append(nombre).append(": ").append(mensaje).append("\n").toString();
		
		salaGlobal.append(nombre).append(": ").append(mensaje).append("\n");
	}

	public static String obtenerChatGlobal() {
		return salaGlobal.toString();
	}
}
