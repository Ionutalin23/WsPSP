import java.util.Date;

public class Persona {
	private String rol;
	private String nombre;
	private Direccion direccion;
	private int edad;
	
	
	
	public Persona(String rol,String nombre, Direccion direccion, int edad) {
		this.nombre = nombre;
		this.direccion = direccion;
		this.edad = edad;
		this.rol=rol;
	}
	public String getNombre() {
		return nombre;
	}
	public void setNombre(String nombre) {
		this.nombre = nombre;
	}
	public Direccion getDireccion() {
		return direccion;
	}
	public void setDireccion(Direccion direccion) {
		this.direccion = direccion;
	}
	public int getNacim() {
		return edad;
	}
	public void setNacim(int nacim) {
		this.edad = nacim;
	}
	
	
	public String getRol() {
		return rol;
	}
	public void setRol(String rol) {
		this.rol = rol;
	}
	@Override
	public String toString() {
		return nombre + "," + direccion + "," + edad+" años";
	}
	
	
	
}
