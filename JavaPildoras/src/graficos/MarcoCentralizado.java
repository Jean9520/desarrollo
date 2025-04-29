package graficos;

import java.awt.Dimension;
import java.awt.Toolkit;

import javax.swing.JFrame;

public class MarcoCentralizado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoEditado miMarco = new MarcoEditado();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		miMarco.setVisible(true);

	}

}


class MarcoEditado extends JFrame {
	
	public MarcoEditado() {
		
		Toolkit miPantalla=Toolkit.getDefaultToolkit();
		Dimension tamanioPantalla=miPantalla.getScreenSize();
		
		int alturaPantalla=tamanioPantalla.height;
		int anchoPantalla=tamanioPantalla.width;
		
		setSize(anchoPantalla/2, alturaPantalla/2);
		setLocation(anchoPantalla/4, alturaPantalla/4);
		setTitle("Ingeniero Jean Poll");
		
	}
	
	
	
	
}