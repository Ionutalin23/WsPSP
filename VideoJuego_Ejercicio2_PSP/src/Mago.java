
public class Mago extends Personaje {

	private int mana;

	// El mago, gracias a su man� puede repeler el ataque de cualquier enemigo
	public void repeler(Personaje p) {
		if (mana > 100) {
			System.out.println(getNombre() + " utiliz� escudo m�gico para repeler el ataque!!");
			setVida(p.getVida() + p.getArma().getDa�o());
			setMana(50);
			System.out.println("Mana restante: " + mana);
		} else if (mana > 30) {
			arma.usar();
			System.out.println(getNombre() + " utiliz� invisibilidad para repeler el 50% del ataque!!");
			setMana(20);
			System.out.println("Mana restante: " + mana);
		}
//			else {
//			System.out.println("No te queda m�na para repeler los da�os!!");
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
				vidaRestante = p.getVida() - arma.getDa�o() - mana;
			} else {
				vidaRestante = p.getVida() - arma.getDa�o();
			}
			arma.usar();
			p.setVida(vidaRestante);
			System.out.println(getNombre() + " atac� a " + p.getNombre() + " dej�ndolo a " + vidaRestante);
		}
	}

	public int getMana() {
		return mana;
	}

	public void setMana(int mana) {
		this.mana = mana;
	}

}
