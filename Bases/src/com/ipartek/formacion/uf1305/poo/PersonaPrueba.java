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
		
		Persona p2 = new Persona(p);
		
		p2.setNombre("SOY UNA COPIA");
		
		System.out.println(p.getNombreCompleto());
		System.out.println(p2.getNombreCompleto());
		
		p.setNombre("Juan");
		
		if(p.getNombre() == new String("Juan")) {
			System.out.println("Está en la misma dirección de memoria");
		} else {
			System.out.println("No está en la misma dirección de memoria");
		}
		
		if(p.getNombre().equals(new String("Juan"))) {
			System.out.println("Sí se llama Juan");
		} else {
			System.out.println("No se llama Juan");
		}
		
		//p.setApellido(null);
		
		System.out.println(p.getApellido() instanceof String);
		
		if("González".equals(p.getApellido())) {
			System.out.println("Sí se apellida González");
		} else {
			System.out.println("No se apellida González");
		}
		
		Persona per1 = new Persona(1L, "Nombre", "Apellido", LocalDate.of(1234, 1, 2));
		Persona per2 = new Persona(1L, "Nombre", "Apellido", LocalDate.of(1234, 1, 2));
		
		if(per1 == per2) {
			System.out.println("Son el mismo");
		}
		
		// TODO Pendiente de herencia
		if(per1.equals(per2)) {
			System.out.println("Son iguales");
		}
		
		System.out.println(Persona.NOMBRE_VACIO);
		
		System.out.println(Math.sqrt(2));
		
		per2.setFechaNacimiento(LocalDate.now());
		
		System.out.println(per1.isMayorQue(per2));
		
		System.out.println(Persona.isMayorQue(per1, per2));
		
		System.out.println(Persona.getMayor(per1, per2).getNombreCompleto().toUpperCase());
		
		Persona mayor = Persona.getMayor(per1, per2);
		String nombreCompleto = mayor.getNombreCompleto();
		String nombreCompletoEnMayusculas = nombreCompleto.toUpperCase();
		
		System.out.println(nombreCompletoEnMayusculas);
	}
}
