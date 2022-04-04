package elorrieta.jFrames;

import java.awt.Dimension;
import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Image;
import java.awt.Toolkit;

import javax.swing.JFrame;
import javax.swing.JPanel;

public class JFramePrincipal extends JFrame {

	private static int alturaPantalla;
	private static int anchoPantalla;

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public JFramePrincipal() {
		// devuelve un objeto Toolkit, "tipo de pantalla", como es un metodo static se
		// pone la clase por delante Toolkit.
		// Toolkit miPantalla = Toolkit.getDefaultToolkit();

		// getScreenSize devuelve un objeto tipo Dimension
		// Dimension dimensionMiPantalla = miPantalla.getScreenSize();
		// alturaPantalla = dimensionMiPantalla.height;
//		 anchoPantalla = dimensionMiPantalla.width;
//		setSize(anchoPantalla / 2, alturaPantalla / 2);
//		setLocation(anchoPantalla / 4, alturaPantalla / 4);

		// setSize(400,500);
		setExtendedState(Frame.MAXIMIZED_BOTH);
		// setExtendedState(6);

		setTitle("Formulario");
		setResizable(false);
		setVisible(true);

//		Image miIcono = miPantalla.getImage("src/elorrieta/jFrames/iconoPrueba.gif");
//		setIconImage(miIcono);
		MisPaneles misPaneles = new MisPaneles();
		add(misPaneles);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class MisPaneles extends JPanel {

	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		g.drawRect(50, 50, 200, 200);
		g.drawString("PROBANDO", 100, 100);
	}

}
