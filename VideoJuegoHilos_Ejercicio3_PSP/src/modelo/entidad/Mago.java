package modelo.entidad;

import modelo.negocio.Fortaleza;

public class Mago extends Personaje{
	private int inteligencia;
	private Fortaleza fortaleza;
	
	@Override
	public void atacar(Personaje p) {
		int da�oTotal = 0;
		if(this.getArma() instanceof Hechizo) {
			da�oTotal = getArma().usar() + inteligencia;
		}else {
			da�oTotal = getArma().usar();
		}
		
		da�oTotal += getNivel() * 2;
		System.out.println("Mago hace " + da�oTotal);
		p.setPuntosVida(p.getPuntosVida() - da�oTotal);	
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
