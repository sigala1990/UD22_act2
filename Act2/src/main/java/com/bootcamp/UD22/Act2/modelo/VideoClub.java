package com.bootcamp.UD22.Act2.modelo;

import com.bootcamp.UD22.Act2.modelo.classes.Cliente;
import com.bootcamp.UD22.Act2.modelo.classes.Video;
import com.bootcamp.UD22.Act2.modelo.sql.Sql;

public class VideoClub {

	//atributos
	private Video video;
	private Cliente cliente;
	private Sql sql = new Sql();
	
	//constructor
	public VideoClub() {
		crearDBVideoClub();
		cliente = new Cliente();
		video = new Video();
	}
	
	//crearDB
	public void crearDBVideoClub() {
		sql.crearDB("VIDEOCLUB");
	}
	//getters classes
	public Video getVideo() {
		return video;
	}


	public Cliente getCliente() {
		return cliente;
	}

	
}
