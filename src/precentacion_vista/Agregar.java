package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JTextField;

import entidad.Personas;
import negocio.negocio_personas;

import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.KeyEvent;
import java.awt.event.KeyAdapter;
public class Agregar extends JPanel {
	private JTextField nombre_textField;
	private JTextField apellido_textField;
	private JTextField dni_textField;

	public static boolean validarDNI (String dni)  {
		
		Boolean auxdni=false;
		
		if(dni.length()==8) {
			auxdni=true;
			return auxdni;
	    }
		
		return false;
		
	}
	public Boolean Validacion(String cadena) {
		
		int num;
		try {
			num=Integer.parseInt(cadena);
			return true;
		} catch (Exception e) {
			return false;
		}
	}
	
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
		nombre_textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar=e.getKeyChar();
				if(Character.isDigit(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(null, "NOMBRE NO VALIDO");
				}
			}
		});
		nombre_textField.setBounds(197, 46, 172, 20);
		add(nombre_textField);
		nombre_textField.setColumns(10);
		
		apellido_textField = new JTextField();
		apellido_textField.addKeyListener(new KeyAdapter() {
			@Override
			public void keyTyped(KeyEvent e) {
				char validar=e.getKeyChar();
				if(Character.isDigit(validar)) {
					getToolkit().beep();
					e.consume();
					JOptionPane.showMessageDialog(null, "APELLIDO NO VALIDO");
				}
				
			}
		});
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
				Personas persona = new Personas();
				negocio_personas ng_p = new negocio_personas();
				
				boolean aux = true;
				boolean v=Validacion(dni_textField.getText());
				boolean caracteresdni=validarDNI(dni_textField.getText());
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
					
					if(v==true&&caracteresdni==true ) {
						
					
					ng_p.Agregar_persona(dni_textField.getText(), nombre_textField.getText(), apellido_textField.getText());
					dni_textField.setText("");
					nombre_textField.setText("");
					apellido_textField.setText("");
					}
					else {
						JOptionPane.showMessageDialog(null, "EL DNI ES INVALIDO");
					}
					
					
				}
				else {
					
					JOptionPane.showMessageDialog(null, "Es necesario Completar todos los campos");
					
					
				}

			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.setBounds(59, 195, 142, 29);
		add(btnNewButton);
		
		
		
		
	}
}
