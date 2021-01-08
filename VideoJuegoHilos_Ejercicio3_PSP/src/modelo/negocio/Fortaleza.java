package modelo.negocio;

import modelo.entidad.JefeFinal;
import modelo.entidad.Personaje;

public class Fortaleza {
	private static Personaje jefe;
	
	
	public Personaje getJefe() {
		return jefe;
	}


	public void setJefe(Personaje dragon) {
		this.jefe = dragon;
	}


	//Es synchronized para que los hilos entren de uno en uno
	public synchronized void entrar(Personaje p) {
		System.out.println(p.getNombre()+" entrando a la fortaleza oscura...");
		String resultado=null;
		try {
			Thread.sleep(2000);
			System.out.println(p.getNombre()+": Siento una presencia oscura...");
			Thread.sleep(2000);
			System.out.println(jefe.getNombre()+": RGGGGGGGGGAAFFFF...(rugido)");
			while (resultado==null) {
				p.atacar(jefe);
				Thread.sleep(1000);
				jefe.atacar(p);
				if(p.getPuntosVida()<0) {
					resultado=p.getNombre()+" ha sido derrotado";
				}else if(jefe.getPuntosVida()<0) {
					resultado=jefe.getNombre()+"Ha sido derrotado \n BRAVOOO!!";
				}
			}
		} catch (InterruptedException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		System.out.println(resultado);	
		
		
	}

}
