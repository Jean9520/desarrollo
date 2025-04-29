package poo;

import java.util.Date;
import java.util.GregorianCalendar;

public class Uso_persona {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		Persona[] lasPersonas = new Persona [2];
		
		lasPersonas [0]= new Empleado2("Jean Poll", 12000, 2025, 03, 25);
		lasPersonas [1]=new alumno("juan", "Sistemas");
		
		for(Persona p:  lasPersonas) {
			
			System.out.println(p.dameNombre() + " " + p.dameDescripcion());
		}

	}
	

}


abstract class Persona{
	
	public Persona(String nom) {
		nombre=nom;
	}
	
	public String dameNombre() {
		return nombre;
	}
	
	public abstract String dameDescripcion();
	
	private String nombre;
}


class Empleado2 extends Persona{
	
	public Empleado2(String nom, double sueldo, int ano, int mes, int dia) {
		
		super(nom);
		sueldos=sueldo;
		

		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		altaContrato=calendario.getTime();

		++idSiguiente;
		id=idSiguiente;
	
	}
	
	public String dameDescripcion() {
		return "Este Empleado tiene un id= " + id + " con un sueldo = " + sueldos;
	}
	

	public double getSueldos() {
		return sueldos;
	}
	public void setSueldos(double porcentaje) {
		double 	aumento= sueldos*porcentaje/100;
		sueldos+=aumento;
	}
	public Date getAltaContrato() {
		return altaContrato;
	}
	public void setAltaContrato(Date altaContrato) {
		this.altaContrato = altaContrato;
	}


	private double sueldos;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}

class alumno extends Persona{
	
	public alumno(String nom, String car) {

	super(nom);
	
	carrera=car;
}
public String dameDescripcion(){
	return "Este alumno esta estudiando: " + carrera;
}

private String carrera;

}
