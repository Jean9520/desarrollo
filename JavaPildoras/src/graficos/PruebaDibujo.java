package graficos;

import java.awt.Frame;
import java.awt.Graphics;
import java.awt.Graphics2D;
import java.awt.geom.Ellipse2D;
import java.awt.geom.Rectangle2D;

import javax.swing.*;

public class PruebaDibujo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		MarcoConDibujos mimarco1 = new MarcoConDibujos();
		
		mimarco1.setVisible(true);
		mimarco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}


class MarcoConDibujos extends JFrame{
	
	public MarcoConDibujos() {
		
		setTitle("Marco con dibujo");
		setSize(600, 400);
		
		LaminaConFiguera milamina2 = new LaminaConFiguera();
		add(milamina2);
	}
}

class LaminaConFiguera extends JPanel{
	
	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		//g.drawRect(50, 50, 400, 200);
		Graphics2D g2=(Graphics2D) g;
		Rectangle2D rectangulo = new Rectangle2D.Double(100, 100, 200, 150);
		g2.draw(rectangulo);
		Ellipse2D elipse = new Ellipse2D.Double();
		elipse.setFrame(rectangulo);
		g2.draw(elipse);
		
	}
	

}