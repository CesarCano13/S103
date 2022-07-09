package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;

public class LeerArchivo {

	private static HashMap<String, String> nombres = new HashMap<String, String>();

	public static HashMap<String, String> getNombres() {
		return nombres;
	}

	public static void setNombres(HashMap<String, String> nombres) {
		LeerArchivo.nombres = nombres;
	}

	public static void leer() {

		String cadena = "";

		try {
			FileReader entrada = new FileReader("C:/Users/cesar/Documents/Itinerario/S103/countries.txt");
			BufferedReader mibuffer = new BufferedReader(entrada);
			while (cadena != null) {
				cadena = mibuffer.readLine();
				nombres.put(cadena, cadena);
			}
			//Para cerrar el flujo de datos
			mibuffer.close();
		} catch (IOException e) {
			System.out.println("No se ha encontrado el archivo");
		}

	}

}
