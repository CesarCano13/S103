package n1exercici3;

import java.io.FileWriter;
import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class Main {

	static Scanner scann = new Scanner(System.in);
	static int MAXIMO = 10;
	
	public static void main(String[] args) {
		
		String respuesta = "";
		int puntos = 0;

		//Creamos el usuario
		Usuario.crearUsuario();

		//Creamos un objetedo de la clase leer y accedemos al método
		
		/*LeerArchivo.leer();
		System.out.println("+++++++++++++++++++++++++++");*/

		
		
							
		// Generar el nombre aleatorio de el pais e introducir la respuesta e Introducir la respuesta
	
		Random generator = new Random();
		Object[] values = LeerArchivo.getNombres().values().toArray();
		Object randomValue = values[generator.nextInt(values.length)];
		
			
		for (int i = 0; i < MAXIMO; i++) {
			System.out.print("¿Cuál es la capital de " + randomValue + " :");
			respuesta = scann.nextLine();
			
			if(respuesta.equalsIgnoreCase(LeerArchivo.getNombres().get(randomValue))) {
				puntos++;
				System.out.println("Has acertado. Tienes " + puntos + " puntos.");
			} else {
				System.out.println("Has fallado, vuelve a intentarlo");
			}
		}
		
		/*//Guardamos nombre y puntuación en un archivo txt
		String resultado = "Nombre de usuario " + LeerArchivo.getNombres() + " . Puntuación " + puntos + " puntos." ;
		
		FileWriter escritura = new FileWriter("C:\\Users\\cesar\\Documents\\Itinerario\\S103\\classificacio.txt");
		
		escritura.write(resultado);*/

	}

}
