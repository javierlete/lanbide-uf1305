package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;

public class ObjectPrueba {

	public static void main(String[] args) {
		Object o = new Object();
		
		System.out.println(o.getClass().getName());
		System.out.println(Integer.toHexString(o.hashCode()));
		System.out.println(o.equals(new Object()));
		System.out.println(o.toString());
		
		Persona p1 = new Persona(1L, "Javier", "Lete", LocalDate.of(1900, 1, 2), new Dni("12345678Z"));
		Persona p2 = new Persona(1L, "Javier", "Lete", LocalDate.of(1900, 1, 2), new Dni("12345678Z"));
		
		System.out.println(p1 == p2);
		System.out.println(p1.equals(p2));
	}

}
