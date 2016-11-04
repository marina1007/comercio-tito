package Ejercicio1CompletoBD;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTable;

public class AbmDetalle_de_pedido extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTable table;
	private JTable table_1;
	private JTable table_2;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbmDetalle_de_pedido frame = new AbmDetalle_de_pedido();
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
	public AbmDetalle_de_pedido() {
		setTitle("Detalle de Pedidos");
		setBounds(100, 100, 645, 476);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroDePedido = new JLabel("Numero de pedido");
		lblNumeroDePedido.setBounds(25, 11, 116, 14);
		getContentPane().add(lblNumeroDePedido);
		
		JLabel lblNumeroDeArticulos = new JLabel("Numero de articulo");
		lblNumeroDeArticulos.setBounds(25, 36, 109, 14);
		getContentPane().add(lblNumeroDeArticulos);
		
		JLabel lblCantidadDeArticulo = new JLabel("Cantidad de articulo");
		lblCantidadDeArticulo.setBounds(25, 61, 109, 14);
		getContentPane().add(lblCantidadDeArticulo);
		
		JLabel lblPrecio = new JLabel("Precio");
		lblPrecio.setBounds(25, 96, 87, 14);
		getContentPane().add(lblPrecio);
		
		textField = new JTextField();
		textField.setBounds(181, 8, 148, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(181, 33, 148, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(181, 64, 148, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(179, 93, 150, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(25, 124, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(122, 124, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(221, 124, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			dispose();
			}
		});
		btnSalir.setBounds(530, 413, 89, 23);
		getContentPane().add(btnSalir);
		
		table = new JTable();
		table.setBounds(41, 185, 1, 1);
		getContentPane().add(table);
		
		table_1 = new JTable();
		table_1.setBounds(41, 306, 391, -120);
		getContentPane().add(table_1);
		
		table_2 = new JTable();
		table_2.setBounds(30, 167, 534, 199);
		getContentPane().add(table_2);

	}
}
