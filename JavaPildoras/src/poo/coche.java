package poo;

public class coche {
	
	private int ruedas;
	private int largo;
	private int ancho;
	private int peso_plataforma;
	private int motor;
	private String color;
	int peso_total;
	boolean asientos,climatizador;
	
	
	public coche() {
		// TODO Auto-generated constructor stub
		ruedas=4;
		largo=2000;
		ancho=300;
		peso_plataforma=500;
		motor=1600;
		
	}
	
	public String dime_datos() {
		return "la plataforma del vehiculo tiene " + ruedas + " ruedas"
				+ " mide " + largo/100 + " metros con un ancho de " + ancho + " cm, "
				+ "y un peso de plataforma de " + peso_plataforma + " kg";
	}
	
	public void establece_color(String color_coche) {
		color=color_coche;
	}
	
	public String dime_color() {
		return "el color del coche es " + color;
	}
	
	public void dime_asientos(String asientos) {//setter
		if (asientos.equalsIgnoreCase("si")) {
			this.asientos=true;	
		}
		else {
			this.asientos=false;
		}

	}
	
	public String dime_asientos_get() {//getter
		if(asientos==true) {
			return "el coche tiene asientos de cuero";
		}else {
			return "el coche tiene asientos de serie";
		}
		
	}

	public String isClimatizador() {
		if (climatizador==true) {
			return "el coche incorpora climatizador";
		}else {
			return "el coche no tiene climatizador";
	}
	}

	public void setClimatizador(String climatizador) {
		if (climatizador.equalsIgnoreCase("si")) {
		this.climatizador = true;
	}else {
		this.climatizador=false;
	}

	}
	
}
