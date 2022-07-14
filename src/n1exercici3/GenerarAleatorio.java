package n1exercici3;

import java.util.Random;
import java.util.Scanner;

public class GenerarAleatorio {
	private static Scanner scann = new Scanner(System.in);
	private static int MAXIMO = 10;

	public static int aleatorio() {
		Random generator = new Random();
		String respuesta = "";
		int puntos = 0;

		for (int i = 0; i < MAXIMO; i++) {
			Object[] pais = LeerArchivo.getNombres().values().toArray();
			Object paisAlea = pais[generator.nextInt(pais.length)];

			System.out.print("¿Cuál es la capital de " + paisAlea + " :");
			respuesta = scann.nextLine();

			if (LeerArchivo.getNombres().containsKey(respuesta)) {
				puntos++;
				System.out.println("Has acertado. Tienes " + puntos + " puntos.");
				System.out.println("*******************");
			} else {
				System.out.println("Has fallado, vuelve a intentarlo");
				System.out.println("*******************");
			}
		}
		return puntos;
	}

}
