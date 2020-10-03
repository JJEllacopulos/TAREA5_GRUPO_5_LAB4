package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.Font;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JTextField;

import entidad.Personas;
import negocio.negocio_personas;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Modificar extends JPanel {
	private JTextField textField_1;
	private JTextField textField;
	private JTextField textField_2;
private negocio_personas pNeg = new negocio_personas();
	
	private JList list;
	private ArrayList personasEnlista = new ArrayList<Personas>();	
	private DefaultListModel<Personas> lmodelo;
	
	public JList getListaPersonas() {
		return list;
	}
	public void setListaPersonas(JList tablaPersonas) {
		this.list = tablaPersonas;
	}
	
	public Modificar() {
		setLayout(null);
		
		lmodelo=new DefaultListModel();
		JList list = new JList();
		list.setModel(lmodelo);
		list.setBounds(10, 11, 380, 187);
		add(list);
		
		JButton btnNewButton = new JButton("Modificar");
		btnNewButton.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent e) {
				if(list.getSelectedValue()!=null) {
	
					
			
					
				}
				else {
					
				JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
				}
				
				
				
			}
		});
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 11));
		btnNewButton.setBounds(280, 220, 107, 29);
		add(btnNewButton);
		
		textField_1 = new JTextField();
		textField_1.setColumns(10);
		textField_1.setBounds(10, 220, 80, 24);
		add(textField_1);
		
		textField = new JTextField();
		textField.setColumns(10);
		textField.setBounds(100, 220, 80, 24);
		add(textField);
		
		textField_2 = new JTextField();
		textField_2.setColumns(10);
		textField_2.setBounds(190, 220, 80, 24);
		add(textField_2);
		refrescarLista();
		
		

	}
	
	public void llenartexfield(Personas txt) {
		textField_1.setText(txt.getNombre());
		textField_2.setText(txt.getApellido());
		textField.setText(txt.getDni());
		
	}
	private void refrescarLista()
	{
		this.personasEnlista = (ArrayList<Personas>) pNeg.readAll();
		llenarLista( (ArrayList<Personas>) pNeg.readAll());
	}

	public void llenarLista(List<Personas> personasEnlista) {
		
		for (Personas p : personasEnlista)
		{
			Personas x=new Personas();
			x.setDni(p.getDni());
			x.setNombre(p.getNombre());
			x.setApellido(p.getApellido());
			this.lmodelo.addElement(x);
		
		}

	}

}
