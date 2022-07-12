package n11exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

import n1exercici3.LeerArchivo;

public class Main {

	static int MAXIMO = 10;

	public static void main(String[] args) {
		Scanner scann = new Scanner(System.in);
		String respuesta = "";
		String usuario = "";
		int puntos = 0;

		// Creamos un usuario
		System.out.print("Introduzca su nombre de usuario: ");
		usuario = scann.nextLine();

		// Leemos un archivo y lo guardamos en un hasmap
		String cadena;
		HashMap<String, String> nombres = new HashMap<String, String>();

		try {
			FileReader fr = new FileReader("C:/Users/cesar/Documents/Itinerario/S103/src/n11exercici3/countries.txt");
			BufferedReader br = new BufferedReader(fr);
			while ((cadena = br.readLine()) != null) {
				String[] palabra = cadena.split(" ");
				nombres.put(palabra[1], palabra[0]);

			}
			// Para cerrar el flujo de datos
			br.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}

		System.out.println("***********************************************************************");

		// Generar el nombre aleatorio de el pais e introducir la respuesta
		Random generator = new Random();

		for (int i = 0; i < MAXIMO; i++) {
			Object[] pais = nombres.values().toArray();
			Object paisAlea = pais[generator.nextInt(pais.length)];

			System.out.print("¿Cuál es la capital de " + paisAlea + " :");
			respuesta = scann.nextLine();

			if (nombres.containsKey(respuesta)) {
				puntos++;
				System.out.println("Has acertado. Tienes " + puntos + " puntos.");
			} else {
				System.out.println("Has fallado, vuelve a intentarlo");
			}
		}

		// Guardamos nombre y puntuación en un archivo txt
		String resultado = "Nombre de usuario " + usuario + " . Puntuación " + puntos + " puntos.";
		try {
			FileWriter escritura = new FileWriter(
					"C:/Users/cesar/Documents/Itinerario/S103/src/n11exercici3/classificacio.txt");
			for (int i = 0; i < resultado.length(); i++) {
				escritura.write(resultado.charAt(i));
			}
			// Cerramos el flujo de datos
			escritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("***********************************************************************");
		System.out.println("Se ha creado correctamente el archivo txt con el usuario y su puntuación");

	}

}
