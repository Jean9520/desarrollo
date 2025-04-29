package poo;

public class pruebas {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Empleados trabajador1=new Empleados("juan");
		Empleados trabajador2=new Empleados("juana");
		Empleados trabajador3=new Empleados("juanita");
		
		trabajador1.SetCambiaSeccion("IT");
		/*trabajador2.SetCambiarname("Oracia");*/
		
		System.out.println(trabajador1.getDevuelveDatos());
		System.out.println(trabajador2.getDevuelveDatos());
		System.out.println(trabajador3.getDevuelveDatos());
		
		System.out.println(Empleados.escribeIdSigueinte());
		

	}

}



class Empleados{
	
	
	public Empleados(String nom) {
		
		nombre=nom;
		seccion="Administracion";
		ID=idSiguiente;
		idSiguiente++;
	
	
	}
	
	public void SetCambiaSeccion(String seccion) {
		this.seccion= seccion;
	}
	
	/*public void SetCambiarname(String nombre) {
		this.nombre=nombre;
		
	}*/
	
	public String getDevuelveDatos() {
		return "el nombre es: " + nombre + " la seccion es " + seccion + " su ID= " +ID;
	}
	
	public static String escribeIdSigueinte() {
		return "el id siguiente es " + idSiguiente;
	}
	
	
	private final String nombre;//constante
	private String seccion;
	private int ID;
	private static int idSiguiente=1;
		
}
