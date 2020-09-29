package negocio;

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
	
	
	
}
