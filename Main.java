import clases.Pelicula;
import clases.Videoclub;
import gui.VentanaPeliculas;

public class Main {

	public static void main(String[] args) {
		
		Videoclub.cargarPeliculas();
		
		System.out.println(Videoclub.getAlPeliculas());
		VentanaPeliculas vp = new VentanaPeliculas();
	}

}
