package grafica;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import logica.CarritoCompra;
import logica.Usuario;

import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.SwingConstants;

public class PantaCarrito extends JFrame {

	private JPanel contentPane;
	private JTextField tfUsuario;
	private JTextField tfCantidad;

	public PantaCarrito() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lblUsuario = new JLabel("Usuario:");
		lblUsuario.setBounds(46, 40, 56, 14);
		contentPane.add(lblUsuario);

		tfUsuario = new JTextField();
		tfUsuario.setBounds(116, 37, 86, 20);
		contentPane.add(tfUsuario);
		tfUsuario.setColumns(10);

		JLabel lblCantidad = new JLabel("Cantidad:");
		lblCantidad.setBounds(46, 80, 55, 14);
		contentPane.add(lblCantidad);

		tfCantidad = new JTextField();
		tfCantidad.setBounds(116, 77, 86, 20);
		contentPane.add(tfCantidad);
		tfCantidad.setColumns(10);
		
		JLabel lblinfo = new JLabel("info");
		lblinfo.setHorizontalAlignment(SwingConstants.CENTER);
		lblinfo.setBounds(10, 160, 230, 20);
		lblinfo.setVisible(false);
		contentPane.add(lblinfo);
		
		JButton btnComprar = new JButton("Comprar");
		btnComprar.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				String usuarioPantalla = tfUsuario.getText();
				Usuario u = new Usuario(usuarioPantalla);
				
				CarritoCompra carrito = new CarritoCompra();
				
				int ingresarCantidadMaxima = Integer.parseInt(tfCantidad.getText());
				boolean superaMaximoPermitido = carrito.ingresarCantidadMaxima(ingresarCantidadMaxima);
				
				if(superaMaximoPermitido) { 
					lblinfo.setText("Cantidad supera al maximo del carrito.");	
					lblinfo.setVisible(true);
				}
				
				
				
//				6.2.2.	crear un objeto CarritoCompras,
//				e invocar el método ingresarCantidadMaxima pasándole 
//				como argumento la cantidad ingresada por pantalla. Si el método
//				devuelve false mostrar en un cuadro de texto zno editable un cartel
//				de advertencia “Cantidad supera al máximo del carrito”. 
			}
		});
		
		btnComprar.setBounds(273, 159, 89, 23);
		contentPane.add(btnComprar);
	}
}
