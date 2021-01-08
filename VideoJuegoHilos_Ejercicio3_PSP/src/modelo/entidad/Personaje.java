package modelo.entidad;

import modelo.negocio.Fortaleza;

public abstract class Personaje extends Thread {
	private String nombre;
	private int puntosVida;
	private Arma arma;
	private int nivel;
	private int iniciativa;
	private Fortaleza fortaleza;
	
	public abstract void atacar(Personaje p);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public int getPuntosVida() {
		return puntosVida;
	}
	public void setPuntosVida(int puntosVida) {
		this.puntosVida = puntosVida;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}
	public int getNivel() {
		return nivel;
	}
	public void setNivel(int nivel) {
		this.nivel = nivel;
	}

	public int getIniciativa() {
		return iniciativa;
	}

	public void setIniciativa(int iniciativa) {
		this.iniciativa = iniciativa;
	}

	public Fortaleza getFortaleza() {
		return fortaleza;
	}

	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}
	
	
	
}
