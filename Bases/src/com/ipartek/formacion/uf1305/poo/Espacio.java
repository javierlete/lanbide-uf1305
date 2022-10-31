package com.ipartek.formacion.uf1305.poo;

import java.util.ArrayList;

public class Espacio {
	private String nombre;
	private ArrayList<Persona> personas = new ArrayList<>();
	
	public Espacio(String nombre) {
		this.nombre = nombre;
	}
	
	public Persona entrar(Persona persona) {
		personas.add(persona);
		return persona;
	}
	
	public Persona salir(Persona persona) {
		personas.remove(persona);
		return persona;
	}
	
	public ArrayList<Persona> getPersonas() {
		return personas;
	}

	@Override
	public String toString() {
		return "Espacio [nombre=" + nombre + ", personas=" + personas + "]";
	}
}
