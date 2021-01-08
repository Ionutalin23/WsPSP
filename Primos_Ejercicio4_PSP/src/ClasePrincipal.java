import java.util.ArrayList;


public class ClasePrincipal {
	public static void main(String[] args) {
		
		ArrayList<Long> numeros=EntradaSalida.pedirNumeros();
		ThreadPrimo hilo1= new ThreadPrimo(numeros.get(0));
		Thread t1 =new Thread(hilo1);
		ThreadPrimo hilo2= new ThreadPrimo(numeros.get(1));
		Thread t2 =new Thread(hilo2);
		ThreadPrimo hilo3= new ThreadPrimo(numeros.get(2));
		Thread t3 =new Thread(hilo3);
		t1.start();
		t2.start();
		t3.start();
		System.out.println("Final hilo main");
	}
}
