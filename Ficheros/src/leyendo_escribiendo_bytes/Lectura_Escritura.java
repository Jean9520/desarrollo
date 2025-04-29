package leyendo_escribiendo_bytes;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;


//lesctur de bytes de una imagen
public class Lectura_Escritura {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int contador=0;
		
		int datos_entrada[]= new int [366154];   
		
		try {
			FileInputStream archivo_lectura =new FileInputStream("C:/Users/jguerra/Downloads/poll.jpg");
			
			boolean final_archivo=false;
			while (!final_archivo) {
					
				int byte_entrada = archivo_lectura.read();
				
				if(byte_entrada!=-1)
					
					datos_entrada[contador]=byte_entrada;
				
				else
					
				final_archivo=true;
				
				System.out.println(byte_entrada);
				
				contador++;
			}
			
			
			
			archivo_lectura.close();
		} catch (IOException e) {
			
			System.out.println("Error no se encontro la imagen");

		}
		
		System.out.println(contador);
		
		crea_fichero(datos_entrada);
		

	}
	
	static void crea_fichero(int datos_nuevo_ficheo[]) {
		
		try {
			
			FileOutputStream fichero_nuevo=new FileOutputStream("C:/Users/jguerra/Downloads/poll_copia.jpg");
			
			for (int i=0; i<datos_nuevo_ficheo.length; i++) {
				fichero_nuevo.write(datos_nuevo_ficheo[i]);
			}
			
			fichero_nuevo.close();
			
		}catch(IOException E) {
			
			System.out.println("Error al crear archivo");
			
		}
	}

}


