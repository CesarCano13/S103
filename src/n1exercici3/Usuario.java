package n1exercici3;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	static Scanner scann = new Scanner(System.in);
	private String nomUsu;
	static ArrayList<Usuario> usuarios = new ArrayList<Usuario>();

	public Usuario(String nomUsu) {
		super();
		this.nomUsu = nomUsu;
	}

	// Getters y setter
	public String getNomUsu() {
		return nomUsu;
	}

	public void setNomUsu(String nomUsu) {
		this.nomUsu = nomUsu;
	}

	public static ArrayList<Usuario> getUsuarios() {
		return usuarios;
	}

	public static void setUsuarios(ArrayList<Usuario> usuarios) {
		Usuario.usuarios = usuarios;
	}

	public static String crearUsuario() {
		String nom = "";
		System.out.print("Introduzca su nombre de usuario: ");
		nom = scann.next();
		Usuario usuario1 = new Usuario(nom);
		usuarios.add(usuario1);
		return nom;
	}

}
