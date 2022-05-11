package com.bootcamp.UD22.Act2.modelo.classes;

import java.util.Date;
import java.util.List;

import com.bootcamp.UD22.Act2.modelo.sql.Sql;


public class Cliente {
	//atributos
	private String query;
	private Sql sql = new Sql();
	
	//constructor
	public Cliente() {
		try {
			crearTableCliente();	
		}catch (Exception e) {
			System.out.println(e.getMessage());
		} 
		
	}
	//crud
	public void crearTableCliente() throws Exception {
		query = "CREATE TABLE IF NOT EXISTS CLIENTE ("
				+ "id int auto_increment primary key,"
				+ "nombre varchar(250),"
				+ "apellido varchar(250),"
				+ "direccion varchar(250),"
				+ "dni int(11),"
				+ "fecha date);";	
		sql.inyeccionSQL("VIDEOCLUB", query);
	}
	public void insertCliente(String nombre, String apellido, String direccion,String  dni, String fecha) throws Exception {
		query = "INSERT INTO CLIENTE (nombre,apellido,direccion,dni, fecha) VALUES ('" + nombre + "', '" + apellido + "','" + direccion + "',"
				+ dni + ", '"+fecha+"' );";
			sql.inyeccionSQL("VIDEOCLUB", query);
	
	}

	public void deleteCliente() throws Exception{
		query = "DELETE FROM CLIENTE";
			sql.inyeccionSQL("VIDEOCLUB", query);

	}

	public void updateCliente(String field, String valueOld, String valueNew)throws Exception {
		query = "UPDATE CLIENTE SET "+ field +" = '" +valueNew+ "' WHERE " +field+" = '"+valueOld+"'";
			sql.inyeccionSQL("VIDEOCLUB", query);
	}
	
	public List<String> selectCliente()throws Exception {
		String tabla = "CLIENTE";
		return sql.getValues("VIDEOCLUB", tabla);
	}

	
}
