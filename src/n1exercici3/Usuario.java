package n1exercici3;

import java.util.ArrayList;
import java.util.Scanner;

public class Usuario {

	static Scanner scann = new Scanner(System.in);
	private String nomUsu;

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

	public static String crearUsuario() {
		String nom = "";
		System.out.print("Introduzca su nombre de usuario: ");
		nom = scann.next();
		return nom;
	}

}
