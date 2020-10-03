package precentacion_vista;

import javax.swing.JPanel;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;


import entidad.Personas;
import negocio.negocio_personas;

import javax.swing.JLabel;
import java.awt.Font;
import javax.swing.JList;
import javax.swing.JOptionPane;
import javax.swing.DefaultListModel;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;
import java.awt.event.ActionEvent;

public class Eliminar extends JPanel {
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
	


	
	public Eliminar() {
		setLayout(null);
		
		JLabel lblEliminar = new JLabel("Eliminar usuarios");
		lblEliminar.setFont(new Font("Tahoma", Font.BOLD, 12));
		lblEliminar.setBounds(144, 33, 111, 14);
		add(lblEliminar);
		
		lmodelo=new DefaultListModel();
		list = new JList();
		list.setModel(lmodelo);
		
		list.setBounds(89, 54, 222, 188);
		add(list);
		
		JButton btnNewButton = new JButton("Eliminar");
		btnNewButton.setFont(new Font("Tahoma", Font.BOLD, 12));
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				if(list.getSelectedValue()!=null) {
					
				
				}
				else {
					
				JOptionPane.showMessageDialog(null, "Seleccione un registro de la tabla");
				}
			}
		});
		btnNewButton.setBounds(129, 253, 126, 30);
		add(btnNewButton);
		
	
		refrescarLista();

	}
	
	private void refrescarLista()
	{
		this.personasEnlista = (ArrayList<Personas>) pNeg.readAll();
		llenarTabla( (ArrayList<Personas>) pNeg.readAll());
	}

	public void llenarTabla(List<Personas> personasEnlista) {
		
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
