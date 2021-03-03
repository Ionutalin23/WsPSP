package com.hash.vista.consola;

import java.util.Scanner;

import com.hash.modelo.entidad.Usuario;

public class EntradaSalida {
	public final static int ALTA_USUARIO=1;
	public final static int LOGIN_USUARIO=2;
	public final static int SALIR=3;
	private static Scanner sc = new Scanner(System.in);
	
	public static int mostrarMenu() {
		System.out.println(ALTA_USUARIO+"-Alta usuario");
		System.out.println(LOGIN_USUARIO+"-Login usuario");
		System.out.println(SALIR+"-Salir");
		return sc.nextInt();
	}

	public static Usuario pedirUsuario() {
		System.out.println("Introduce el nombre de usuario:");
		String nombre = sc.next();
		System.out.println("Introduce la contraseña:");
		String pass = sc.next();
		Usuario usuario = new Usuario(nombre,pass);
		return usuario;
	}

	public static void mostrarResultadoLogin(boolean validado) {
		if (validado) {
			System.out.println("Login realizado con éxito!!");
		}else {
			System.err.println("Usuario o contraseña incorrectos!!");
		}
		
	}

}
