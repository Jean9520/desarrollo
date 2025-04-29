package graficos;

import java.awt.*;

import javax.swing.*;


public class EscribiendoMarco {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConTexto miMarco = new MarcoConTexto();
		miMarco.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}

}


class MarcoConTexto extends JFrame {
	
	
	public MarcoConTexto () {
		
		
		setSize(600,450);
		setLocation(400,200);
		setTitle("Primer texto");

		setVisible(true);
		
		Lamina miLamina = new Lamina();
		add(miLamina);
		
	
		
	}
	
}

class Lamina extends JPanel{
	
	public void paintComponent(Graphics g) {
		
		super.paintComponent(g);
		
		g.drawString("Estamosaprendiendo swng, con el ig Poll", 100, 100);
		
	}
	
	
}
