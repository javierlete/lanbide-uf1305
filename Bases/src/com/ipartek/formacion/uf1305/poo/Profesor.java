package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Objects;

public class Profesor extends Persona {
	private ArrayList<String> materias = new ArrayList<>();
	
	public Profesor(Long id, String nombre, String apellido, LocalDate fechaNacimiento, Dni dni,
			ArrayList<String> materias) {
		super(id, nombre, apellido, fechaNacimiento, dni);
		this.materias = materias;
	}
	
	public Profesor(String nombre, String apellido, LocalDate fechaNacimiento, Dni dni,
			ArrayList<String> materias) {
		this(null, nombre, apellido, fechaNacimiento, dni, materias);
	}

	public Profesor(String nombre, String apellido, LocalDate fechaNacimiento, Dni dni) {
		this(null, nombre, apellido, fechaNacimiento, dni, new ArrayList<String>());
	}
	
	public void addMateria(String materia) {
		materias.add(materia);
	}
	
	public void removeMateria(String materia) {
		materias.remove(materia);
	}
	
	public ArrayList<String> getMaterias() {
		return materias;
	}
	
	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(materias);
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (!super.equals(obj))
			return false;
		if (getClass() != obj.getClass())
			return false;
		Profesor other = (Profesor) obj;
		return Objects.equals(materias, other.materias);
	}

	@Override
	public String toString() {
		return "Profesor [materias=" + materias + ", toString()=" + super.toString() + "]";
	}
	
	
}
