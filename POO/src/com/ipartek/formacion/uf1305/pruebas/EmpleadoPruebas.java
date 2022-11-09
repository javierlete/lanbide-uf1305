package com.ipartek.formacion.uf1305.pruebas;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.uf1305.poo.Dni;
import com.ipartek.formacion.uf1305.poo.Empleado;
import com.ipartek.formacion.uf1305.poo.EmpleadoIndefinido;
import com.ipartek.formacion.uf1305.poo.EmpleadoPorHoras;

public class EmpleadoPruebas {

	public static void main(String[] args) {
		Empleado e = new EmpleadoIndefinido(1L, "Javier", "Lete", new Dni("12345678Z"), new BigDecimal("12345"), 14);
		System.out.println(e.getSalarioMensual());
		System.out.println(e);

		List<Empleado> oficina = //new ArrayList<>();
				List.of(e,
						new EmpleadoPorHoras(2L, "Pepe", "Perez", new Dni("Y2345678Z"), new BigDecimal("20"), 80)
				);

		// oficina.add(e);
		// oficina.add(new EmpleadoPorHoras(2L, "Pepe", "Perez", new Dni("Y2345678Z"), new BigDecimal("20"), 80));

		BigDecimal total = BigDecimal.ZERO;
		BigDecimal salarioMensual;

		for (Empleado empleado : oficina) {
			salarioMensual = empleado.getSalarioMensual();
			total = total.add(salarioMensual);

			System.out.println(salarioMensual);
		}

		System.out.println("Total = " + total);
	}

}
