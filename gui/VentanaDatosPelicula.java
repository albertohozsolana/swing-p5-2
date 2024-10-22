package gui;

import java.awt.BorderLayout;
import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

import clases.Pelicula;

public class VentanaDatosPelicula extends JFrame{
	private JPanel pCentral, pSur, pInfo;
	private JButton btnAlquilar, btnCerrar;
	private JLabel lblFoto,lblTitulo, lblProtagonista, lblAnio, lblEdad;
	
	public VentanaDatosPelicula(Pelicula p) {
		super();
		setBounds(1100, 100, 300, 400);
		
		pInfo = new JPanel(new GridLayout(4, 1));
		pCentral = new JPanel(new GridLayout(1, 2));
		pSur = new JPanel();
		
		btnAlquilar = new JButton("ALQUILAR");
		btnCerrar = new JButton("CERRAR");
		
		getContentPane().add(pCentral, BorderLayout.CENTER);
		getContentPane().add(pSur, BorderLayout.SOUTH);
		
		//Cargamos la imagen de la película en la JLabel
		ImageIcon im = new ImageIcon(p.getRutaFoto());
		lblFoto = new JLabel(im);
		pCentral.add(lblFoto);
		
		lblTitulo = new JLabel(p.getTitulo());
		lblProtagonista = new JLabel(p.getProtagonista());
		lblAnio = new JLabel(String.valueOf(p.getAnio())); //Convertimos el int anio a String
		lblEdad = new JLabel(String.valueOf(p.getEdadRecomendada()));
		pInfo.add(lblTitulo);
		pInfo.add(lblProtagonista);
		pInfo.add(lblAnio);
		pInfo.add(lblEdad);
		pCentral.add(pInfo);
		
		pSur.add(btnAlquilar);
		pSur.add(btnCerrar);
		
		btnCerrar.addActionListener((e)->{
			dispose();
		});
		
		setVisible(true);
	}
}












