import java.util.ArrayList;

public class Casa {
	private double m2;
	private ArrayList<Habitacion> habitaciones;
	private Persona due�o;
	Direccion direccion;
	ArrayList<Persona> inquilinos;
	
	public Casa(ArrayList<Habitacion> habitaciones, Persona due�o, Direccion direccion,
			ArrayList<Persona> inquilinos) {
		this.habitaciones = habitaciones;
		this.due�o = due�o;
		this.direccion = direccion;
		this.inquilinos = inquilinos;
	}
	public Casa() {};
	public ArrayList<Habitacion> getHabitaciones() {
		return habitaciones;
	}

	public void setHabitaciones(ArrayList<Habitacion> habitaciones) {
		this.habitaciones = habitaciones;
	}

	public Persona getDue�o() {
		return due�o;
	}

	public void setDue�o(Persona due�o) {
		this.due�o = due�o;
	}

	public Direccion getDireccion() {
		return direccion;
	}

	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}

	public ArrayList<Persona> getInquilinos() {
		return inquilinos;
	}

	public void setInquilinos(ArrayList<Persona> inquilinos) {
		this.inquilinos = inquilinos;
	}
	
	public double calcularM2() {
		for (int i = 0; i < habitaciones.size(); i++) {
			Habitacion h= habitaciones.get(i);
			m2+=m2+h.getM2();
		}
		return m2;
		
	}

	@Override
	public String toString() {
		return "Casa m2=" + m2 +"\n"+ "Habitaciones=" + habitaciones +"\n"+ "Due�o=" + due�o +"\n"+ "Direccion=" + direccion
				+"\n"+ "Inquilinos=" + inquilinos + "]";
	}
	
}
