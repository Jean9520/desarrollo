package poo;

import javax.swing.*;
import java.util.*;
import java.awt.event.*;
import javax.swing.Timer;
import java.awt.Toolkit;


public class PruebaTemporizador2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		reloj miReloj = new reloj ();
		miReloj.enMarcha(3000, true);
		JOptionPane.showMessageDialog(null, "DAR CLICK PARA PARAR");
		System.exit(0);

	}

}

class reloj{
	
	/*public reloj(int intervalo, boolean sonido) {
		this.intervalo=intervalo;
		this.sonido=sonido;

}*/
	public void enMarcha(int intervalo, final boolean sonido) {
		
		class DimeLaHora2 implements ActionListener{//clase interna local --> se define dentro del metodo, si es una clase local se
													//define dentro de la misma clase principal	
			
			public void actionPerformed(ActionEvent evento) {
			

		
				Date ahora = new Date();
				System.out.println("te pongo la hora cada 3 segundos" + ahora);
		
				if(sonido) {
				Toolkit.getDefaultToolkit().beep();
		}
		
		}
	}
		 ActionListener oyente = new DimeLaHora2();
		 Timer miTemporizador= new Timer (intervalo, oyente);
		 miTemporizador.start();
	}


	
}








