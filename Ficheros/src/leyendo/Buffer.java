package leyendo;

import java.io.*;

public class Buffer {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leer_Fichero2 accediendo = new leer_Fichero2();
		
		accediendo.lee();

	}

}


class leer_Fichero2{
	
	public void lee(){
		
		try {
			FileReader entrada = new FileReader("C:/Users/jguerra/Downloads/streams.txt");
			
			BufferedReader miBuffer = new BufferedReader(entrada);
			
			String linea="";
			
			
			
			while (linea!= null) {
				
				linea=miBuffer.readLine();
				
				if(linea!= null)
				System.out.println(linea);
			
			}
			
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No existe el archivo");;
		}
	}
}

