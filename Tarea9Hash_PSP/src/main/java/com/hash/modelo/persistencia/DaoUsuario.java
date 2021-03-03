package com.hash.modelo.persistencia;

import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.hash.modelo.entidad.Usuario;

@Repository
public interface DaoUsuario extends JpaRepository<Usuario, Integer> {
	public Optional<Usuario> findByNombre(String nombre);
}
