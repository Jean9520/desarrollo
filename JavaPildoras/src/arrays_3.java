import javax.swing.JOptionPane;

public class arrays_3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String [] paises = new String[8];
		
		
		for (int i = 0; i <8; i++) {
			paises [i]=JOptionPane.showInputDialog("introduce paises: " + (i+1));
		}
		
		
		
		for(String elemento: paises) {
			System.out.println("pais: " + elemento);
		}
		
	}

}
