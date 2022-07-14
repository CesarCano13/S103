package n1exercici3;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.HashMap;

public class GestionArchivo {

	private static HashMap<String, String> nombres = new HashMap<String, String>();

	public static HashMap<String, String> getNombres() {
		return nombres;
	}

	public static void setNombres(HashMap<String, String> nombres) {
		GestionArchivo.nombres = nombres;
	}

	public static void leer() {
		String cadena;

		try {
			FileReader fr = new FileReader(
					"C:\\Users\\cesar\\Documents\\Itinerario\\S103\\src\\n1exercici3\\countries.txt");
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
		System.out.println("*************************************************");
	}

	public static void escribir(String resultado) {
		try {
			BufferedWriter escritura = new BufferedWriter(
					new FileWriter("C:/Users/cesar/Documents/Itinerario/S103/src/n1exercici3/classificacio.txt", true));

			for (int i = 0; i < resultado.length(); i++) {
				escritura.write(resultado.charAt(i));

			}
			// Cerramos elflujo de datos
			escritura.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		System.out.println("*****++***GRACIAS POR JUGAR********++");

	}
}
