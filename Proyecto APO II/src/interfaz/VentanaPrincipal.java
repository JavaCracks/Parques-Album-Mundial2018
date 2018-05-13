package interfaz;

import javax.swing.*;

import java.awt.*;

public class VentanaPrincipal extends JFrame {

	/**
	 * Relaciones
	 */

	private VentanaNuevoUsuario ventanaUsuario;
	private PanelInicial inicial;
	private PanelIniciarSesion iniciarSesion;

	/**
	 * Constructor
	 */
	public VentanaPrincipal() {

		setTitle("Parqu�s Mundial Rusia 2018");
		setResizable(false);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		// setSize(1580, 1024);

		Toolkit t = Toolkit.getDefaultToolkit();
		Dimension d = t.getScreenSize();
		int h = d.height;
		int w = d.width;
		this.setSize(w-330, h-60);

		// Custom Cursor
		// setCursor(Toolkit.getDefaultToolkit().createCustomCursor(
		// new ImageIcon("./Archivos/imagenes/recursos/balon.png").getImage(), new
		// Point(0, 0), "Ball Cursor"));

		// Icono del programa
		Image icon = Toolkit.getDefaultToolkit().createImage("./Archivos/imagenes/recursos/logoPro.png");
		setIconImage(icon);

		ventanaUsuario = new VentanaNuevoUsuario();
		inicial = new PanelInicial(this);
		iniciarSesion = new PanelIniciarSesion(this);

		add(inicial);

	}

	public PanelIniciarSesion getIniciarSesion() {

		return iniciarSesion;

	}

	public PanelInicial getAux() {

		return inicial;

	}

	public void refresh() {

		invalidate();
		revalidate();
		repaint();

	}

	public static void main(String args[]) {
		VentanaPrincipal ventana = new VentanaPrincipal();
		ventana.setVisible(true);
	}
}
