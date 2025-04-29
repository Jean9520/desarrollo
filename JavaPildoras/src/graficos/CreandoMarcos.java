package graficos;

import java.awt.Frame;

import javax.swing.*;

public class CreandoMarcos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		miMarco marco1 = new miMarco();
		marco1.setVisible(true);
		marco1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

	}

}

class miMarco extends JFrame{
	
	public miMarco () {
		setSize(500, 300); //tamaño de la ventana
		//setLocation(500, 300); ubicacion el pantalla de la ventana
		//setResizable(false); //este metodo permite que el usuario ajuste la ventana
		//setExtendedState(Frame.MAXIMIZED_BOTH);//para que se vea en toda la pantalla
		setBounds(500, 300, 600, 250);
		setTitle("Ing Jean Poll");
	}
}
