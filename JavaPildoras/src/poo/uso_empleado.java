

package poo;

import java.util.*;

public class uso_empleado {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		/*empleado empleado1 = new empleado("juan", 70000, 1995, 07, 20);
		empleado empleado2 = new empleado("juana", 80000, 1996, 06, 30);
		empleado empleado3 = new empleado("juanito", 90000, 1997, 05, 12);
		
		empleado1.setSueldos(5);
		empleado2.setSueldos(5);
		empleado3.setSueldos(5);
		
		System.out.println("nombre: " + empleado1.getNombre() + " sueldo: " + empleado1.getSueldos() + " " +
				empleado1.getAltaContrato());
		
		System.out.println("nombre: " + empleado2.getNombre() + " sueldo: " + empleado2.getSueldos() + " " +
				empleado2.getAltaContrato());
		
		System.out.println("nombre: " + empleado3.getNombre() + " sueldo: " + empleado3.getSueldos() + " " +
				empleado3.getAltaContrato());*/
		
		jefatura jefeIT = new jefatura("jean poll", 100000, 2025, 03, 30);
		jefeIT.SetEstableceIncentivo(2500);
		
		Empleado[] misempleados = new Empleado[6];
		
		misempleados[0] = new Empleado("juan", 70000, 1995, 07, 20);
		misempleados[1] =new Empleado ("juana", 80000, 1996, 06, 30);
		misempleados[2] = new Empleado ("juanito", 90000, 1997, 05, 12);
		misempleados[3] = new Empleado ("Maria");
		misempleados[4] = jefeIT; //POLIMORFIMOS PRINCIPIO DE SUSTITUCION
		misempleados[5] = new jefatura("Ana", 3000, 2000, 07, 21);
		jefatura jefe_finanzas = (jefatura) misempleados[5];
		Empleado director_comercial=new jefatura("Anabel", 89000, 2025, 02, 12);
		
		Comparable ejemplo=new Empleado("Maria", 30000, 2025,02,12);
		
		System.out.println(jefe_finanzas.tomar_decisiones("dar mas dias de vacaciones a los ingenieros de IT"));
		System.out.println(jefe_finanzas.getNombre() + " tendra un bonus de: " + jefe_finanzas.establece_bonus(1000));
		System.out.println(misempleados[5].getNombre() + " tendra un bonus de: " + misempleados[5].establece_bonus(10000));
		
		if (director_comercial instanceof jefatura) {
			System.out.println("pertenece a la clase jefatura");
		}
		
		if (ejemplo instanceof Comparable) {
			System.out.println("implementa la interdaz comparable");
		}
		
		jefe_finanzas.SetEstableceIncentivo(10000);
		
	
		
		
		//for mejorado
		
		for (Empleado e : misempleados) {
			e.setSueldos(5);	
		}
		
		Arrays.sort(misempleados);//sort se usa para ordenar el resultado por objetos, ejemplo de mayo a menor en sueldo
			

		
		//for mejorado
		
		for (Empleado e : misempleados) {
			System.out.println("nombre: " + e.getNombre() + " sueldo: " + e.getSueldos() + " " +
					e.getAltaContrato());
		}
		
	}

}

class Empleado implements Comparable, Trabajadores{
	
	public Empleado (String nom, double sueldo, int ano, int mes, int dia) {
		
		GregorianCalendar calendario = new GregorianCalendar(ano, mes-1, dia);
		altaContrato = calendario.getTime();
		
		nombre= nom;
		sueldos=sueldo;
		altaContrato=calendario.getTime();
		++idSiguiente;
		id=idSiguiente;
	
	}
	
	public double establece_bonus(double gratificacion) {
		return Trabajadores.bonus_base+gratificacion;
	}
	
	
	public 	Empleado(String nom){
		this(nom, 30000, 2025, 01, 01);

	}
	
	
	
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
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
	
	public int compareTo(Object miObjeto) {
		Empleado otroEmpleado=(Empleado) miObjeto; //casting
		
		if (this.sueldos<otroEmpleado.sueldos) {
			return -1;
		}                                  ////implementar compareTo METODO DE SORT
		
		if (this.sueldos>otroEmpleado.sueldos) {
			return 1;
		}
		return 0;
	}
	



	private String nombre;
	private double sueldos;
	private Date altaContrato;
	private static int idSiguiente;
	private int id;
}


class jefatura extends Empleado implements Jefes{
	
	
	
	public jefatura (String nom, double sueldo, int ano, int mes, int dia) {
		
		super(nom, sueldo, ano, mes, dia);
	}
	
	public String tomar_decisiones(String decision) {//metodo de la interfaz jefes
		return "Un miembro de la direccion a tomado la decision de: " + decision;
	}
	
	public void SetEstableceIncentivo(double b) {
		incentivo=b;

	}
	
	
	public double establece_bonus(double gratificacion) {
		double prima=2000;
		return Trabajadores.bonus_base+gratificacion+prima;
	}
	
	public double getSueldos() {
		double jefeSueldo=super.getSueldos();
		return jefeSueldo+incentivo;
	}
	
	private double incentivo;
}

