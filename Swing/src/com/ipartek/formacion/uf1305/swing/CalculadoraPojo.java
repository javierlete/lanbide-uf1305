package com.ipartek.formacion.uf1305.swing;

public class CalculadoraPojo {
	private double op1, op2, resultado;
	private String operador;
	private String textoDisplay = "";
	
	public double getOp1() {
		return op1;
	}
	public void setOp1(double op1) {
		this.op1 = op1;
	}
	public double getOp2() {
		return op2;
	}
	public void setOp2(double op2) {
		this.op2 = op2;
	}
	public double getResultado() {
		return resultado;
	}
	public String getOperador() {
		return operador;
	}
	public void setOperador(String operador) {
		this.operador = operador;
	}
	public String getTextoDisplay() {
		return textoDisplay;
	}
	public void setTextoDisplay(String textoDisplay) {
		this.textoDisplay = textoDisplay;
	}
	
	public void procesarBoton(String etiquetaBotonPulsado) {
		if (etiquetaBotonPulsado.matches("[\\d]")) {
			textoDisplay += etiquetaBotonPulsado;
		} else {
			procesarSimbolo(etiquetaBotonPulsado);
		}
	}
	
	public String procesarSimbolo(String simbolo) {
		switch (simbolo) {
		case "AC":
			textoDisplay = "";
			break;
		case "+/-":
			textoDisplay = String.valueOf(Double.parseDouble(textoDisplay) * -1);
			break;
		case "%":
			textoDisplay = String.valueOf(Double.parseDouble(textoDisplay) * .01);
			break;
		case ",":
			procesarComa();
			break;
		case "=":
			procesarIgual();

			break;
		default: // % + - * /
			op1 = Double.parseDouble(textoDisplay);
			operador = simbolo;
			textoDisplay = "";
		}
		return textoDisplay;
	}
	
	private void procesarComa() {
		if (textoDisplay.indexOf('.') == -1) {
			textoDisplay += ".";
		}
	}
	
	public void procesarIgual() {
		op2 = Double.parseDouble(textoDisplay);

		procesarOperacion();
		
		textoDisplay = String.valueOf(resultado);
	}
	
	public void procesarOperacion() {
		switch (operador) {
		case "+":
			resultado = op1 + op2;
			break;
		case "-":
			resultado = op1 - op2;
			break;
		case "x":
			resultado = op1 * op2;
			break;
		case "/":
			resultado = op1 / op2;
			break;
		}
	}

}
