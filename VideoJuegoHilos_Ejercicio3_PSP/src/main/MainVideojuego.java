package main;

import java.util.ArrayList;
import java.util.List;

import modelo.entidad.Arco;
import modelo.entidad.Arma;
import modelo.entidad.Espada;
import modelo.entidad.Garras;
import modelo.entidad.Guerrero;
import modelo.entidad.Healer;
import modelo.entidad.Hechizo;
import modelo.entidad.JefeFinal;
import modelo.entidad.Mago;
import modelo.entidad.Personaje;
import modelo.entidad.Rezo;
import modelo.entidad.Util;
import modelo.negocio.Arena;
import modelo.negocio.Fortaleza;

public class MainVideojuego {

	public static void main(String[] args) {
//		Personaje p1 = new Guerrero();
//		Arma espada = new Espada();
//		Personaje p2 = new Healer();
//		Arma rezo = new Rezo();
//		
//		espada.setDañoMaximo(25);
//		espada.setDañoMinimo(10);
//		
//		p1.setNombre("Conan");
//		p1.setNivel(3);
//		p1.setPuntosVida(150);
//		p1.setIniciativa(5);
//		p1.setArma(espada);
//		
//		rezo.setDañoMaximo(20);
//		rezo.setDañoMinimo(5);
//		
//		p2.setNombre("Scooby");
//		p2.setNivel(5);
//		p2.setPuntosVida(150);
//		p2.setIniciativa(4);
//		p2.setArma(rezo);
//		
//		Mago p3 = new Mago();
//		Hechizo hechizo = new Hechizo();
//		
//		hechizo.setDañoMaximo(20);
//		hechizo.setDañoMinimo(10);
//		hechizo.setProcentajeMagiaCaotica(50);
//		
//		p3.setNombre("Gandalf");
//		p3.setNivel(7);
//		p3.setPuntosVida(150);
//		p3.setIniciativa(6);
//		p3.setArma(hechizo);
//		p3.setInteligencia(4);
//		
//		List<Personaje> listaPersonajes = new ArrayList<Personaje>();
//		listaPersonajes.add(p1);
//		listaPersonajes.add(p2);
//		listaPersonajes.add(p3);
//		
//		int contrincante1 = Util.generadorNumeros(0, 3);
//		int contrincante2 = 0;
//		do {
//			contrincante2 = Util.generadorNumeros(0, 3);
//		}while(contrincante1 == contrincante2);
//		
//		Personaje luchador1 = listaPersonajes.get(contrincante1);
//		Personaje luchador2 = listaPersonajes.get(contrincante2);
//		
//		Arena arena = new Arena(luchador1, luchador2);
//		Personaje pg = arena.combate();
//		
//		System.out.println("Personaje ganador!!" + pg.getNombre());
		Personaje dragon = new JefeFinal();
		Fortaleza fortaleza = new Fortaleza();
		fortaleza.setJefe(dragon);
		Arma garras = new Garras();

		garras.setDañoMaximo(30);
		garras.setDañoMinimo(10);
		garras.setTipo("mortales");

		dragon.setArma(garras);
		dragon.setNombre("elpepe");
		dragon.setNivel(1);
		dragon.setPuntosVida(500);
		dragon.setIniciativa(5);

		Arma espada = new Espada();

		espada.setDañoMaximo(50);
		espada.setDañoMinimo(25);
		espada.setTipo("afilada");

		Personaje guerrero = new Guerrero();

		guerrero.setArma(espada);
		guerrero.setNombre("Monica");
		guerrero.setNivel(5);
		guerrero.setPuntosVida(100);
		guerrero.setIniciativa(6);
		guerrero.setFortaleza(fortaleza);

		Arma arco = new Arco();

		arco.setDañoMaximo(50);
		arco.setDañoMinimo(25);
		arco.setTipo("largo");

		Personaje guerrero2 = new Guerrero();

		guerrero2.setArma(arco);
		guerrero2.setNombre("Ionut");
		guerrero2.setNivel(4);
		guerrero2.setPuntosVida(120);
		guerrero2.setIniciativa(7);
		guerrero2.setFortaleza(fortaleza);

		Arma Hechizo = new Espada();

		Hechizo.setDañoMaximo(50);
		Hechizo.setDañoMinimo(25);
		Hechizo.setTipo("fuego");

		Personaje mago = new Mago();

		mago.setArma(Hechizo);
		mago.setNombre("Fire");
		mago.setNivel(10);
		mago.setPuntosVida(150);
		mago.setIniciativa(6);
		mago.setFortaleza(fortaleza);
		
		guerrero.start();
		guerrero2.start();
		mago.start();
		
		System.out.println("Muerto el hilo principal");

	}

}
