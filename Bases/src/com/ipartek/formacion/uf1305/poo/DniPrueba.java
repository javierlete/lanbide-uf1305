package com.ipartek.formacion.uf1305.poo;

public class DniPrueba {

	public static void main(String[] args) {
		System.out.println(Dni.validarDni("12345678Z"));
		
		Dni d = new Dni("Y2345678Z");
		
		Dni d2 = new Dni("12345678z");
		
		Persona p = new Persona();
		
		p.setDni(d);
		
		System.out.println(p);
		
		System.out.println(d);
		System.out.println(d2);
	}

}
