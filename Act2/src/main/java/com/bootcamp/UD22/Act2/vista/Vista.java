package com.bootcamp.UD22.Act2.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JComboBox;

public class Vista extends JFrame {

	public JPanel contentPane;

	public JButton btn_insert_video, btn_update_video, btn_delete_video, btn_select_video, btn_select_cliente,
			btn_insert_cliente, btn_update_cliente, btn_delete_cliente, btn_limpiar;
	public JComboBox cB_video_update, cB_client_update;
	public JTextArea ta;
	public JTextField tf1_video_insert, tf2_video_insert, tf3_video_insert, tf2_video_update,
			tf3_video_update, tf_nombre_cliente, tf_apellido_cliente, tf_direccion_cliente,
			tf2_cliente_update, tf3_cliente_update,tf_dni_cliente, tf_fecha_cliente;
	public JLabel lb4_cliente;
	public JLabel lb5_cliente, lb1_video_insert, lb2_video_insert, lb3_video_insert;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Vista frame = new Vista();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 1055, 437);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);

		JLabel lb_video = new JLabel("Videos");
		lb_video.setBounds(215, 49, 46, 14);
		contentPane.add(lb_video);

		JLabel lb_client = new JLabel("Cliente");
		lb_client.setBounds(750, 49, 46, 14);
		contentPane.add(lb_client);

		btn_insert_video = new JButton("Insert");
		btn_insert_video.setBounds(40, 74, 89, 23);
		contentPane.add(btn_insert_video);

		btn_update_video = new JButton("Update");
		btn_update_video.setBounds(139, 74, 89, 23);
		contentPane.add(btn_update_video);

		btn_delete_video = new JButton("Delete");
		btn_delete_video.setBounds(238, 74, 89, 23);
		contentPane.add(btn_delete_video);

		btn_select_video = new JButton("Select");
		btn_select_video.setBounds(337, 74, 89, 23);
		contentPane.add(btn_select_video);

		btn_select_cliente = new JButton("Select");
		btn_select_cliente.setBounds(678, 74, 89, 23);
		contentPane.add(btn_select_cliente);

		btn_insert_cliente = new JButton("Insert");
		btn_insert_cliente.setBounds(876, 74, 89, 23);
		contentPane.add(btn_insert_cliente);

		btn_update_cliente = new JButton("Update");
		btn_update_cliente.setBounds(777, 74, 89, 23);
		contentPane.add(btn_update_cliente);

		btn_delete_cliente = new JButton("Delete");
		btn_delete_cliente.setBounds(579, 74, 89, 23);
		contentPane.add(btn_delete_cliente);

		ta = new JTextArea();
		ta.setBounds(239, 126, 528, 211);
		contentPane.add(ta);

		btn_limpiar = new JButton("Limpiar");
		btn_limpiar.setBounds(453, 348, 89, 23);
		contentPane.add(btn_limpiar);

		tf1_video_insert = new JTextField();
		tf1_video_insert.setBounds(40, 128, 86, 20);
		contentPane.add(tf1_video_insert);
		tf1_video_insert.setColumns(10);

		tf2_video_insert = new JTextField();
		tf2_video_insert.setColumns(10);
		tf2_video_insert.setBounds(40, 171, 86, 20);
		contentPane.add(tf2_video_insert);

		tf3_video_insert = new JTextField();
		tf3_video_insert.setColumns(10);
		tf3_video_insert.setBounds(40, 213, 86, 20);
		contentPane.add(tf3_video_insert);

		lb1_video_insert = new JLabel("Titulo");
		lb1_video_insert.setBounds(40, 113, 46, 14);
		contentPane.add(lb1_video_insert);

		lb2_video_insert = new JLabel("Director");
		lb2_video_insert.setBounds(40, 159, 46, 14);
		contentPane.add(lb2_video_insert);

		lb3_video_insert = new JLabel("Cli_id");
		lb3_video_insert.setBounds(41, 202, 46, 14);
		contentPane.add(lb3_video_insert);

		tf2_video_update = new JTextField();
		tf2_video_update.setColumns(10);
		tf2_video_update.setBounds(139, 171, 86, 20);
		contentPane.add(tf2_video_update);

		tf3_video_update = new JTextField();
		tf3_video_update.setColumns(10);
		tf3_video_update.setBounds(139, 213, 86, 20);
		contentPane.add(tf3_video_update);

		JLabel lb3_video_update = new JLabel("ValorNuevo");
		lb3_video_update.setBounds(139, 202, 89, 14);
		contentPane.add(lb3_video_update);

		JLabel lb2_video_update = new JLabel("ValorViejo");
		lb2_video_update.setBounds(139, 159, 89, 14);
		contentPane.add(lb2_video_update);

		JLabel lb1_video_update = new JLabel("Campo");
		lb1_video_update.setBounds(139, 113, 46, 14);
		contentPane.add(lb1_video_update);

		tf_nombre_cliente = new JTextField();
		tf_nombre_cliente.setColumns(10);
		tf_nombre_cliente.setBounds(879, 141, 86, 20);
		contentPane.add(tf_nombre_cliente);

		tf_apellido_cliente = new JTextField();
		tf_apellido_cliente.setColumns(10);
		tf_apellido_cliente.setBounds(879, 184, 86, 20);
		contentPane.add(tf_apellido_cliente);

		tf_direccion_cliente = new JTextField();
		tf_direccion_cliente.setColumns(10);
		tf_direccion_cliente.setBounds(879, 226, 86, 20);
		contentPane.add(tf_direccion_cliente);

		JLabel lb1_cliente = new JLabel("Nombre");
		lb1_cliente.setBounds(879, 126, 46, 14);
		contentPane.add(lb1_cliente);

		JLabel lb2_cliente = new JLabel("Apellido");
		lb2_cliente.setBounds(879, 172, 46, 14);
		contentPane.add(lb2_cliente);

		JLabel lb3_cliente = new JLabel("Direccion");
		lb3_cliente.setBounds(880, 215, 46, 14);
		contentPane.add(lb3_cliente);

		tf2_cliente_update = new JTextField();
		tf2_cliente_update.setColumns(10);
		tf2_cliente_update.setBounds(777, 184, 86, 20);
		contentPane.add(tf2_cliente_update);

		tf3_cliente_update = new JTextField();
		tf3_cliente_update.setColumns(10);
		tf3_cliente_update.setBounds(777, 226, 86, 20);
		contentPane.add(tf3_cliente_update);

		JLabel lb3_cliente_update = new JLabel("ValorNuevo");
		lb3_cliente_update.setBounds(777, 215, 89, 14);
		contentPane.add(lb3_cliente_update);

		JLabel lb2_cliente_update = new JLabel("ValorViejo");
		lb2_cliente_update.setBounds(777, 172, 89, 14);
		contentPane.add(lb2_cliente_update);

		JLabel lb1_cliente_update = new JLabel("Campo");
		lb1_cliente_update.setBounds(777, 126, 46, 14);
		contentPane.add(lb1_cliente_update);

		lb4_cliente = new JLabel("Dni");
		lb4_cliente.setBounds(879, 257, 46, 14);
		contentPane.add(lb4_cliente);

		tf_dni_cliente = new JTextField();
		tf_dni_cliente.setColumns(10);
		tf_dni_cliente.setBounds(879, 272, 86, 20);
		contentPane.add(tf_dni_cliente);

		tf_fecha_cliente = new JTextField();
		tf_fecha_cliente.setColumns(10);
		tf_fecha_cliente.setBounds(879, 315, 86, 20);
		contentPane.add(tf_fecha_cliente);

		lb5_cliente = new JLabel("Fecha");
		lb5_cliente.setBounds(879, 303, 46, 14);
		contentPane.add(lb5_cliente);
		
		String[] camposVideo = {"title","director","cli_id"};
		cB_video_update = new JComboBox(camposVideo);
		cB_video_update.setBounds(139, 127, 86, 22);
		contentPane.add(cB_video_update);
		
		String[] camposClient = {"nombre","apellido","direccion","dni", "fecha"};
		cB_client_update = new JComboBox(camposClient);
		cB_client_update.setBounds(777, 140, 86, 22);
		contentPane.add(cB_client_update);
	}
}
