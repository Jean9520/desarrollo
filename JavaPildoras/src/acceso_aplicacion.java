import javax.swing.*;
public class acceso_aplicacion {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String clave = "jean";
		String pass = "";
		
		while (clave.equals(pass)== false) {
			pass=JOptionPane.showInputDialog("introduce la  contraseña correcta");
			
			if (clave.equals(pass)== false) {
				System.out.println("contraseña incorrecta");
				
			}
			
		}
			System.out.println("contraseña correcta. Acceso permitido");
	}

}
