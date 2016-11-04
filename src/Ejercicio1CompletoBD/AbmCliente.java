package Ejercicio1CompletoBD;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AbmCliente extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_6;
	private JTextField textField_7;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbmCliente frame = new AbmCliente();
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
	public AbmCliente() {
		setTitle("Cliente");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblRazonSocial = new JLabel("Razon Social");
		lblRazonSocial.setBounds(10, 75, 111, 14);
		getContentPane().add(lblRazonSocial);
		
		JLabel lblDireccion = new JLabel("Direccion");
		lblDireccion.setBounds(10, 96, 46, 14);
		getContentPane().add(lblDireccion);
		
		JLabel lblSaldoDisponible = new JLabel("Saldo Disponible");
		lblSaldoDisponible.setBounds(10, 121, 111, 14);
		getContentPane().add(lblSaldoDisponible);
		
		JLabel lblDescuento = new JLabel("Descuento");
		lblDescuento.setBounds(10, 146, 111, 14);
		getContentPane().add(lblDescuento);
		
		JLabel lblLimiteDeCredito = new JLabel("Limite de Credito");
		lblLimiteDeCredito.setBounds(10, 172, 111, 14);
		getContentPane().add(lblLimiteDeCredito);
		
		textField = new JTextField();
		textField.setBounds(102, 47, 122, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(102, 72, 122, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(102, 93, 122, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(102, 118, 122, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(102, 143, 122, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		textField_5 = new JTextField();
		textField_5.setBounds(102, 169, 122, 20);
		getContentPane().add(textField_5);
		textField_5.setColumns(10);
		
		JLabel lblNumero = new JLabel("Numero");
		lblNumero.setBounds(245, 96, 46, 14);
		getContentPane().add(lblNumero);
		
		textField_6 = new JTextField();
		textField_6.setBounds(286, 93, 122, 20);
		getContentPane().add(textField_6);
		textField_6.setColumns(10);
		
		JButton btnNuevo = new JButton("Nuevo");
		btnNuevo.setBounds(10, 200, 89, 23);
		getContentPane().add(btnNuevo);
		
		JButton btnBuscar = new JButton("Buscar");
		btnBuscar.setBounds(112, 200, 89, 23);
		getContentPane().add(btnBuscar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(211, 200, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(310, 200, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 234, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnCancelar = new JButton("Cancelar");
		btnCancelar.setBounds(211, 234, 89, 23);
		getContentPane().add(btnCancelar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(310, 234, 89, 23);
		getContentPane().add(btnSalir);
		
		JLabel lblNombre = new JLabel("Nombre ");
		lblNombre.setBounds(234, 50, 46, 14);
		getContentPane().add(lblNombre);
		
		textField_7 = new JTextField();
		textField_7.setBounds(286, 47, 122, 20);
		getContentPane().add(textField_7);
		textField_7.setColumns(10);
		
		JLabel lblNumerocliente = new JLabel("numero_cliente");
		lblNumerocliente.setBounds(10, 50, 82, 14);
		getContentPane().add(lblNumerocliente);
	


	}
}
