package com.ionut.rest.modelo.persistencia;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.ionut.rest.modelo.entidad.Coche;

@Repository
public interface DaoCoche extends JpaRepository<Coche, Integer> {

}
