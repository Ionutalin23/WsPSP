
public class Curandero extends Personaje {
	private int sabiduria;
	
	@Override
	public void atacar(Personaje p) {
		int vidaRestante=0;
		if (p==this) {
			System.out.println("No puedo herirme a mi mismo,es pecado suicidarme");
		}else {
			if(arma instanceof Hechizo) {
				vidaRestante=p.getVida()-arma.getDa�o()-sabiduria;
			}else {
				vidaRestante=p.getVida()-arma.getDa�o();
			}
			arma.usar();
			p.setVida(vidaRestante);
			System.out.println(getNombre() + " atac� a " + p.getNombre() + " dej�ndolo a " + vidaRestante);
		}
		
	}

	public int getSabiduria() {
		return sabiduria;
	}

	public void setSabiduria(int sabiduria) {
		this.sabiduria = sabiduria;
	}
	
	

}
