package com.ipartek.formacion.uf1305;

import java.util.ArrayList;

public class Poligono implements java.io.Serializable {
	private static final long serialVersionUID = 1L;

	private ArrayList<Punto> puntos = new ArrayList<>();
	
	private String nombre;

	public Poligono(String nombre) {
		this.nombre = nombre;
	}
	
	public ArrayList<Punto> getPuntos() {
		return puntos;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
}
