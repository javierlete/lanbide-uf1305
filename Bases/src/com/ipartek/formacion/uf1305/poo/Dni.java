package com.ipartek.formacion.uf1305.poo;

public class Dni {
	private String numeroYLetra;
	
	public Dni(String numeroYLetra) {
		if(validarDni(numeroYLetra)) {
			this.numeroYLetra = numeroYLetra;
		} else {
			throw new RuntimeException("El DNI debe tener 9 caracteres");
		}
	}

	public static boolean validarDni(String numeroYLetra) {
		return numeroYLetra.length() == 9; 
	}
	
	@Override
	public String toString() {
		return "Dni [numeroYLetra=" + numeroYLetra + "]";
	}
}
