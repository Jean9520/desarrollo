package leyendo;

import java.io.*;

public class Escribir_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		escribiendo acceder_txt = new escribiendo();
		acceder_txt.escribir();

	}

}


class escribiendo{
	
	public void escribir() {
		
		String frase = "Escirbr frase en fichero nuevo jean poll guerra ramirez el mejor si si ";
		
		try {
			FileWriter escritura = new FileWriter("C:/Users/jguerra/Downloads/streams_nuevo.txt");
			
			for (int i = 0; i < frase.length(); i++) {
				escritura.write(frase.charAt(i));
			}
			
			escritura.close();
			
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
	}
	
	
}