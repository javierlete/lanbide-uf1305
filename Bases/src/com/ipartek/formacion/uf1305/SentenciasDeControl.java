package com.ipartek.formacion.uf1305;

public class SentenciasDeControl {

	public static void main(String[] args) {
		int i = 0;

		if (i != 0) {
			System.out.println("OK");
		} else {
			System.out.println("KO");
		}

		String opcion = "borrar";

		switch (opcion) {
		case "insertar":
			break;
		case "modificar":
			break;
		case "borrar":
			System.out.println("Borrando");
			break;
		default:
			System.out.println("No conozco dicha opción");
		}

		int c = 1;
		while (c <= 3) {
			System.out.print(c + " ");
			c++;
		}

		c = 1;
		do {
			System.out.print(c + " ");
			c++;
		} while (c <= 3);

		bucledenso: for(c = 1; c <= 3; c++) {
			if(c == 2) {
				continue bucledenso;
			}

			System.out.print(c + " ");
		}
	}
}
