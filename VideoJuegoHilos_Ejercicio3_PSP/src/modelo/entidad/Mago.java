package modelo.entidad;

import modelo.negocio.Fortaleza;

public class Mago extends Personaje{
	private int inteligencia;
	private Fortaleza fortaleza;
	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal = 0;
		if(this.getArma() instanceof Hechizo) {
			dañoTotal = getArma().usar() + inteligencia;
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel() * 2;
		System.out.println("Mago hace " + dañoTotal);
		p.setPuntosVida(p.getPuntosVida() - dañoTotal);	
	}
	
	

	public Fortaleza getFortaleza() {
		return fortaleza;
	}



	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}



	public int getInteligencia() {
		return inteligencia;
	}

	public void setInteligencia(int inteligencia) {
		this.inteligencia = inteligencia;
	}
	@Override
	public void run() {
		fortaleza.entrar(this);
	}
	
	
}
