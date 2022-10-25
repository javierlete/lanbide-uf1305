package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;

public class PersonaPrueba {

	public static void main(String[] args) {
		Persona p = null; // null 0x100 64bits
		
		// p.setId(5L);
		
		p = new Persona();

		// p.getId() // No se puede llamar a un método desde null

		p = new Persona("Pepe", "Pérez");

		System.out.println(p.getNombre());

		p.setId(null);
		p.setNombre("Juan");
		p.setApellido("González");
		p.setFechaNacimiento(LocalDate.of(2000, 10, 26));

		System.out.println(p.getNombre());

		System.out.println(p.getNombreCompleto());
		
		System.out.println(p.getEdad());
		System.out.println(p.getAnyos());
	}
}
