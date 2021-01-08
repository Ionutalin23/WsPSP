
public class Curandero extends Personaje {
	private int sabiduria;
	
	@Override
	public void atacar(Personaje p) {
		int vidaRestante=0;
		if (p==this) {
			System.out.println("No puedo herirme a mi mismo,es pecado suicidarme");
		}else {
			if(arma instanceof Hechizo) {
				vidaRestante=p.getVida()-arma.getDaño()-sabiduria;
			}else {
				vidaRestante=p.getVida()-arma.getDaño();
			}
			arma.usar();
			p.setVida(vidaRestante);
			System.out.println(getNombre() + " atacó a " + p.getNombre() + " dejándolo a " + vidaRestante);
		}
		
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	
	

}
