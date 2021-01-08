
public class ClasePrincipal {
	
	
	public static void main(String[] args) {
		
		int opcion = EntradaSalida.mostrarMenu();
		Personaje p=null;
		while (opcion != 5) {
			switch (opcion) {
			case EntradaSalida.CREAR_PERSONAJE:
				EntradaSalida.crearPersonaje();
				break;
			case EntradaSalida.ELEGIR_PERSONAJE:
				 p=EntradaSalida.seleccionarPersonaje();
				break;
			case EntradaSalida.ELIMINAR_PERSONAJE:
				if(EntradaSalida.personajes.isEmpty()) {
					System.err.println("No hay ningun personaje creado");
				}else {
					Personaje pe=EntradaSalida.seleccionarPersonaje();
					EntradaSalida.eliminarPersonaje(pe);
				}
				break;
			case EntradaSalida.DUELO:
				if(p==null) {
					System.out.println("Selecciona tu personaje");
					p=EntradaSalida.seleccionarPersonaje();
				}
				System.out.println("Selecciona contrincante");
				EntradaSalida.eliminarPersonaje(p);
				Personaje p2=EntradaSalida.seleccionarPersonaje();
				EntradaSalida.duelo(p,p2);
				EntradaSalida.personajes.add(p);
				break;
			case EntradaSalida.SALIR:
				break;
			default:
				System.err.println("Selecciona una opcion válida");
				break;
			}
			opcion = EntradaSalida.mostrarMenu();
		}
//		String ganador=null;
//		Arma espada= new Espada();
//		espada.setDaño(50);
//		espada.setTipo("Espada larga");
//		Personaje guerrero= new Guerrero();
//		guerrero.setNombre(" El Pepeneitor");
//		guerrero.setArma(espada);
//		guerrero.setVida(100);
//		Personaje mago=new Mago();
//		mago.setNombre("Iceologer");
//		mago.setVida(120);
//		Arma hechizo= new Hechizo();
//		hechizo.setDaño(40);
//		hechizo.setTipo("Fuego eterno");
//		mago.setArma(hechizo);
//		((Mago) mago).setMana(120);
//		while (ganador==null) {
//			guerrero.atacar(mago);
//			mago.atacar(guerrero);
//			if(mago.getVida()<=0) {
//				ganador=guerrero.getNombre();
//			}else if(guerrero.getVida()<=0) {
//				ganador=mago.getNombre();
//			}
//		}
//		System.out.println("El ganador es.........."+ganador);

	}
}