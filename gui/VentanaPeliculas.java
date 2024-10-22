package gui;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.Image;
import java.awt.Point;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.BorderFactory;
import javax.swing.ImageIcon;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.border.Border;

import clases.Pelicula;
import clases.Videoclub;

public class VentanaPeliculas extends JFrame{
	private JPanel pCentral;
	private JPanel pNorte;
	private JPanel pPrincipal;
	private JLabel inicio;
	
	public VentanaPeliculas() {
		super();
		setExtendedState(MAXIMIZED_BOTH);
		setTitle("TRAILEX");
		
		//pPrincipal = new JPanel();
		pCentral = new JPanel(new GridLayout(0, 7));
		//pNorte = new JPanel(new GridLayout(1,7));
		
		//inicio= new JLabel("Inicio");
		//pNorte.add(inicio);
		//pPrincipal.add(pNorte, BorderLayout.NORTH);
		//pPrincipal.add(pCentral, BorderLayout.CENTER);
		
		cargarPeliculas();
		JScrollPane scroll = new JScrollPane(pCentral);
		getContentPane().add(scroll, BorderLayout.CENTER);
		
		pCentral.setBackground(Color.BLACK);
		

		setVisible(true);
	}
	

	
	private void cargarPeliculas() {
		
		for(Pelicula p: Videoclub.getAlPeliculas()) { //Por cada Película que hay en la lista de la clase Videoclub
			ImageIcon im = new ImageIcon(p.getRutaFoto());
			Image im_tamaño= im.getImage().getScaledInstance(100, 140, Image.SCALE_SMOOTH);
			ImageIcon imageicon_tamano= new ImageIcon(im_tamaño);
			imageicon_tamano.setDescription(p.getRutaFoto());

			JLabel lblFoto = new JLabel(imageicon_tamano);
			
			Border border=BorderFactory.createLineBorder(Color.WHITE,2);
			lblFoto.setBorder(border);

			pCentral.add(lblFoto);
		}
		
		}
	
}







