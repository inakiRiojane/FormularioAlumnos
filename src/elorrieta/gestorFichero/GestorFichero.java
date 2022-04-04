package elorrieta.gestorFichero;

import java.io.File;
import java.io.IOException;

public class GestorFichero {

	private static final String NOMBRE_FICHERO = "alumnos.txt";
	private static final String RUTA_FICHERO = "ficheros\\";

	public  void crearFichero() {

		File fichero = new File(RUTA_FICHERO + NOMBRE_FICHERO + ".txt");

		try {
			if (fichero.createNewFile()) {
				System.out.println("El fichero se ha creado correctamente");
			} else {
				System.out.println("No ha podido ser creado el fichero");
			}
		} catch (IOException ioe) {
			ioe.printStackTrace();
			
			
		}
	}
}
