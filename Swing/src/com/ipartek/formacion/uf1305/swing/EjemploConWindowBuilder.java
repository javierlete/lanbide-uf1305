package com.ipartek.formacion.uf1305.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultComboBoxModel;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class EjemploConWindowBuilder {

	private JFrame frame;
	private JTextField tfSaludar;
	private JLabel lblSaludar;
	@SuppressWarnings("rawtypes")
	private JComboBox cbSaludar;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					EjemploConWindowBuilder window = new EjemploConWindowBuilder();
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
	public EjemploConWindowBuilder() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	@SuppressWarnings({ "unchecked", "rawtypes" })
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 410, 235);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(new BorderLayout(0, 0));
		
		JPanel panel = new JPanel();
		frame.getContentPane().add(panel, BorderLayout.NORTH);
		
		cbSaludar = new JComboBox();
		panel.add(cbSaludar);
		cbSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludar.setText((String) cbSaludar.getSelectedItem());
			}
		});
		cbSaludar.setModel(new DefaultComboBoxModel(new String[] {"Uno", "Dos", "Tres", "Cuatro"}));
		
		tfSaludar = new JTextField();
		panel.add(tfSaludar);
		tfSaludar.setColumns(10);
		
		lblSaludar = new JLabel("Dime a quién saludar");
		panel.add(lblSaludar);
		
		JButton btnSaludar = new JButton("Saludar");
		panel.add(btnSaludar);
		btnSaludar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				lblSaludar.setText("Hola " + tfSaludar.getText());
			}
		});
	}
}
