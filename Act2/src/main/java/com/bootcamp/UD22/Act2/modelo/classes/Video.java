package com.bootcamp.UD22.Act2.modelo.classes;

import java.util.List;

import com.bootcamp.UD22.Act2.modelo.sql.Sql;

public class Video {
	//atributos
	private String query;
	private Sql sql = new Sql();
	
	//constructor
	public Video() {
		try {
			crearTableVideo();	
		}catch (Exception e) {
			// TODO: handle exception
			System.out.println(e.getMessage());
		}
		
	}
	//crud
	public void crearTableVideo() throws Exception {
		query = "CREATE TABLE IF NOT EXISTS VIDEO ("
				+ "id int(11) AUTO_INCREMENT PRIMARY KEY,"
				+ "title varchar(250),"
				+ "director varchar(250),"
				+ "cli_id int(11),"
				+ "key (cli_id),"
				+ "FOREIGN KEY (cli_id) REFERENCES CLIENTE (id));";
		Sql sql = new Sql();
		sql.inyeccionSQL("VIDEOCLUB", query);
	}

	public void insertVideo(String title, String director, String cli_id) throws Exception {
		query = "INSERT INTO VIDEO (title,director,cli_id) VALUES ('" + title + "','" + director + "',"+ cli_id +" );";
	
			sql.inyeccionSQL("VIDEOCLUB", query);
	
	}

	public void deleteVideo() throws Exception{
		query = "DELETE FROM VIDEO"
				+ "";
	
			sql.inyeccionSQL("VIDEOCLUB", query);

	}

	public void updateVideo(String field, String valueOld, String valueNew)throws Exception {
		query = "UPDATE VIDEO SET "+ field +" = '" +valueNew+ "' WHERE " +field+ " = '" +valueOld+"'";
	
			sql.inyeccionSQL("VIDEOCLUB", query);
	
	}
	
	public List<String> selectVideo()throws Exception {
		String tabla = "VIDEO";
		return sql.getValues("VIDEOCLUB", tabla);
	}


	
}
