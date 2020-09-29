package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Agregar extends JPanel {
	private JTextField textField;
	private JTextField textField_1;
	private JTextField textField_2;

	
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
		
		textField = new JTextField();
		textField.setBounds(197, 46, 172, 20);
		add(textField);
		textField.setColumns(10);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(197, 95, 172, 20);
		add(textField_1);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(197, 143, 172, 20);
		add(textField_2);
		
		JButton btnNewButton = new JButton("Aceptar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(59, 195, 142, 29);
		add(btnNewButton);
		
		
		
		
	}
}
