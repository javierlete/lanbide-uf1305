package com.ipartek.formacion.uf1305.poo;

import java.time.LocalDate;
import java.time.Period;

// Clase (como un molde)
public class Persona {
	private static final String NOMBRE_VACIO = "ANÓNIMO";
	// Variables de instancia
	private Long id;
	private String nombre;
	private String apellido;
	private LocalDate fechaNacimiento;
	
	// Constructores
	public Persona(Long id, String nombre, String apellido, LocalDate fechaNacimiento) {
		setId(id);
		setNombre(nombre);
		setApellido(apellido);
		setFechaNacimiento(fechaNacimiento);
	}
	
	public Persona(Long id, String nombre, String apellido) {
		this(id, nombre, apellido, null);
	}
	
	public Persona(String nombre, String apellido) {
		this(null, nombre, apellido, null);
	}
	
	public Persona(String nombre) {
		this(null, nombre, null, null);
	}
	
	public Persona() {
		this(null, NOMBRE_VACIO, null, null);
	}
	
	// Getters y setters
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		if(nombre == null) {
			throw new RuntimeException("No se admiten nombres nulos");
		}
		
		if(nombre.trim().length() == 0) {
			throw new RuntimeException("No se admiten nombres de longitud 0");
		}
		
		this.nombre = nombre.trim();
	}
	public String getApellido() {
		return apellido;
	}
	public void setApellido(String apellido) {
		this.apellido = apellido;
	}
	public LocalDate getFechaNacimiento() {
		return fechaNacimiento;
	}
	
	public void setFechaNacimiento(LocalDate fechaNacimiento) {
		this.fechaNacimiento = fechaNacimiento;
	}
	
	// Métodos de instancia
	public String getNombreCompleto() {
		return nombre + " " + apellido;
	}
	
	public int getEdad() {
		LocalDate hoy = LocalDate.now();
		int anyoActual = hoy.getYear();
		int anyoNacimiento = fechaNacimiento.getYear();
		int anyos = anyoActual - anyoNacimiento;
		
		LocalDate cumpleanyosActual = fechaNacimiento.withYear(anyoActual);
		
		if(hoy.isBefore(cumpleanyosActual)) {
			anyos--;
		}
		
		return anyos;
	}
	
	public int getAnyos() {
		Period p = Period.between(fechaNacimiento, LocalDate.now());
		
		return p.getYears();
	}

}





















