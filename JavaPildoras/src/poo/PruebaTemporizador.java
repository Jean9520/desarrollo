package poo;

import java.awt.Toolkit;
import java.awt.event.*;
import java.util.*;
import javax.swing.Timer;
import javax.swing.*;
	

public class PruebaTemporizador {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		DameLaHora oyente= new DameLaHora();
		
		Timer miTemporizador = new Timer(5000, oyente);	
		
		miTemporizador.start();
		
		JOptionPane.showMessageDialog(null, "pULSA ACEPTAR PARA DETENER");
		
		System.exit(0);
	}

}

class DameLaHora implements ActionListener{
	
	
	public void actionPerformed(ActionEvent e){
		Date ahora = new Date ();
		System.out.println("Te pongo la hora cada 5 segundos: " + ahora);
		
		Toolkit.getDefaultToolkit().beep();
	}
}
