package modelo.entidad;

import modelo.negocio.Fortaleza;

public class Guerrero extends Personaje{

	private int fuerza;
	private Fortaleza fortaleza;
	
	@Override
	public void atacar(Personaje p) {
		int dañoTotal = 0;
		if(this.getArma() instanceof Espada || 
				this.getArma() instanceof Arco) {
			dañoTotal = getArma().usar() + fuerza;
		}else {
			dañoTotal = getArma().usar();
		}
		
		dañoTotal += getNivel() * 2;
		System.out.println(this.getNombre()+" hace " + dañoTotal);
		p.setPuntosVida(p.getPuntosVida() - dañoTotal);	
	}
	
	

	public Fortaleza getFortaleza() {
		return fortaleza;
	}



	public void setFortaleza(Fortaleza fortaleza) {
		this.fortaleza = fortaleza;
	}



	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void run() {
		// TODO Auto-generated method stub
		fortaleza.entrar(this);
	}
	
	
	
}
