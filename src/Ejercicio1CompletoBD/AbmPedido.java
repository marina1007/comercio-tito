package Ejercicio1CompletoBD;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AbmPedido extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbmPedido frame = new AbmPedido();
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
	public AbmPedido() {
		setTitle("Pedido de clientes");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDePedido = new JLabel("Numero de pedido");
		lblNumeroDePedido.setBounds(10, 30, 103, 14);
		getContentPane().add(lblNumeroDePedido);
		
		JLabel lblFecha = new JLabel("Fecha");
		lblFecha.setBounds(10, 55, 90, 14);
		getContentPane().add(lblFecha);
		
		JLabel lblHora = new JLabel("Hora");
		lblHora.setBounds(10, 80, 73, 14);
		getContentPane().add(lblHora);
		
		JLabel lblCalle = new JLabel("Calle");
		lblCalle.setBounds(10, 105, 46, 14);
		getContentPane().add(lblCalle);
		
		JLabel lblCiudad = new JLabel("Ciudad");
		lblCiudad.setBounds(10, 130, 46, 14);
		getContentPane().add(lblCiudad);
		
		JLabel lblProvincia = new JLabel("Provincia");
		lblProvincia.setBounds(10, 155, 46, 14);
		getContentPane().add(lblProvincia);
		
		JLabel lblNumeroDeCliente = new JLabel("Numero de cliente");
		lblNumeroDeCliente.setBounds(10, 180, 119, 14);
		getContentPane().add(lblNumeroDeCliente);
		
		textField = new JTextField();
		textField.setBounds(107, 27, 157, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(107, 55, 157, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(107, 80, 157, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(107, 102, 157, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(107, 127, 157, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(107, 152, 157, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		textField_6 = new JTextField();
		textField_6.setBounds(107, 177, 157, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(24, 225, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(123, 225, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(222, 225, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		btnSalir.setBounds(335, 225, 89, 23);
		getContentPane().add(btnSalir);

	}

}
