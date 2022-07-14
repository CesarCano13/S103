package n1exercici3;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class EscribirArchivo {

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
