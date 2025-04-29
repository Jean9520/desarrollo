import javax.swing.JOptionPane;

public class Fallos {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		int [] mi_matriz= new int [5];
		
		mi_matriz[0]=23;
		mi_matriz[1]=34;
		mi_matriz[2]=45;
		mi_matriz[3]=56;
		mi_matriz[4]=78;
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Posicion " + i + " = " + mi_matriz[i]);
		}
		
		//peticion de datos personales
		
		String nombre=JOptionPane.showInputDialog("iNTRODUCE TU NOMBRE");
		int edad = Integer.parseInt(JOptionPane.showInputDialog("INTRODUCE TU EDAD"));
		
		System.out.println("Hola " + nombre + " tienes " + edad + " años, el programa termino su ejecucion");
	}

}
