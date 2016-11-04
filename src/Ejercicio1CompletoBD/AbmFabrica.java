package Ejercicio1CompletoBD;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AbmFabrica extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbmFabrica frame = new AbmFabrica();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public AbmFabrica() {
		setTitle("Fabrica");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNombreDeLa = new JLabel("Nombre de la fabrica");
		lblNombreDeLa.setBounds(10, 33, 106, 24);
		getContentPane().add(lblNombreDeLa);
		
		JLabel lblNumeroDeTelefono = new JLabel("Numero de Telefono");
		lblNumeroDeTelefono.setBounds(10, 78, 132, 14);
		getContentPane().add(lblNumeroDeTelefono);
		
		JLabel lblDireccion = new JLabel("Direccion ");
		lblDireccion.setBounds(10, 122, 46, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblLocalidad = new JLabel("Localidad");
		lblLocalidad.setBounds(10, 150, 74, 14);
		getContentPane().add(lblLocalidad);
		
		textField = new JTextField();
		textField.setBounds(148, 35, 170, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(148, 75, 170, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(148, 119, 170, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(148, 147, 170, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 205, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(121, 205, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(245, 205, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnSalir.setBounds(323, 237, 89, 23);
		getContentPane().add(btnSalir);

	}

}
