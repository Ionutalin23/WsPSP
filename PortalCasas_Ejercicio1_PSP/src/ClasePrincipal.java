import java.util.ArrayList;
import java.util.Date;

public class ClasePrincipal {

	public static void main(String[] args) {
		Casa casa1=new Casa();
		ArrayList<Habitacion> habitacionesCasa1=new ArrayList<Habitacion>();
		ArrayList<Persona> inquilinosCasa1=new ArrayList<Persona>();
		Habitacion habitacion1= new Habitacion(80, 2, Tipohabitacion.Dormitorio);
		Habitacion habitacion2= new Habitacion(55, 1, Tipohabitacion.Cocina);
		Habitacion habitacion3= new Habitacion(55, 1, Tipohabitacion.Salon);
		Habitacion habitacion4= new Habitacion(55, 1, Tipohabitacion.Atico);
		habitacionesCasa1.add(habitacion1);
		habitacionesCasa1.add(habitacion2);
		habitacionesCasa1.add(habitacion3);
		habitacionesCasa1.add(habitacion4);
		Direccion direccion_dueño= new Direccion("Calle","Caceres","29876");
		Direccion direccion_casa1= new Direccion("Calle","Henares","28670");
		Persona dueño=new Persona("Dueño","Carlos",direccion_dueño, 42);
		Persona inquilino1=new Persona("Inquilino","Diego",direccion_dueño, 30);
		Persona inquilino2=new Persona("Inquilino","Carmela",direccion_dueño, 29);
		Persona inquilino3=new Persona("Inquilino","Santiago",direccion_dueño, 5);
		inquilinosCasa1.add(inquilino1);
		inquilinosCasa1.add(inquilino2);
		inquilinosCasa1.add(inquilino3);
		casa1.setHabitaciones(habitacionesCasa1);
		casa1.setDueño(dueño);
		casa1.setDireccion(direccion_casa1);
		casa1.setInquilinos(inquilinosCasa1);
		casa1.calcularM2();
		System.out.println(casa1.toString());
	}

}
