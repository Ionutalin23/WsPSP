import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
public class EntradaSalida {
	public static ApplicationContext context=new ClassPathXmlApplicationContext("recursos/context.xml");
	public final static int CREAR_PERSONAJE = 1;
	public final static int ELEGIR_PERSONAJE = 2;
	public final static int ELIMINAR_PERSONAJE = 3;
	public final static int DUELO = 4;
	public final static int SALIR = 5;
	private static Scanner sc;
	@SuppressWarnings("unchecked")
	private static List<Arma> armas =context.getBean("armas",List.class);
	@SuppressWarnings("unchecked")
	public static List<Personaje> personajes =  context.getBean("personajes",List.class);

	public static int mostrarMenu() {
		System.out.println("Selecciona una opción: ");
		System.out.println("1-Crear nuevo personaje");
		System.out.println("2-Elegir un personaje");
		System.out.println("3-Eliminar un personaje");
		System.out.println("4-DUELO");
		System.out.println("5-SALIR");
		sc = new Scanner(System.in);
		int opcion = sc.nextInt();
		return opcion;
	}

	public static Personaje crearPersonaje() {
		System.out.println("Nuevo personaje: ");
		System.out.println("Nombre: ");
		String nombre = sc.next();
		System.out.println("Puntos poder especial: ");
		int puntos = sc.nextInt();
		System.out.println("Tipo: ");
		Personaje p1 = tipoPersonaje(puntos);
		p1.setNombre(nombre);

		System.out.println("Vida: ");
		int vida = sc.nextInt();
		p1.setVida(vida);
		Arma a1 = seleccionarArma();
		p1.setArma(a1);
		personajes.add(p1);
		System.out.println("Personaje Creado");
		return p1;
	}

	private static Arma seleccionarArma() {
		Arma arma = null;
		if (armas.isEmpty()) {
			System.out.println("No existe nunguna arma creada");
			arma = crearArma();
			System.out.println("Arma creada");
		} else {
			arma = mostrarArmas();
		}
		return arma;
	}

	private static Arma mostrarArmas() {
		Arma arma = null;
		int cont = 1;
		System.out.println("Selecciona arma: ");
		if(armas.isEmpty()) {
			crearArma();
		}
		System.out.println("(Pulsa 0 para eliminar un arma)");
		System.out.println("(Pulsa 01 para crear un arma)");
		for (Arma arm : armas) {
			System.out.println(cont + "-" + arm.toString());
			cont++;
		}
		int seleccionado = sc.nextInt();
		if (seleccionado == 0) {
			eliminarArma();
		}if (seleccionado == 01) {
			crearArma();
		}
		arma = armas.get(seleccionado - 1);
		return arma;
	}

	private static void eliminarArma() {
		System.out.println("Selecciona el arma que quieres eliminar");
		for (int i = 0; i < armas.size(); i++) {
			System.out.println(i + "-" + armas.get(i).toString());
		}
		int seleccionado = sc.nextInt();
		armas.remove(seleccionado);
		System.err.println("Arma eliminada");
		mostrarArmas();
	}

	private static Arma crearArma() {
		System.out.println("Arma: ");
		System.out.println("Clase: ");
		Arma arma = tipoArma();
		System.out.println("Tipo: ");
		String tipo = sc.next();
		arma.setTipo(tipo);
		System.out.println("Daño: ");
		int daño = sc.nextInt();
		arma.setDaño(daño);
		armas.add(arma);
		return arma;
	}

	private static Personaje tipoPersonaje(int puntos) {
		Personaje p1 = null;
		System.out.println("1-Guerrero");
		System.out.println("2-Mago");
		System.out.println("3-Curandero");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			p1 = (Guerrero)context.getBean("guerrero1");
			((Guerrero) p1).setFuerza(puntos);
			break;
		case 2:
			p1 = (Mago) context.getBean("mago1");
			((Mago) p1).setMana(puntos);
			break;
		case 3:
			p1 = (Curandero)context.getBean("curandero1");
			((Curandero) p1).setSabiduria(puntos);
			break;
		default:
			tipoPersonaje(puntos);
			break;
		}
		return p1;
	}

	private static Arma tipoArma() {
		Arma arma = null;
		System.out.println("1-Arco");
		System.out.println("2-Espada");
		System.out.println("3-Hechizo");
		System.out.println("4-Rezo");
		int opcion = sc.nextInt();
		switch (opcion) {
		case 1:
			arma = (Arco)context.getBean("arco1");
			break;
		case 2:
			arma = (Espada)context.getBean("espada1");
			break;
		case 3:
			arma =(Hechizo)context.getBean("hechizo1");
			break;
		case 4:
			arma =(Rezo)context.getBean("rezo1");
			break;
		default:
			tipoArma();
			break;
		}
		return arma;
	}

	public static Personaje seleccionarPersonaje() {
		Personaje p = null;
		if (personajes.isEmpty()) {
			System.out.println("Tiene que haber 2 personajes creados");
			p = crearPersonaje();
		} else {
			p = mostrarPersonajes();
		}
		System.out.println("HAS SELECCIONADO A: " + p.getNombre());
		return p;
	}

	private static Personaje mostrarPersonajes() {
		Personaje p = null;
		int cont = 1;
		for (Personaje pers : personajes) {
			System.out.println(cont + "-" + pers.toString()+" ("+pers.getClass().getName()+")");
			cont++;
		}
		int seleccionado = sc.nextInt();
		p = personajes.get(seleccionado - 1);
		return p;
	}

	public static void eliminarPersonaje(Personaje p) {
		personajes.remove(p);
	}

	public static void duelo(Personaje p, Personaje p2) {
		String ganador = null;
		while (ganador == null) {
			p.atacar(p2);
			if (p2.getVida() <= 0) {
				ganador = p.getNombre();
				break;
			} else if (p.getVida() <= 0) {
				ganador = p2.getNombre();
				break;
			}
			p2.atacar(p);
		}
		System.out.println("El ganador es.........." + ganador);
	}

//	public static Personaje seleccionarContrincante(Personaje p) {
//		Personaje p2 = null;
//		personajes.remove(personajes.indexOf(p));
//		int cont = 1;
//		for (Personaje pers : personajes) {
//			System.out.println(cont + "-" + pers.toString());
//			cont++;
//		}
//		int seleccionado = sc.nextInt();
//		p2 = personajes.get(seleccionado - 1);
//		return p2;
//	}
}
