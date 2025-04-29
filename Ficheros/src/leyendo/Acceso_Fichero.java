package leyendo;

import java.io.*;

public class Acceso_Fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		leer_Fichero accediendo = new leer_Fichero();
		
		accediendo.lee();

	}

}


class leer_Fichero{
	
	public void lee(){
		
		try {
			FileReader entrada = new FileReader("C:/Users/jguerra/Downloads/streams.txt");
			
			int c = 0;
			
			while (c!=-1) {
				
				c=entrada.read();
				
				///casting
				
				char letra = (char)c;
				
				System.out.print(letra);
			
			}
			
			entrada.close();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println("No existe el archivo");;
		}
	}
}

