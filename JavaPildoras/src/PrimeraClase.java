import java.util.Scanner;

public class PrimeraClase {

	public static void main(String args[]) {
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("Introduce un nombre por favor");
		String nombre = entrada.nextLine();
		System.out.println("ingresa tu edad");
		int edad = entrada.nextInt();
		System.out.println("hola " + nombre + " el año que viene tendras " + (edad+1) + " años");
}

}
