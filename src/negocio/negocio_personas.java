package negocio;

import java.util.List;

import javax.swing.JOptionPane;

import dao.DAO_Personas;
import entidad.Personas;

public class negocio_personas {
	
	private DAO_Personas dao_p = new DAO_Personas();
	
	public negocio_personas() {
		
	}

	public void Agregar_persona(String dni, String nombre, String apellido) {
		
		Personas aux = new Personas();
		
		aux.setDni(dni);
		aux.setNombre(nombre);
		aux.setApellido(apellido);
		
		dao_p.AgrerarUsuario(aux);
		
	}
public void EliminarPersona(String dni) {
		
		
		int filas=dao_p.EliminarPersona(dni);
		if (filas>0) {
			JOptionPane.showMessageDialog(null, "Se elimino persona");
			
		}
		else{
			
			JOptionPane.showMessageDialog(null, "ERROR AL ELIMINAR PERSONA");
		}
		
	}
	
	public List<Personas>readAll(){
		List<Personas> listaPersonas = dao_p.Obtener_lista_usuarios();
		return listaPersonas;
	}
	
	
	
}
