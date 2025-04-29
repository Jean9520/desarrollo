package coleccion;

import java.util.*;

public class PruebaLinkedlist {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		LinkedList<String> personas=new LinkedList<String>();
		
		personas.add("Juan");
		
		personas.add("Julianda");
		
		personas.add("Ana");
		
		personas.add("Jean");
		
		System.out.println(personas.size());
		
		ListIterator<String> it=personas.listIterator();
		
		it.next();
		
		it.add("Rodrigo");
		
		it.next();
		
		it.add("camila");
		
		for (String persona : personas) {
			
			System.out.println(persona);
			
		}

	}

}
