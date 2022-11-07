package com.ipartek.formacion.uf1305;

import java.io.*;

public class EscrituraLecturaObjetos {

	public static void main(String[] args) throws IOException, ClassNotFoundException {
		Poligono p = new Poligono("Yupi");
		
		p.getPuntos().add(new Punto(3, 4));
		p.getPuntos().add(new Punto(7, 4));
		p.getPuntos().add(new Punto(5, 7));
		p.getPuntos().add(new Punto(3, 4));
		
		FileOutputStream fos = new FileOutputStream("poligono.dat");
		ObjectOutputStream oos = new ObjectOutputStream(fos);
		
		oos.writeObject(p);
		
		oos.close();
		
		FileInputStream fis = new FileInputStream("poligono.dat");
		ObjectInputStream ois = new ObjectInputStream(fis);
		
		Poligono p2 = (Poligono) ois.readObject();
		
		System.out.println(p2.getNombre());
		
		for(Punto pt: p2.getPuntos()) {
			System.out.println(pt);
		}
		
		ois.close();
	}

}
