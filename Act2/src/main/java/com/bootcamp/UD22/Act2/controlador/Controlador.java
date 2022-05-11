package com.bootcamp.UD22.Act2.controlador;

import java.awt.Component;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.List;

import javax.swing.JButton;

import com.bootcamp.UD22.Act2.modelo.VideoClub;
import com.bootcamp.UD22.Act2.vista.Vista;

public class Controlador implements ActionListener {

	private Vista vista;
	private VideoClub videoClub;
	private List<String> listSelect;

	public Controlador(VideoClub videoClub, Vista vista) {
		this.vista = vista;
		this.videoClub = videoClub;
		botonListeners();
		vista.setVisible(true);

	}

	public void botonListeners() { //genera listeners en todos los botones dentro del coponente Pane
		Component[] componentes = vista.getContentPane().getComponents();
		for (int i = 0; i < componentes.length; i++) {
			if (componentes[i] instanceof JButton) {
				((JButton) componentes[i]).addActionListener(this);
			}
		}
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		crudCliente(e);
		crudVideos(e);
		
		if (e.getSource() == vista.btn_limpiar) {
			vista.ta.setText("");
		}
	}

	public void crudVideos(ActionEvent e) { //crud
		if (e.getSource() == vista.btn_insert_video) {
			try {
				videoClub.getVideo().insertVideo(vista.tf1_video_insert.getText().toString(),
						vista.tf2_video_insert.getText().toString(), vista.tf3_video_insert.getText().toString());
				vista.ta.setText(vista.ta.getText() + "Insert correcto\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText()+"\n" +ex.getMessage());
			}
		}
		if (e.getSource() == vista.btn_update_video) {
			try {
				videoClub.getVideo().updateVideo(vista.cB_video_update.getSelectedItem().toString(),
						vista.tf2_video_update.getText().toString(), vista.tf3_video_update.getText());
				vista.ta.setText(vista.ta.getText() + "update ok\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText()+"\n" +ex.getMessage());
			}
		}
		if (e.getSource() == vista.btn_delete_video) {
			try {
				videoClub.getVideo().deleteVideo();
				vista.ta.setText(vista.ta.getText() + "delete correcto\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText()+"\n" +ex.getMessage());
			}
		}
		if (e.getSource() == vista.btn_select_video) {
			String msg = "";
			try {
				listSelect = videoClub.getVideo().selectVideo();

				for (int i = 0; i < listSelect.size(); i++) {
					msg = msg + listSelect.get(i) + "\n";
				}
				vista.ta.setText(vista.ta.getText().toString() + msg + "\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText()+"\n" +ex.getMessage());
			}
		}
	}

	public void crudCliente(ActionEvent e) { //crud
		if (e.getSource() == vista.btn_insert_cliente) {
			try {
				videoClub.getCliente().insertCliente(vista.tf_nombre_cliente.getText().toString(),
						vista.tf_apellido_cliente.getText().toString(), vista.tf_direccion_cliente.getText().toString(),
						vista.tf_dni_cliente.getText().toString(), vista.tf_fecha_cliente.getText().toString());
				vista.ta.setText(vista.ta.getText() + "Insert correcto\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText()+"\n" + ex.getMessage());
			}

		}
		if (e.getSource() == vista.btn_update_cliente) {
			try {
				videoClub.getCliente().updateCliente(vista.cB_client_update.getSelectedItem().toString(),
						vista.tf2_cliente_update.getText().toString(), vista.tf3_cliente_update.getText().toString());
				vista.ta.setText(vista.ta.getText() + "update ok\n");
			} catch (Exception e2) {

				vista.ta.setText(vista.ta.getText().toString() + "\n" + e2.getMessage());
			}
		}
		if (e.getSource() == vista.btn_delete_cliente) {
			try {
				videoClub.getCliente().deleteCliente();
				vista.ta.setText(vista.ta.getText() + "delete correcto\n");
			} catch (Exception ex) {

				vista.ta.setText(vista.ta.getText().toString() + "\n" + ex.getMessage());
			}
		}
		if (e.getSource() == vista.btn_select_cliente) {
			String msg = "\n";
			try {
				listSelect = videoClub.getCliente().selectCliente();

				for (int i = 0; i < listSelect.size(); i++) {
					msg = msg + listSelect.get(i) + "\n";
				}
				vista.ta.setText(vista.ta.getText().toString() + msg + "\n");
			} catch (Exception ex) {
				vista.ta.setText(vista.ta.getText().toString() + "\n" + ex.getMessage());

			}

		}
	}
}
