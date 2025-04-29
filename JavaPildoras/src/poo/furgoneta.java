package poo;

public class furgoneta extends coche{
	
	private int capacidad_carga;
	private int plazas_extra;
	
	public furgoneta (int plazas_extra, int capacidad_carga) {
		super();
		
		this.capacidad_carga=capacidad_carga;
		this.plazas_extra=plazas_extra;
	}
	
	public String getDimeDatosFurgoneta() {
		return"la capacidad ed carga es: " + capacidad_carga + " las plazas extra son: " + plazas_extra;
	}

}
