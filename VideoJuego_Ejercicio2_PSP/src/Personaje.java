
public abstract class Personaje {
	private String nombre;
	protected Arma arma;
	private int vida;
	
	public abstract void atacar(Personaje p);
	
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Arma getArma() {
		return arma;
	}
	public void setArma(Arma arma) {
		this.arma = arma;
	}

	public int getVida() {
		return vida;
	}

	public void setVida(int vida) {
		this.vida = vida;
	}

	@Override
	public String toString() {
		return "Personaje: " + nombre + "," + arma + ", " + vida + " vida";
	}
	
	
	
	
}
