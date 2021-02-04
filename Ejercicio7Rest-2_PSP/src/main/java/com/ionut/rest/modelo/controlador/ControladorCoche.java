package com.ionut.rest.modelo.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;

import com.ionut.rest.modelo.entidad.Coche;
import com.ionut.rest.modelo.negocio.GestorCoche;
@Controller
public class ControladorCoche {
	@Autowired
	private GestorCoche gc;
	
	@GetMapping("coches")
	public ResponseEntity<List<Coche>> listar(){
		List<Coche> lista = gc.listarCoches();
		ResponseEntity<List<Coche>> re = new
				ResponseEntity<List<Coche>>(lista,HttpStatus.OK);
		return re;
	}
	@GetMapping("coches/{id}")
	public ResponseEntity<Coche> obtener(@PathVariable("id") int id){
		Coche coche = gc.obtenerCoche(id);
		HttpStatus codigo_respuesta = null;
		if(coche != null) {
			codigo_respuesta = HttpStatus.OK;
		}else {
			codigo_respuesta = HttpStatus.NOT_FOUND;
		}
		ResponseEntity<Coche> re = new
				ResponseEntity<Coche>(coche,codigo_respuesta);
		return re;
	}
	@PostMapping("coches")
	public ResponseEntity<Coche> alta(@RequestBody Coche coche){
		Coche c = gc.altaCoche(coche);
		HttpStatus codigo_respuesta = null;
		if (c != null) {
			codigo_respuesta = HttpStatus.OK;
		}else {
			codigo_respuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Coche> re = new
				ResponseEntity<Coche>(c,codigo_respuesta);
		return re;
	}
	@PutMapping("coches/{id}")
	public ResponseEntity<Coche> modificarCoche(@RequestBody Coche coche , @PathVariable("id") int id){
		Coche c = gc.modificarCoche(coche);
		HttpStatus codigo_respuesta = null;
		if (c != null) {
			codigo_respuesta = HttpStatus.OK;
		}else {
			codigo_respuesta = HttpStatus.BAD_REQUEST;
		}
		ResponseEntity<Coche> re = new
				ResponseEntity<Coche>(c,codigo_respuesta);
		return re;
	}
	@DeleteMapping("coches/{id}")
	public ResponseEntity<Integer> eliminarCoche(@PathVariable("id") int id){
		boolean borrado = gc.borrarCoche(id);
		HttpStatus codigo_respuesta = null;
		if(borrado) {
			codigo_respuesta = HttpStatus.OK;
		}else {
			codigo_respuesta = HttpStatus.BAD_REQUEST;
		}
		return new ResponseEntity<Integer>(id,codigo_respuesta);
	}
}
