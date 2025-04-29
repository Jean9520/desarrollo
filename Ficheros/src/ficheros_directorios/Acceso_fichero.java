package ficheros_directorios;

import java.io.*;

public class Acceso_fichero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		File ruta = new File ("C:/Users/jguerra/eclipse-workspace/Ficheros");
		
		System.out.println(ruta.getAbsolutePath());
		
		String [] nombres_archivo=ruta.list();
		
		for (int i = 0; i < nombres_archivo.length; i++) {
			System.out.println(nombres_archivo[i]);
			
			
			File carpeta = new File (ruta.getAbsolutePath(), nombres_archivo[i]);
			 if (carpeta.isDirectory()) {
				 
				 String [] archivos_carpeta = carpeta.list();
				 
				 for (int j = 0; j < archivos_carpeta.length; j++) {
					System.out.println(archivos_carpeta[j]);
				}
				 
				 
			 }
			
			
		}
		

	}

}
