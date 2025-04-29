
package poo;

import java.util.*;

public class Uso_Tallas {
	
	
	enum talla{
		
		MINI("S"), MEDIANO("M"), GRANDE("L"), MUY_GRANDE("XL");
		
		private talla(String abreviatura) {
			
			this.abreviatura=abreviatura;
		}
		
		
		public String getdameAbreviatura() {
			return abreviatura;
		}
		
		private String abreviatura;
	}
	


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Scanner entrada = new Scanner(System.in);
		
		System.out.println("Escribe una talla:  MINI, MEDIANO, GRANDE, MUY_GRANDE");
		
			String entrada_datos=entrada.next().toUpperCase();
			
			talla la_talla=Enum.valueOf(talla.class, entrada_datos);
			
			System.out.println("Talla = " + la_talla);
			
			System.out.println("Abreviatura: " + la_talla.getdameAbreviatura());

	}

}
