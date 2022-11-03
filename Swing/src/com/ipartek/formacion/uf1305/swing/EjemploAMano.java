package com.ipartek.formacion.uf1305.swing;

import java.awt.Container;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.WindowConstants;

public class EjemploAMano {

	public static void main(String[] args) {
		JFrame frame = new JFrame("Ejemplo hecho a mano");
		frame.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
		frame.setBounds(0, 0, 500, 300);

		JTextField tf = new JTextField(20);
		Container c = frame.getContentPane();

		c.setLayout(new FlowLayout());

		// c.add(tf, BorderLayout.NORTH);
		c.add(tf);

		JButton btn = new JButton("Aceptar");

		c.add(btn);

		JLabel lbl = new JLabel("Texto por defecto");

		c.add(lbl);

//		btn.addActionListener(new ActionListener() {
//
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				lbl.setText("Hola " + tf.getText());
//			}
//		});
		
		btn.addActionListener(e -> lbl.setText("Hola " + tf.getText()));

		frame.setVisible(true);
	}

}
