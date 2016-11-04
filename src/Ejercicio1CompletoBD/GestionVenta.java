//Archivo principal de la aplicacion
package Ejercicio1CompletoBD;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;

import java.awt.Color;

import javax.swing.SwingConstants;

import java.awt.Font;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JMenu;
import javax.swing.JMenuItem;
import javax.swing.JMenuBar;


import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class GestionVenta extends JFrame {

	private JPanel contentPane;
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
					GestionVenta frame = new GestionVenta();
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
	public GestionVenta() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 685, 489);
		getContentPane().setLayout(new BorderLayout(0, 0));
		
		JMenuBar menuBar = new JMenuBar();
		setJMenuBar(menuBar);
		
		JMenu mnArchivos = new JMenu("Archivos");
		menuBar.add(mnArchivos);
		
		JMenuItem mntmCliente = new JMenuItem("Cliente");
		mntmCliente.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion =0;
				
				AbmCliente cliente = new AbmCliente();
				cliente.setVisible(true);
				cliente.setLocation(posicion,posicion);
				
				// es la posicion que lo va a abrir hacia abajo
				posicion +=10;
				getContentPane().add(cliente);
			}
		});
		mnArchivos.add(mntmCliente);
		
		JMenuItem mntmArticulo = new JMenuItem("Articulo");
		mntmArticulo.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion =0;
				
				AbmArticulo articulo = new AbmArticulo();
				articulo.setVisible(true);
				articulo.setLocation(posicion,posicion);
				
				// es la posicion que lo va a abrir hacia abajo
				posicion +=10;
				getContentPane().add(articulo);
			}
		});
		mnArchivos.add(mntmArticulo);
		
		JMenuItem mntmDetalleDePedido = new JMenuItem("Detalle de Pedido");
		mntmDetalleDePedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion =0;
				
				AbmDetalle_de_pedido detPed = new AbmDetalle_de_pedido();
				detPed.setVisible(true);
				detPed.setLocation(posicion,posicion);
				
				// es la posicion que lo va a abrir hacia abajo
				posicion +=10;
				getContentPane().add(detPed);				
			}
		});
		mnArchivos.add(mntmDetalleDePedido);
		
		JMenuItem mntmFabrica = new JMenuItem("Fabrica");
		mntmFabrica.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int posicion =0;
				
				AbmFabrica fabrica = new AbmFabrica();
				fabrica.setVisible(true);
				fabrica.setLocation(posicion,posicion);
				
				// es la posicion que lo va a abrir hacia abajo
				posicion +=10;
				getContentPane().add(fabrica);	
			}
		});
		mnArchivos.add(mntmFabrica);
		
		JMenuItem mntmSalir = new JMenuItem("Salir");
		mntmSalir.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				dispose();
			}
		});
		mnArchivos.add(mntmSalir);
		
		JMenu mnPedido = new JMenu("Pedido");
		menuBar.add(mnPedido);
		
		JMenuItem mntmPedido = new JMenuItem("Pedido");
		mntmPedido.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
							
				int posicion =0;
				
				AbmPedido pedido = new AbmPedido();
				pedido.setVisible(true);
				pedido.setLocation(posicion,posicion);
				
				// es la posicion que lo va a abrir hacia abajo
				posicion +=10;
				getContentPane().add(pedido); 
			}
		});
		mnPedido.add(mntmPedido);
		
		//JMenuItem mntmDetalleDePedido_1 = new JMenuItem("Detalle de pedido");
		//mntmDetalleDePedido_1.addActionListener(new ActionListener() {
			//public void actionPerformed(ActionEvent e) {
					
			}
	//});
	
	}

