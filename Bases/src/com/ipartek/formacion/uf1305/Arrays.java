package com.ipartek.formacion.uf1305;

public class Arrays {

	public static void main(String[] args) {
		int tamaño = 3;
		int[] arr = new int[tamaño];

		arr[0] = 10;
		arr[1] = 20;
		arr[2] = 30;

		System.out.println(arr[0]);
		System.out.println(arr[1]);
		System.out.println(arr[2]);

		for (int dato : arr) {
			System.out.println(dato);
		}

		char[][] tresEnRaya = new char[3][3];

		for (int y = 0; y < tresEnRaya.length; y++) {
			for (int x = 0; x < tresEnRaya[y].length; x++) {
				tresEnRaya[x][y] = '.';
			}
		}
		
		tresEnRaya[1][1] = 'O';
		tresEnRaya[0][0] = 'X';
		tresEnRaya[0][1] = 'O';
		tresEnRaya[2][0] = 'X';
		tresEnRaya[1][0] = 'O';

		for (int y = 0; y < tresEnRaya.length; y++) {
			for (int x = 0; x < tresEnRaya[y].length; x++) {
				System.out.print(tresEnRaya[x][y] + " ");
			}
			
			System.out.println();
		}
	}

}
