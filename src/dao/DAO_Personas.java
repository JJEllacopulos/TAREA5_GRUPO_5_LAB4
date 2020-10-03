package dao;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;

import entidad.Personas;

public class DAO_Personas {
	
	private String host = "jdbc:mysql://localhost:3306/";
	private String user = "root";
	private String pass = "";
	private String dbName = "bdPersonas";
	
	public DAO_Personas() {
		
	}
	
	
	
	public int AgrerarUsuario (Personas personas) {
		
		String quety = "Insert into Personas (Dni, Nombre, Apellido) values ('" + personas.getDni() + "', '" + personas.getNombre() + "', '" + personas.getApellido() + "')";
		Connection cn = null;
		int filas=0;
		
		try{
			
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(quety);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return filas;
		
	}
	
public int EliminarPersona (String dni) {
		
		String quety = "Delete From Personas where Dni= "+dni;
		Connection cn = null;
		int filas=0;
		
		try{
			
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			filas = st.executeUpdate(quety);
			
		}
		catch(Exception e){
			
			e.printStackTrace();
			
		}
		
		return filas;
		
	}
	
	
	public Personas Obtener_usuario (String dni) {
		
		Personas x = new Personas();
		
		Connection cn = null;
		
		try {
			
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "Select * from Personas where dni = '" + dni + "'";
			ResultSet rs = st.executeQuery(query);
			rs.next();
			x.setNombre(rs.getString("Nombre"));
			x.setApellido(rs.getString("Apellido"));
			x.setDni(rs.getString("Dni"));
			
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return x;
		
	}
	
	public ArrayList<Personas> Obtener_lista_usuarios () {
		
		ArrayList<Personas> x = new ArrayList<Personas>();
		
		Connection cn = null;
		
		try {
			
			cn = DriverManager.getConnection(host+dbName, user, pass);
			Statement st = cn.createStatement();
			String query = "Select * from Personas";
			ResultSet rs = st.executeQuery(query);
			
			while(rs.next()) {
				
				Personas aux = new Personas();
				aux.setNombre(rs.getString("Nombre"));
				aux.setApellido(rs.getString("Apellido"));
				aux.setDni(rs.getString("Dni"));
				x.add(aux);
				
			}
			
		}
		catch(Exception e) {
			
			e.printStackTrace();
			
		}
		
		return x;
		
	}
	
	
}
