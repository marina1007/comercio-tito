package Ejercicio1CompletoBD;

import java.awt.EventQueue;

import javax.swing.JInternalFrame;
import javax.swing.JLabel;
import javax.swing.SwingConstants;
import javax.swing.JMenuBar;
import javax.swing.JMenu;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class AbmArticulo extends JInternalFrame {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					AbmArticulo frame = new AbmArticulo();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 * @return 
	 */
	public AbmArticulo() {
		setTitle("Articulo");
		setBounds(100, 100, 450, 300);
		getContentPane().setLayout(null);
		
		JLabel lblNumeroarticulo = new JLabel("Numero articulo");
		lblNumeroarticulo.setBounds(10, 43, 111, 14);
		getContentPane().add(lblNumeroarticulo);
		
		JLabel lblCodigodelarticulo = new JLabel("codigo del articulo");
		lblCodigodelarticulo.setBounds(10, 68, 111, 14);
		getContentPane().add(lblCodigodelarticulo);
		
		JLabel lblDescripcion = new JLabel("descripcion");
		lblDescripcion.setBounds(10, 93, 95, 14);
		getContentPane().add(lblDescripcion);
		
		JLabel lblUnidadDeMedida = new JLabel("Unidad de medida");
		lblUnidadDeMedida.setBounds(10, 118, 95, 14);
		getContentPane().add(lblUnidadDeMedida);
		
		JLabel lblEnvase = new JLabel("envase");
		lblEnvase.setBounds(10, 145, 95, 14);
		getContentPane().add(lblEnvase);
		
		textField = new JTextField();
		textField.setBounds(116, 40, 166, 20);
		getContentPane().add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setBounds(115, 68, 167, 20);
		getContentPane().add(textField_1);
		textField_1.setColumns(10);
		
		textField_2 = new JTextField();
		textField_2.setBounds(115, 90, 167, 20);
		getContentPane().add(textField_2);
		textField_2.setColumns(10);
		
		textField_3 = new JTextField();
		textField_3.setBounds(115, 115, 167, 20);
		getContentPane().add(textField_3);
		textField_3.setColumns(10);
		
		textField_4 = new JTextField();
		textField_4.setBounds(115, 142, 167, 20);
		getContentPane().add(textField_4);
		textField_4.setColumns(10);
		
		JButton btnGuardar = new JButton("Guardar");
		btnGuardar.setBounds(10, 196, 89, 23);
		getContentPane().add(btnGuardar);
		
		JButton btnModificar = new JButton("Modificar");
		btnModificar.setBounds(116, 196, 89, 23);
		getContentPane().add(btnModificar);
		
		JButton btnEliminar = new JButton("Eliminar");
		btnEliminar.setBounds(234, 196, 89, 23);
		getContentPane().add(btnEliminar);
		
		JButton btnSalir = new JButton("Salir");
		btnSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent arg0) {
				dispose();
			}
		});
		btnSalir.setBounds(310, 234, 89, 23);
		getContentPane().add(btnSalir);
			
		}	
	}

