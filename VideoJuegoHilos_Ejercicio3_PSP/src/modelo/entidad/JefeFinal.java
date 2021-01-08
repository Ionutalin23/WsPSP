package modelo.entidad;

import modelo.entidad.Personaje;
import modelo.negocio.Fortaleza;

public class JefeFinal extends Personaje {

	@Override
	public void atacar(Personaje p) {
		int dañoTotal = (getNivel() * 2)+getArma().usar();
		System.out.println(this.getNombre()+" hace " + dañoTotal);
		p.setPuntosVida(p.getPuntosVida() - dañoTotal);
	}

}
