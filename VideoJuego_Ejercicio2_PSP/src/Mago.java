
public class Mago extends Personaje {

	private int mana;

	// El mago, gracias a su maná puede repeler el ataque de cualquier enemigo
	public void repeler(Personaje p) {
		if (mana > 100) {
			System.out.println(getNombre() + " utilizó escudo mágico para repeler el ataque!!");
			setVida(p.getVida() + p.getArma().getDaño());
			setMana(50);
			System.out.println("Mana restante: " + mana);
		} else if (mana > 30) {
			arma.usar();
			System.out.println(getNombre() + " utilizó invisibilidad para repeler el 50% del ataque!!");
			setMana(20);
			System.out.println("Mana restante: " + mana);
		}
//			else {
//			System.out.println("No te queda mána para repeler los daños!!");
//		}

	}

	@Override
	public void atacar(Personaje p) {
		int vidaRestante = 0;
		if (p == this) {
			System.out.println(getNombre() + ": No me pienso matar loco \n Asigname otro contrincante!!");
		} else {
			System.out.println("MUAJAJAJAAJJA");
			if (arma instanceof Hechizo) {
				vidaRestante = p.getVida() - arma.getDaño() - mana;
			} else {
				vidaRestante = p.getVida() - arma.getDaño();
			}
			arma.usar();
			p.setVida(vidaRestante);
			System.out.println(getNombre() + " atacó a " + p.getNombre() + " dejándolo a " + vidaRestante);
		}
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
