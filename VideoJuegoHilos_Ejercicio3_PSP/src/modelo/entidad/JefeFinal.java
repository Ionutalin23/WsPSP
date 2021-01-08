package modelo.entidad;

import modelo.entidad.Personaje;
import modelo.negocio.Fortaleza;

public class JefeFinal extends Personaje {

	@Override
	public void atacar(Personaje p) {
		int da�oTotal = (getNivel() * 2)+getArma().usar();
		System.out.println(this.getNombre()+" hace " + da�oTotal);
		p.setPuntosVida(p.getPuntosVida() - da�oTotal);
	}

}
