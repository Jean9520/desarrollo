
import javax.swing.JOptionPane;

public class Entrada2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		String nombre = JOptionPane.showInputDialog("INTRODUCE TU NOMBRE");
		String edad = JOptionPane.showInputDialog("escribe tu edad");
		
		int edad_usuario = Integer.parseInt(edad);
		edad_usuario++;
		
		System.out.println("hola " + nombre + " el proximo año tendras " + edad_usuario + " años");

	}

}
