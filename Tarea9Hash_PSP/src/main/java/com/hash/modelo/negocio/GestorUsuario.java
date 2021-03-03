package com.hash.modelo.negocio;

import java.util.Optional;


import com.hash.modelo.entidad.Usuario;
import com.hash.modelo.persistencia.DaoUsuario;

public class GestorUsuario {
	
	public static boolean validarUsuario(Usuario usuario,DaoUsuario daoUsuario) {
		Optional<Usuario> userBBDD = daoUsuario.findByNombre(usuario.getNombre());
		if(userBBDD.isEmpty()) {
			return false;
		}
		if(userBBDD.get().getPass().equals(usuario.getPass())) {
			return true;
		}else {
			return false;
		}
	}
}
