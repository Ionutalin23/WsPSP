import java.util.Date;
public class ThreadPrimo implements Runnable {
	private Long num;
	
	

	public ThreadPrimo(Long num) {
		super();
		this.num = num;
	}

	@Override
	public void run() {
		Date inicio= new Date();
		Long tiempo=inicio.getTime();
		System.out.println("Arrancando hilo "+Thread.currentThread().getName());
		boolean primo = true;
		int contador = 2;
		while(contador!=num && primo==true) {
			if (num % contador == 0) 
				primo= false;
			contador++;
			
		}
		Date finall= new Date();
		System.out.println(primo?"Es primo":"No es primo");
		System.out.println("Ha tardado: "+(finall.getTime()-tiempo));
	}
}
