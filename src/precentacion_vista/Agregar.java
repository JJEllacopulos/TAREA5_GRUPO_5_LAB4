package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JLabel;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import negocio.negocio_personas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar extends JPanel {
	private JTextField nombre_textField;
	private JTextField apellido_textField;
	private JTextField dni_textField;

	
	public Agregar() {
		setToolTipText("Aceptar");
		setLayout(null);
		
		JLabel lblApellido = new JLabel("DNI");
		lblApellido.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblApellido.setBounds(59, 143, 59, 17);
		add(lblApellido);
		
		JLabel lblNombre = new JLabel("Nombre");
		lblNombre.setFont(new Font("Tahoma", Font.BOLD, 14));
		lblNombre.setBounds(59, 46, 59, 17);
		add(lblNombre);
		
		JLabel label = new JLabel("Apellido");
		label.setFont(new Font("Tahoma", Font.BOLD, 14));
		label.setBounds(59, 95, 59, 17);
		add(label);
		
		nombre_textField = new JTextField();
		nombre_textField.setBounds(197, 46, 172, 20);
		add(nombre_textField);
		nombre_textField.setColumns(10);
		
		apellido_textField = new JTextField();
		apellido_textField.setColumns(10);
		apellido_textField.setBounds(197, 95, 172, 20);
		add(apellido_textField);
		
		dni_textField = new JTextField();
		dni_textField.setColumns(10);
		dni_textField.setBounds(197, 143, 172, 20);
		add(dni_textField);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				negocio_personas ng_p = new negocio_personas();
				
				boolean aux = true;
				
				if(dni_textField.getText().equals("")) {
					
					aux = false;
					
				}
				
				if(nombre_textField.getText().equals("")) {
					
					aux = false;
					
				}
				
				if(apellido_textField.getText().equals("")) {
					
					aux = false;
					
				}
				
				
				
				if(aux) {
					
					dni_textField.setText("");
					nombre_textField.setText("");
					apellido_textField.setText("");
					
					ng_p.Agregar_persona(dni_textField.getText(), nombre_textField.getText(), apellido_textField.getText());
					
				}
				else {
					
					System.out.println("Es necesario completar todos los campos.");
					
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(59, 195, 142, 29);
		add(btnNewButton);
		
		
		
		
	}
}
