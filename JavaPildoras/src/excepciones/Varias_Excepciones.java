package excepciones;

import javax.swing.*;

public class Varias_Excepciones {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		try {
			division();
		} catch (ArithmeticException e) {
			System.out.println("estas dividiendo por 0");
		}catch(NumberFormatException e) {
			System.out.println("No has introducido un numero entero");
		}
		
		
		
		
		

	}
	
	static void division() {
		

	
	int num=Integer.parseInt(JOptionPane.showInputDialog("Introduce el dividendo"));
	int num2 =Integer.parseInt(JOptionPane.showInputDialog("Introduce el divisor"));
	System.out.println("El resultado es: " + num/num2);
	

}
}