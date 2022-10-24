package com.ipartek.formacion.uf1305;

public class Operadores {

	public static void main(String[] args) {
		System.out.println(5 ^ 3);
		System.out.println(~((byte) 5) + 1);

		int a = 5, b = 10, total;

		total = a > b ? a : b;

		System.out.println(total);
	}

}
