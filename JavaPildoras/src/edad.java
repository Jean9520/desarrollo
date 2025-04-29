import java.util.Scanner;

public class edad {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		System.out.println("introduce tu edad");
		
		int edad = entrada.nextInt();
		
		if (edad >= 18) {
			
			System.out.println("eres mayor de edad y puedes salir a la calle");
			
		}
		else {
			System.out.println("eres menor de edad");
		}
	}

}
