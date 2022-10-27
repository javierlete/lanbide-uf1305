package com.ipartek.formacion.uf1305.poo;

public class DniPrueba {

	public static void main(String[] args) {
		Dni d = new Dni("12345678A");
		
		Persona p = new Persona();
		
		p.setDni(d);
		
		System.out.println(p);
	}

}
