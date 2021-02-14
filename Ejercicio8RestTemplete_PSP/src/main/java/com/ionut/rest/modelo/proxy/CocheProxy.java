package com.ionut.rest.modelo.proxy;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import com.ionut.rest.modelo.entidad.Coche;

@Service
public class CocheProxy {
	public static final String URL_COCHES = "http://localhost:8080/coches/";
	
	public List<Coche> listar(){
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche[]> response = restTemplate.getForEntity(URL_COCHES, Coche[].class);
		Coche[] coches = response.getBody();
		List<Coche> lista_coches = Arrays.asList(coches);
		return lista_coches;
	}
	public Coche obtener(int id) {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<Coche> response = restTemplate.getForEntity(URL_COCHES+id, Coche.class);
		return response.getBody();
	}
	public Coche alta(Coche coche) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		Coche cocheCreado = restTemplate.postForObject(URL_COCHES, requestBody, Coche.class);
		return cocheCreado;
	}
	public Coche modificar(Coche coche) {
		RestTemplate restTemplate = new RestTemplate();
		HttpEntity<Coche> requestBody = new HttpEntity<>(coche);
		ResponseEntity<Coche> response = restTemplate.exchange(URL_COCHES+coche.getId(),HttpMethod.PUT,requestBody,Coche.class );
		return response.getBody();
	}
	public void borrar(int id) {
		RestTemplate restTemplate = new RestTemplate();
		restTemplate.delete(URL_COCHES+id);
	}
}
