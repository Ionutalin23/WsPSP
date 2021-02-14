package com.ionut.rest;

import java.util.List;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import com.ionut.rest.modelo.entidad.Coche;
import com.ionut.rest.modelo.proxy.CocheProxy;

@SpringBootApplication
public class Ejercicio8RestTempletePspApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(Ejercicio8RestTempletePspApplication.class, args);
		CocheProxy cocheProxy = context.getBean("cocheProxy",CocheProxy.class);
		

		
		//System.out.println("OBTENER");
		//Coche c2 = cocheProxy.obtener(2);
		//System.out.println(c2);
		
//		System.out.println("ALTA");
//		Coche c3 = new Coche();
//		c3.setMarca("Audi");
//		c3.setMatricula("1234f");
//		c3.setModelo("a7");
//		c3.setPotencia(200);
//		c3 = cocheProxy.alta(c3);
//		System.out.println(c3);
		
//		System.out.println("MODIFICAR");
//		c3.setPotencia(300);
//		c3 = cocheProxy.modificar(c3);
//		System.out.println(c3);
		
		System.out.println("BORRAR");
		cocheProxy.borrar(12);
		
		System.out.println("LISTAR");
		List<Coche> coches = cocheProxy.listar();
		System.out.println(coches);
	}

}
