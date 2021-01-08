import java.util.ArrayList;
import java.util.Scanner;

public class EntradaSalida {
	private static ArrayList<Long> numeros;
	private static Scanner sc;

	public static ArrayList<Long> pedirNumeros() {
		sc= new Scanner(System.in);
		numeros= new ArrayList<Long>();
		System.out.println("Introduce un número");
		numeros.add(sc.nextLong());
		System.out.println("Introduce otro número");
		numeros.add(sc.nextLong());
		System.out.println("Introduce otro número");
		numeros.add(sc.nextLong());
		return numeros;
		}
}
