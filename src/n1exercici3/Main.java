package n1exercici3;

import java.util.ArrayList;

public class Main {

	public static void main(String[] args) {

		// Usuario.crearUsuario();

		/*
		 * // Comprobar array for (int i = 0; i < Usuario.getUsuarios().size(); i++) {
		 * System.out.println(Usuario.getUsuarios().get(i).getNomUsu());
		 * 
		 * }
		 */

		LeerArchivo acceder = new LeerArchivo();
		acceder.leer();

		System.out.println("+++++++++++++++++++++++++++");

		// Comprobar hashmap
		for (String key : LeerArchivo.getNombres().keySet()) {
			System.out.println(key + " = " + LeerArchivo.getNombres().get(key));
		}

		System.out.println("+++++++++++++++++++++++++++");

		// Generar el nombre aleatorio
		int index = (int) (Math.random() * LeerArchivo.getNombres().size());
		System.out.println("¿Cuál es la capital de " + LeerArchivo.getNombres().get(index) + " ?");

	}

}
