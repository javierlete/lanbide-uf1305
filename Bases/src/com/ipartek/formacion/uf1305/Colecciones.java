package com.ipartek.formacion.uf1305;

import java.util.ArrayList;
import java.util.TreeMap;

public class Colecciones {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<>();

		al.add(6);
		al.add(3);

		System.out.println("Nº elementos: " + al.size());

		for (int dato : al) {
			System.out.println(dato);
		}

		TreeMap<String, String> diccionario = new TreeMap<>();

		diccionario.put("casa", "house");
		diccionario.put("perro", "dog");

		for (String clave : diccionario.keySet()) {
			System.out.printf("En la clave %s está el valor %s\n", clave, diccionario.get(clave));
		}
		
		System.out.println(diccionario.get("casa"));
	}

}
