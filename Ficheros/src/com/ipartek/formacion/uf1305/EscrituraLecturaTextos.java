package com.ipartek.formacion.uf1305;

import java.io.*;
import java.util.Scanner;

public class EscrituraLecturaTextos {

	public static void main(String[] args) throws IOException {
		FileWriter fw = new FileWriter("pruebas.txt");
		PrintWriter pw = new PrintWriter(fw);

		pw.println("Una línea");
		pw.println("Otra línea");

		pw.close();

		System.out.println("Terminado");

		FileReader fr = new FileReader("pruebas.txt");
		Scanner sc = new Scanner(fr);

		while (sc.hasNext()) {
			System.out.println(sc.nextLine());
		}
		
		sc.close();
	}

}
