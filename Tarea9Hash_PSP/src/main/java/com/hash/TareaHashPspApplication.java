package com.hash;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.hash.modelo.entidad.Usuario;
import com.hash.modelo.negocio.GestorUsuario;
import com.hash.modelo.persistencia.DaoUsuario;
import com.hash.vista.consola.EntradaSalida;

@SpringBootApplication
public class TareaHashPspApplication {
	public static ApplicationContext context = null;
	public static void main(String[] args) {
		context =SpringApplication.run(TareaHashPspApplication.class, args);
		DaoUsuario daoUsuario = context.getBean("daoUsuario",DaoUsuario.class);
		int opcion = EntradaSalida.mostrarMenu();
		while (opcion!=EntradaSalida.SALIR) {
			switch(opcion) {
				case EntradaSalida.ALTA_USUARIO:
					Usuario usuario=EntradaSalida.pedirUsuario();
					String passHasheada = ResumenHash.hashearPassword(usuario.getPass());
					usuario.setPass(passHasheada);
					daoUsuario.save(usuario);
					break;
				case EntradaSalida.LOGIN_USUARIO:
					Usuario usuarioLogin = EntradaSalida.pedirUsuario();
					String passHasheadaLogin = ResumenHash.hashearPassword(usuarioLogin.getPass());
					usuarioLogin.setPass(passHasheadaLogin);
					boolean validado=GestorUsuario.validarUsuario(usuarioLogin,daoUsuario);
					EntradaSalida.mostrarResultadoLogin(validado);
					break;
				default:
					System.err.println("Opción no válida!\nIntroduce una opción del menú");
			}
			opcion= EntradaSalida.mostrarMenu();
		}
		
	}

}
