package n1exercici3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Random;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {

		// Creamos un usuario y guardamos su nombre en la variable
		String usuario = Usuario.crearUsuario();

		// Leemos un archivo y lo guardamos en un hashmap
		LeerArchivo.leer();

		// Generar el nombre aleatorio de el pais y guardar la puntuación
		int puntos = GenerarAleatorio.aleatorio();

		// Guardamos nombre y puntuación en un archivo txt
		String resultado = "\n Nombre de usuario: " + usuario + " Puntuación: " + puntos + " puntos.";
		EscribirArchivo.escribir(resultado);

	}

}
