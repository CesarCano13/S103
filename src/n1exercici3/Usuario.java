package n1exercici3;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	static Scanner scann = new Scanner(System.in);
	private String nomUsu;
	private int puntuacion;

	private static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();



	// Getters y setter
	public String getNomUsu() {
		return nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public int getPuntuacion() {
		return puntuacion;
	}

	public void setPuntuacion(int puntuacion) {
		this.puntuacion = puntuacion;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuario.usuarios = usuarios;
	}

	public static void crearUsuario() {
		Usuario usuario1 = new Usuario();
		System.out.print("Introduzca su nombre de usuario: ");
		usuario1.setNomUsu(scann.next());
		System.out.println("Se ha credo correctamente el usuario " + usuario1.getNomUsu());
		System.out.println("********************************************");
		usuarios.add(usuario1);

	}

}
