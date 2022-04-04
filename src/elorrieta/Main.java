package elorrieta;

import elorrieta.gestorFichero.GestorFichero;
import elorrieta.jFrames.JFramePrincipal;

public class Main {

	public static void main(String[] args) {

		GestorFichero gestorFichero = new GestorFichero();
		gestorFichero.crearFichero();
		
		JFramePrincipal miFrame= new JFramePrincipal();
		
		

	}

}
