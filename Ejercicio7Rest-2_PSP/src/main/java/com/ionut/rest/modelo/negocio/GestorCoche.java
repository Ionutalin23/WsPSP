package com.ionut.rest.modelo.negocio;

import java.util.List;
import java.util.Optional;

import org.hibernate.event.spi.AbstractPreDatabaseOperationEvent;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.ionut.rest.modelo.entidad.Coche;
import com.ionut.rest.modelo.persistencia.DaoCoche;

@Service
public class GestorCoche {
	@Autowired
	private DaoCoche daoCoche;
	
	public List<Coche> listarCoches(){
		List<Coche> lista = daoCoche.findAll();
		return lista;
	}
	public Coche obtenerCoche(int id) {
		Optional<Coche> c=daoCoche.findById(id);
		if (c.isPresent()) {
			return c.get();
		}else {
			return null;
		}
	}
	public Coche altaCoche(Coche coche) {
		if(coche.getPotencia()<=0) {
			return null;
		}
		Coche c = daoCoche.save(coche);
		return c;
	}
	public Coche modificarCoche(Coche coche) {
		if(coche.getPotencia()<=0) {
			return null;
		}
		Coche c = daoCoche.save(coche);
		return c;
	}
	public boolean borrarCoche(int id) {
		if (daoCoche.findById(id) != null) {
			daoCoche.deleteById(id);
			return true;
		}else {
			return false;
		}
	}

}
