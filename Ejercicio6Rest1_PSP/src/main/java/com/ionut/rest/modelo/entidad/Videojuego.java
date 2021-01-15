package com.ionut.rest.modelo.entidad;

public class Videojuego {
	private int id;
	private String nombre;
	private String compañia;
	private Double precio;
	
	public Videojuego(int id, String nombre, Double precio, String compañia) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.compañia = compañia;
		this.precio = precio;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public String getCompañia() {
		return compañia;
	}
	public void setCompañia(String compañia) {
		this.compañia = compañia;
	}
	public Double getPrecio() {
		return precio;
	}
	public void setPrecio(Double precio) {
		this.precio = precio;
	}
	@Override
	public String toString() {
		return "Videojuego [id=" + id + ", nombre=" + nombre + ", compañia=" + compañia + ", precio=" + precio + "]";
	}
	
	
}
