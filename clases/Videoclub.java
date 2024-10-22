package clases;
/* Videoclub es la clase contenedora del proyecto.
 * En esta clase tenemos que guardar todas las estructuras de datos 
 * TreeMap/HashMap/TreeSet/HashSet/ArrayList
 * */

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class Videoclub {
	private static ArrayList<Pelicula> alPeliculas = new ArrayList<>();
	
	public static void cargarPeliculas() {

		ArrayList<Pelicula> array_pelis= new ArrayList<Pelicula>();
		
		try {
			File f= new File("C:/Users/tpv/eclipse-uni/ACADEMIA PROG/peliculas/src/peliculas.csv/");
			Scanner sc = new Scanner(f);

			if (sc.hasNextLine()) {
				sc.nextLine();
			}
		
			while(sc.hasNextLine()) {
				String linea=sc.nextLine();
				
				String[] campos=linea.split(",");
				
				if (campos.length != 6) {
	                System.out.println("Error en el formato de la línea: " + linea);
	                continue; // Saltar esta línea y pasar a la siguiente
	            }
				
				String codigo=campos[0];
				String nombre_peli=campos[1];
				int año=Integer.parseInt(campos[2]);
				String protagonista= campos[3];
				int edad_recomendada=Integer.parseInt(campos[4]);
				String ruta_img= campos[5];
				
				Pelicula pelicula=new Pelicula(codigo, nombre_peli, año, protagonista, edad_recomendada, ruta_img);
				array_pelis.add(pelicula);
			}
			sc.close();

			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		for (Pelicula pelicula : array_pelis) {
			alPeliculas.add(pelicula);
		}
	}
	

	
	public static ArrayList<Pelicula> getAlPeliculas() {
		return alPeliculas;
	}



	//Método que, dada la ruta de la foto de una película devuelve el objeto Pelicula con esa rutaFoto
	public static Pelicula buscarPelicula(String rutaFoto) {
		boolean enc = false;
		int pos = 0; //La primera posición de un ArrayList es la 0
		Pelicula p = null;
		while(!enc && pos<alPeliculas.size()) { //Mientras no hayamos encontrado la película y no hayamos recorrido toda la lista, seguimos buscando
			p = alPeliculas.get(pos); //Guardamos en p la película de la posición pos de la lista
			if(p.getRutaFoto().equals(rutaFoto)) { //Si la ruta de la película p es igual a la que estoy buscando
				enc = true;
			}else {
				pos++;
			}
		}
		if(enc) {
			return p;
		}else {
			return null;
		}
	}
	
	
	
	
	
	
	
	
	
	
	
	

	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
