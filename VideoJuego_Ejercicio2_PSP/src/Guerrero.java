
public class Guerrero extends Personaje {
	private int fuerza;

	public int getFuerza() {
		return fuerza;
	}

	public void setFuerza(int fuerza) {
		this.fuerza = fuerza;
	}

	@Override
	public void atacar(Personaje p) {
		int vidaRestante=0;
		if (p == this) {
			System.out.println(getNombre() + ": No me pienso matar loco \n Asigname otro contrincante!!");
		} else if (p instanceof Mago) {
			System.out.println("AAAAAAAAAAAAAAAAARRRRRG");
			arma.usar();
			if (((Mago) p).getMana() > 30) {
				((Mago) p).repeler(this);
			} else {
				if(arma instanceof Espada) {
					vidaRestante = p.getVida() - arma.getDaño() -fuerza;
				}else {
					vidaRestante = p.getVida() - arma.getDaño() -fuerza;
				}
				System.out.println("AAAAAAAAAAAAAAAAARRRRRG");
				arma.usar();
				p.setVida(vidaRestante);
				System.out.println(getNombre() + " atacó a " + p.getNombre() + " dejándolo a " + vidaRestante);
			}

		}else {
			if(arma instanceof Espada) {
				vidaRestante = p.getVida() - arma.getDaño() -fuerza;
			}else {
				vidaRestante = p.getVida() - arma.getDaño() -fuerza;
			}
			System.out.println("AAAAAAAAAAAAAAAAARRRRRG");
			arma.usar();
			p.setVida(vidaRestante);
			System.out.println(getNombre() + " atacó a " + p.getNombre() + " dejándolo a " + vidaRestante);
		}

	}

}
