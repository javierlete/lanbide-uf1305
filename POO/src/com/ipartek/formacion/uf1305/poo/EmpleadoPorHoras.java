package com.ipartek.formacion.uf1305.poo;

import java.math.BigDecimal;
import java.util.Objects;

public class EmpleadoPorHoras extends Empleado {
	private BigDecimal sueldoPorHora;
	private Integer numeroHorasAlMes;
	
	public EmpleadoPorHoras(Long id, String nombre, String apellidos, Dni dni, BigDecimal sueldoPorHora,
			Integer numeroHorasAlMes) {
		super(id, nombre, apellidos, dni);
		this.sueldoPorHora = sueldoPorHora;
		this.numeroHorasAlMes = numeroHorasAlMes;
	}

	public BigDecimal getSueldoPorHora() {
		return sueldoPorHora;
	}

	public void setSueldoPorHora(BigDecimal sueldoPorHora) {
		this.sueldoPorHora = sueldoPorHora;
	}

	public Integer getNumeroHorasAlMes() {
		return numeroHorasAlMes;
	}

	public void setNumeroHorasAlMes(Integer numeroHorasAlMes) {
		this.numeroHorasAlMes = numeroHorasAlMes;
	}

	@Override
	public int hashCode() {
		final int prime = 31;
		int result = super.hashCode();
		result = prime * result + Objects.hash(numeroHorasAlMes, sueldoPorHora);
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
		EmpleadoPorHoras other = (EmpleadoPorHoras) obj;
		return Objects.equals(numeroHorasAlMes, other.numeroHorasAlMes)
				&& Objects.equals(sueldoPorHora, other.sueldoPorHora);
	}

	@Override
	public String toString() {
		return "EmpleadoPorHoras [sueldoPorHora=" + sueldoPorHora + ", numeroHorasAlMes=" + numeroHorasAlMes
				+ ", toString()=" + super.toString() + "]";
	}

	@Override
	public BigDecimal getSalarioMensual() {
		return sueldoPorHora.multiply(new BigDecimal(numeroHorasAlMes));
	}
	
	
}
