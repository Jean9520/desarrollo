package poo;


public class uso_vehiculo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		coche coche1 = new coche();
		coche1.establece_color("gris");
		
		
		furgoneta furgoneta1=new furgoneta(8, 250);
		furgoneta1.setClimatizador("si");
		furgoneta1.dime_asientos("si");
		furgoneta1.establece_color("Verde");
		System.out.println(coche1.dime_datos() + " " + coche1.dime_color());
		System.out.println(furgoneta1.dime_datos() + " " + furgoneta1.getDimeDatosFurgoneta());
		


	}

}
