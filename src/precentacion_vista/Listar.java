package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JButton;

public class Listar extends JPanel {

	public Listar() {
		setLayout(null);
		
		JButton btnNewButton = new JButton("Nombre");
		btnNewButton.setBounds(38, 50, 97, 23);
		add(btnNewButton);
		
		JButton btnApellido = new JButton("Apellido");
		btnApellido.setBounds(136, 50, 97, 23);
		add(btnApellido);
		
		JButton btnDni = new JButton("DNI");
		btnDni.setBounds(234, 50, 97, 23);
		add(btnDni);

	}

}
