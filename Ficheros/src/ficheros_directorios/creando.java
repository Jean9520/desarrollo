package ficheros_directorios;

import java.io.*;


public class creando {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		
		
		
		File ruta = new File ("C:/Users/jguerra/eclipse-workspace/Ficheros/prueba_texto/pueba_texto.txt");
		
		//ruta.mkdir();
		
		String archivo_destino = ruta.getAbsolutePath();
		
		try {
			ruta.createNewFile();
		} catch (IOException e) {
			
			
		}
		
		
		Escribiendo accede = new Escribiendo();
		accede.escribir(archivo_destino);

	}

}


class Escribiendo{
	
	
	public void escribir(String ruta_archivo) {
		
		String frase ="Esto es un ejempo, estoy aprendiendo";
		
		try {
		
		
		FileWriter escritura = new FileWriter(ruta_archivo);
		
		for (int i = 0; i < frase.length(); i++) {
			escritura.write(frase.charAt(i));
		}
		
		escritura.close();
		
		}catch (IOException e) {
			
		}

	}
	
}