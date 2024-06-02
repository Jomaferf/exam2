package desin;

import java.awt.Color;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;
import javax.swing.DefaultComboBoxModel;

public class VentanaRepaso {

	private JFrame frame;
	private JTextField txtTextoDePrueba;
	

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					VentanaRepaso window = new VentanaRepaso();
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
	public VentanaRepaso() {
		initialize();
		
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		frame.setTitle("Examen Desin");
		
		txtTextoDePrueba = new JTextField();
		txtTextoDePrueba.setText("Texto de prueba.");
		txtTextoDePrueba.setBounds(22, 32, 402, 20);
		frame.getContentPane().add(txtTextoDePrueba);
		txtTextoDePrueba.setColumns(10);
		
		JComboBox cbox_colors = new JComboBox();
		cbox_colors.setModel(new DefaultComboBoxModel(new String[] {"Azul", "Verde", "Rojo", "Negro"}));
		cbox_colors.setBounds(22, 132, 120, 22);
		frame.getContentPane().add(cbox_colors);
		
		JButton btnNewButton = new JButton("Cambiar color");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String selectedColor = (String) cbox_colors.getSelectedItem();
				Color color = new Color(0);
				
				switch(selectedColor) {
				case "Azul":
					color = Color.blue;
					break;
				case "Verde":
					color = Color.green;
					break;
				case "Rojo":
					color = Color.red;
					break;
				case "Negro":
					color = Color.black;
					break;
					
				}
				
				txtTextoDePrueba.setForeground(color);
				txtTextoDePrueba.setText("Haciendo click en el botón cambias el color del texto");
			}
		});
		btnNewButton.setBounds(254, 132, 154, 23);
		frame.getContentPane().add(btnNewButton);
		

	}
}
