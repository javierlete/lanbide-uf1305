package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;
import java.util.ArrayList;

public class EspacioPrueba {

	public static void main(String[] args) {
		Espacio espacio = new Espacio("Aula");
		
		Persona javier = espacio.entrar(new Persona("Javier"));
		espacio.entrar(new Persona("Pepe"));
		espacio.entrar(new Persona(1L, "Juan", "González", LocalDate.of(1234, 12, 31), new Dni("12345678Z")));
		
		System.out.println(espacio);
		
		espacio.salir(javier);
		
		for(Persona p: espacio.getPersonas()) {
			System.out.println(p);
		}
		
		System.out.println(espacio.getPersonas().get(1).getDni().getLetra());
		
		ArrayList<Persona> personas = espacio.getPersonas();
		Persona persona = personas.get(1);
		Dni dni = persona.getDni();
		char letra = dni.getLetra();
		
		System.out.println(letra);
	}

}
