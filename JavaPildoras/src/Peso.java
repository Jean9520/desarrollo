
import javax.swing.*;

public class Peso {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String genero = "";
		
		do {
			genero=JOptionPane.showInputDialog("iNTRODUCE TU GENERO (M/H)");
			
		} while (genero.equalsIgnoreCase("H")==false && genero.equalsIgnoreCase("M")==false);
		
		int altura = Integer.parseInt(JOptionPane.showInputDialog("iNTRODUCE TU ALTURA"));
		int pesoideal = 0;
		
		if (genero.equalsIgnoreCase("H")) {
			pesoideal=altura-110;
		}
		else if (genero.equalsIgnoreCase("M")){
			pesoideal=altura-120;


		}
		System.out.println("tu peso ideal es: " + pesoideal);
	}

}
