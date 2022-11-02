package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;

public class ProfesorPrueba {
	public static void main(String[] args) {
		Profesor profesor = new Profesor("Javier", "Lete", LocalDate.of(1970, 11, 12), new Dni("12345678Z"));

		System.out.println(profesor);

		profesor.setId(1L);
		profesor.setNombre("Javier");

		profesor.addMateria("Java");
		profesor.addMateria("Ruby");
		profesor.addMateria(".NET");

		profesor.removeMateria("Ruby");

		for (String m : profesor.getMaterias()) {
			System.out.println(m);
		}

		System.out.println(profesor);

		Espacio espacio = new Espacio("Aula Ipartek");

		Persona persona = profesor;

		System.out.println(((Profesor) persona).getMaterias());

		Profesor profesor2 = (Profesor) persona;

		System.out.println(profesor2.getMaterias());

		espacio.entrar(persona);
		espacio.entrar(profesor);
		espacio.entrar(new Persona("Pepe"));

		System.out.println("LISTADO DE PERSONAS DEL ESPACIO");

		for (Persona p : espacio.getPersonas()) {
			System.out.println(p);
			
			if (p instanceof Profesor) {
				Profesor pro = (Profesor) p;
				System.out.println(pro.getMaterias());
			}
		}
	}
}
