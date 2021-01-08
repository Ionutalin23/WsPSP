package modelo.entidad;

import modelo.negocio.Fortaleza;

public class Guerrero extends Personaje{

	private int fuerza;
	private Fortaleza fortaleza;
	
	@Override
	public void atacar(Personaje p) {
		int da�oTotal = 0;
		if(this.getArma() instanceof Espada || 
				this.getArma() instanceof Arco) {
			da�oTotal = getArma().usar() + fuerza;
		}else {
			da�oTotal = getArma().usar();
		}
		
		da�oTotal += getNivel() * 2;
		System.out.println(this.getNombre()+" hace " + da�oTotal);
		p.setPuntosVida(p.getPuntosVida() - da�oTotal);	
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
