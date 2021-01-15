package com.ionut.rest.controlador;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RestController;

import com.ionut.rest.modelo.entidad.Videojuego;
@RestController
public class ControladorVideojuego {
	private Videojuego counter = new Videojuego(1,"Counter Strike Global Offensive",13.25,"Valve Corporation");
	@GetMapping("videojuego")
	public Videojuego devolverVideoJuego() {
		//Videojuego counter = new Videojuego();
		counter.setId(1);
		counter.setNombre("Counter Strike Global Offensive");
		counter.setPrecio(13.25); //Precio en Steam
		counter.setCompañia("Valve Corporation");
		return counter;
	}
	@PutMapping("precio")
	public StringBuffer modificarPrecio() {
		Double precioFinal = counter.getPrecio()-10;
		counter.setPrecio(precioFinal);
		StringBuffer buffer = new StringBuffer();
		buffer.append("<html><head><title>Counter Strike Game</title></head><body><h1 style='color:blue'>Se ha modificado el precio</h1><h3>El precio se ha modificado a: "+counter.getPrecio()+"</body></html>");
		return buffer;
		
	}
	
}
