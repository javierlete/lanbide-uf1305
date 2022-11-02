package com.ipartek.formacion.uf1305.poo;

import java.util.Objects;

public class Dni {
	private static final String LETRAS_DNI = "TRWAGMYFPDXBNJZSQVHLCKE";
	private static final String REGEX_DNI = "^[\\dXYZ]\\d{7}[" + LETRAS_DNI + "]$";

	private String numeroYLetraValido;

	public Dni(String numeroYLetra) {
		if (validarDni(numeroYLetra)) {
			this.numeroYLetraValido = numeroYLetra.toUpperCase();
		} else {
			throw new RuntimeException("El DNI no es válido");
		}
	}

	public String getNumeroYLetra() {
		return numeroYLetraValido;
	}

	public boolean isExtranjero() {
		char primerCaracter = numeroYLetraValido.charAt(0);

		boolean esExtranjero = primerCaracter == 'X' || primerCaracter == 'Y' || primerCaracter == 'Z';

		return esExtranjero;
	}

	public char getLetra() {
		char letra = numeroYLetraValido.charAt(8);
		return letra;
	}

	public String getNumero() {
		String numero = numeroYLetraValido.substring(0, 8);

		return numero;
	}

	public static boolean validarDni(String numeroYLetraAValidar) {
		if (numeroYLetraAValidar == null) {
			return false;
			// throw new RuntimeException("El número y letra no pueden ser nulos");
		}

		numeroYLetraAValidar = numeroYLetraAValidar.toUpperCase();

		if (!numeroYLetraAValidar.matches(REGEX_DNI)) {
			return false;
			// throw new RuntimeException("El formato del DNI debe ser 12345678A o
			// X1234567B");
		}

		String numeroSinLetraDelFinal = numeroYLetraAValidar.substring(0, 8); // 12345678 o X234567
		String numeroSoloConDigitos = numeroSinLetraDelFinal.replace('X', '0').replace('Y', '1').replace('Z', '2'); // 12345678
		int numero = Integer.parseInt(numeroSoloConDigitos);
		
		char letra = numeroYLetraAValidar.charAt(8);
		
		int restoDeLaDivisionEntera = numero % 23;
		char letraCorrecta = LETRAS_DNI.charAt(restoDeLaDivisionEntera);

		boolean dniCorrecto = letra == letraCorrecta;

		return dniCorrecto;
	}

	@Override
	public int hashCode() {
		return Objects.hash(numeroYLetraValido);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Dni other = (Dni) obj;
		return Objects.equals(numeroYLetraValido, other.numeroYLetraValido);
	}

	@Override
	public String toString() {
		return "Dni [numeroYLetra=" + numeroYLetraValido + "]";
	}
}
