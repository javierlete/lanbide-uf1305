package com.ipartek.formacion.uf1305.pruebas;

import java.util.ArrayList;
import java.util.List;

import com.ipartek.formacion.uf1305.poo.interfaces.Balon;
import com.ipartek.formacion.uf1305.poo.interfaces.Comestible;
import com.ipartek.formacion.uf1305.poo.interfaces.Naranja;
import com.ipartek.formacion.uf1305.poo.interfaces.Rodable;

public class InterfacesPrueba {

	public static void main(String[] args) {
		List<Rodable> rodables = new ArrayList<>();
		
		rodables.add(new Balon());
		rodables.add(new Naranja());
		
		for(Rodable r: rodables) {
			if(r instanceof Comestible c) {
				c.comer();
			}
			
			r.rodar();
			
			if(r instanceof Comestible c) {
				c.comer();
			}
		}
	}

}
