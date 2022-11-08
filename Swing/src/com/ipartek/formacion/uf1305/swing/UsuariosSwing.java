package com.ipartek.formacion.uf1305.swing;

import java.awt.BorderLayout;
import java.awt.EventQueue;
import java.awt.GridBagConstraints;
import java.awt.GridBagLayout;
import java.awt.Insets;
import java.awt.event.*;
import java.util.Map;
import java.util.TreeMap;

import javax.swing.JButton;
import javax.swing.JFormattedTextField;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JSplitPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class UsuariosSwing {
	private Map<Long, Usuario> usuarios = new TreeMap<>();

	private JFrame frmMantenimientoDeUsuarios;
	private JTable jt;
	private JTextField tfNombre;
	private JTextField tfEmail;
	private JPasswordField tfPassword;
	private static JSplitPane splitPane;
	private JScrollPane scrollPane;
	private JFormattedTextField tfId;
	
	private DefaultTableModel tm;
	private JPanel panel_1;
	private JButton btnBorrar;
	private JLabel lblEstado;
	
	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					UsuariosSwing window = new UsuariosSwing();
					window.frmMantenimientoDeUsuarios.setVisible(true);
					splitPane.setDividerLocation(0.5);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public UsuariosSwing() {
		initialize();

		rellenarUsuariosMemoria();

		// Obtenemos el modelo de la JTable
		// Nos sirve para modificar el CONTENIDO de la tabla
		// "Qué es lo que se va a ver"

		tm = (DefaultTableModel) jt.getModel();

		tm.addColumn("Id");
		tm.addColumn("Nombre");
		tm.addColumn("Email");

		rellenarTabla();
		
		scrollPane = new JScrollPane(jt);
		splitPane.setLeftComponent(scrollPane);
		
		
		jt.addMouseListener(new MouseAdapter() 
		   {
		      public void mouseClicked(MouseEvent e) 
		      {
		         rellenarFormulario(e);
		      }

		   });
	}
	
	private void rellenarFormulario(MouseEvent e) {
		int fila = jt.rowAtPoint(e.getPoint());
         int columna = 0;
         // int columna = jt.columnAtPoint(e.getPoint());
//         if ((fila > -1) && (columna > -1))
//            System.out.println(tm.getValueAt(fila,columna));
         
         Long id = (Long)tm.getValueAt(fila, columna);
         
         Usuario usuario = usuarios.get(id);
         
         tfId.setText(usuario.getId().toString());
         tfNombre.setText(usuario.getNombre());
         tfEmail.setText(usuario.getEmail());
         
         lblEstado.setText("Cargado el registro id: " + id);
	}

	private void rellenarTabla() {
		tm.setRowCount(0);
		
		for (Usuario u : usuarios.values()) {
			tm.addRow(new Object[] { u.getId(), u.getNombre(), u.getEmail() });
		}
	}

	private void rellenarUsuariosMemoria() {
		usuarios.put(1L, new Usuario(1L, "Javier", "javier@email.net", "contra"));
		usuarios.put(2L, new Usuario(2L, "Pepe", "pepe@email.net", "contra2"));
		usuarios.put(3L, new Usuario(3L, "Juan", "juan@email.net", "contra3"));
	}

	private void limpiarFormulario() {
		tfId.setText("");
		tfNombre.setText("");
		tfEmail.setText("");
		tfPassword.setText("");
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frmMantenimientoDeUsuarios = new JFrame();
		frmMantenimientoDeUsuarios.setTitle("Mantenimiento de usuarios");
		frmMantenimientoDeUsuarios.setBounds(100, 100, 581, 475);
		frmMantenimientoDeUsuarios.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		splitPane = new JSplitPane();
		splitPane.setOrientation(JSplitPane.VERTICAL_SPLIT);
		frmMantenimientoDeUsuarios.getContentPane().add(splitPane, BorderLayout.CENTER);

		JPanel panel = new JPanel();
		splitPane.setRightComponent(panel);
		GridBagLayout gbl_panel = new GridBagLayout();
		gbl_panel.columnWidths = new int[] { 0, 0, 0 };
		gbl_panel.rowHeights = new int[] { 0, 0, 0, 0, 0, 0, 0 };
		gbl_panel.columnWeights = new double[] { 0.0, 1.0, Double.MIN_VALUE };
		gbl_panel.rowWeights = new double[] { 0.0, 0.0, 0.0, 0.0, 0.0, 0.0, Double.MIN_VALUE };
		panel.setLayout(gbl_panel);

		JLabel lblNewLabel = new JLabel("Id");
		GridBagConstraints gbc_lblNewLabel = new GridBagConstraints();
		gbc_lblNewLabel.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel.gridx = 0;
		gbc_lblNewLabel.gridy = 0;
		panel.add(lblNewLabel, gbc_lblNewLabel);

		tfId = new JFormattedTextField();
		GridBagConstraints gbc_tfId = new GridBagConstraints();
		gbc_tfId.insets = new Insets(0, 0, 5, 0);
		gbc_tfId.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfId.gridx = 1;
		gbc_tfId.gridy = 0;
		panel.add(tfId, gbc_tfId);

		JLabel lblNewLabel_1 = new JLabel("Nombre");
		GridBagConstraints gbc_lblNewLabel_1 = new GridBagConstraints();
		gbc_lblNewLabel_1.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_1.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_1.gridx = 0;
		gbc_lblNewLabel_1.gridy = 1;
		panel.add(lblNewLabel_1, gbc_lblNewLabel_1);

		tfNombre = new JTextField();
		GridBagConstraints gbc_tfNombre = new GridBagConstraints();
		gbc_tfNombre.insets = new Insets(0, 0, 5, 0);
		gbc_tfNombre.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfNombre.gridx = 1;
		gbc_tfNombre.gridy = 1;
		panel.add(tfNombre, gbc_tfNombre);
		tfNombre.setColumns(10);

		JLabel lblNewLabel_2 = new JLabel("Email");
		GridBagConstraints gbc_lblNewLabel_2 = new GridBagConstraints();
		gbc_lblNewLabel_2.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_2.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_2.gridx = 0;
		gbc_lblNewLabel_2.gridy = 2;
		panel.add(lblNewLabel_2, gbc_lblNewLabel_2);

		tfEmail = new JTextField();
		GridBagConstraints gbc_tfEmail = new GridBagConstraints();
		gbc_tfEmail.anchor = GridBagConstraints.NORTH;
		gbc_tfEmail.insets = new Insets(0, 0, 5, 0);
		gbc_tfEmail.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfEmail.gridx = 1;
		gbc_tfEmail.gridy = 2;
		panel.add(tfEmail, gbc_tfEmail);
		tfEmail.setColumns(10);

		JLabel lblNewLabel_3 = new JLabel("Password");
		GridBagConstraints gbc_lblNewLabel_3 = new GridBagConstraints();
		gbc_lblNewLabel_3.anchor = GridBagConstraints.EAST;
		gbc_lblNewLabel_3.insets = new Insets(0, 0, 5, 5);
		gbc_lblNewLabel_3.gridx = 0;
		gbc_lblNewLabel_3.gridy = 3;
		panel.add(lblNewLabel_3, gbc_lblNewLabel_3);

		tfPassword = new JPasswordField();
		GridBagConstraints gbc_tfPassword = new GridBagConstraints();
		gbc_tfPassword.insets = new Insets(0, 0, 5, 0);
		gbc_tfPassword.fill = GridBagConstraints.HORIZONTAL;
		gbc_tfPassword.gridx = 1;
		gbc_tfPassword.gridy = 3;
		panel.add(tfPassword, gbc_tfPassword);
				
				panel_1 = new JPanel();
				GridBagConstraints gbc_panel_1 = new GridBagConstraints();
				gbc_panel_1.insets = new Insets(0, 0, 5, 0);
				gbc_panel_1.anchor = GridBagConstraints.WEST;
				gbc_panel_1.fill = GridBagConstraints.VERTICAL;
				gbc_panel_1.gridx = 1;
				gbc_panel_1.gridy = 4;
				panel.add(panel_1, gbc_panel_1);
				
						JButton btnAceptar = new JButton("Aceptar");
						panel_1.add(btnAceptar);
						
						btnBorrar = new JButton("Borrar");
						btnBorrar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								usuarios.remove(Long.parseLong(tfId.getText()));
								
								limpiarFormulario();
								
								rellenarTabla();
								
								lblEstado.setText("Borrado correctamente");
							}
						});
						panel_1.add(btnBorrar);
						
						lblEstado = new JLabel("");
						GridBagConstraints gbc_lblEstado = new GridBagConstraints();
						gbc_lblEstado.gridwidth = 2;
						gbc_lblEstado.insets = new Insets(0, 0, 0, 5);
						gbc_lblEstado.gridx = 0;
						gbc_lblEstado.gridy = 5;
						panel.add(lblEstado, gbc_lblEstado);
						btnAceptar.addActionListener(new ActionListener() {
							public void actionPerformed(ActionEvent e) {
								usuarios.put(Long.parseLong(tfId.getText()), new Usuario(Long.parseLong(tfId.getText()), tfNombre.getText(), tfEmail.getText(), tfPassword.getPassword().toString()));
								
								limpiarFormulario();
								
								rellenarTabla();
								
								lblEstado.setText("Añadido o editado correctamente");
							}
						});

		jt = new JTable();
	}

}
