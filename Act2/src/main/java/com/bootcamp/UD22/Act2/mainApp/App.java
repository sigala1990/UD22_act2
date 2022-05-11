package com.bootcamp.UD22.Act2.mainApp;


import com.bootcamp.UD22.Act2.controlador.Controlador;
import com.bootcamp.UD22.Act2.modelo.VideoClub;
import com.bootcamp.UD22.Act2.vista.Vista;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
      	VideoClub videoClub = new VideoClub();
      	Vista vista = new Vista();
      	Controlador controlador = new Controlador(videoClub, vista);
      	
    }
}
