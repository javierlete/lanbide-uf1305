package com.ipartek.formacion.uf1305.poo.interfaces;

public class Naranja extends Fruto implements Rodable, Comestible {

	private boolean sucia = false;
	
	@Override
	public void rodar() {
		System.out.println("Naranja rodando");
		sucia = true;
	}

	@Override
	public void comer() {
		if(sucia) {
			System.out.println("PUAJJJJ, QUE PUTO ASCO");
		} else {
			System.out.println("Naranja, ÑAM, que rica");
		}
	}
}
