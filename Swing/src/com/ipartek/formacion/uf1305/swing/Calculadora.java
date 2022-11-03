package com.ipartek.formacion.uf1305.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;
import javax.swing.SwingConstants;

public class Calculadora {

	private JFrame frame;
	private JTextField tfDisplay;
	private JPanel pBotonera;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Calculadora window = new Calculadora();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public Calculadora() {
		initialize();

		String[] etiquetas = { "AC", "+/-", "%", "/", "7", "8", "9", "x", "4", "5", "6", "-", "1", "2", "3", "+", "",
				"0", ",", "=" };

		JButton btn;

		for (String etiqueta : etiquetas) {
			btn = new JButton(etiqueta);
			btn.addActionListener(e -> {
				JButton botonPulsado = (JButton) e.getSource();
				String etiquetaBotonPulsado = botonPulsado.getText();
				String textoDisplay = tfDisplay.getText();

				if (etiquetaBotonPulsado.matches("\\d")) {
					textoDisplay += etiquetaBotonPulsado;
				} else {
					switch(etiquetaBotonPulsado) {
					case "AC":
						textoDisplay = "";
						break;
					}
				}
				tfDisplay.setText(textoDisplay);
			});
			pBotonera.add(btn);
		}
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		tfDisplay = new JTextField();
		tfDisplay.setHorizontalAlignment(SwingConstants.TRAILING);
		tfDisplay.setFont(new Font("Lucida Grande", Font.PLAIN, 20));
		frame.getContentPane().add(tfDisplay, BorderLayout.NORTH);
		tfDisplay.setColumns(10);

		pBotonera = new JPanel();
		frame.getContentPane().add(pBotonera, BorderLayout.CENTER);
		pBotonera.setLayout(new GridLayout(0, 4, 0, 0));
	}

}
