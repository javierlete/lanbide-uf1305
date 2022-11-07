package com.ipartek.formacion.uf1305.swing;

import java.awt.EventQueue;
import java.awt.FlowLayout;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class CalculadoraSencilla {

	private JFrame frame;
	private JTextField tf1;
	private JTextField tf2;
	private JLabel lblResultado;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					CalculadoraSencilla window = new CalculadoraSencilla();
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
	public CalculadoraSencilla() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "rawtypes", "unchecked" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 574, 195);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));

		tf1 = new JTextField();
		frame.getContentPane().add(tf1);
		tf1.setColumns(10);

		JComboBox cbOperacion = new JComboBox();
		cbOperacion.setModel(new DefaultComboBoxModel(new String[] { "+", "-", "*", "/" }));
		frame.getContentPane().add(cbOperacion);

		tf2 = new JTextField();
		frame.getContentPane().add(tf2);
		tf2.setColumns(10);

		JButton btnIgual = new JButton("=");
		btnIgual.addActionListener(e -> {
			String tf1String = tf1.getText();
			String op = (String) cbOperacion.getSelectedItem();
			String tf2String = tf2.getText();

			double op1 = Double.parseDouble(tf1String);
			double op2 = Double.parseDouble(tf2String);

			double res = 0.0;

			switch (op) {
			case "+":
				res = op1 + op2;
				break;
			case "-":
				res = op1 - op2;
				break;
			case "*":
				res = op1 * op2;
				break;
			case "/":
				res = op1 / op2;
				break;
			}

			lblResultado.setText(String.valueOf(res));
		});
		frame.getContentPane().add(btnIgual);

		lblResultado = new JLabel("");
		frame.getContentPane().add(lblResultado);
	}

}
