package pack_casos;
import java.util.Scanner;

public class Estudiante {

	private String nombre,cod_alumno,carrera;
	private int edad;
	Scanner scanner = new Scanner(System.in);
	//Getters y Setters
	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public String getCod_alumno() {
		return cod_alumno;
	}

	public void setCod_alumno(String cod_alumno) {
		this.cod_alumno = cod_alumno;
	}

	public String getCarrera() {
		return carrera;
	}

	public void setCarrera(String carrera) {
		this.carrera = carrera;
	}

	public int getEdad() {
		return edad;
	}

	public void setEdad(int edad) {
		this.edad = edad;
	}
	
	
	public static void main(String[] args) {
		
		Estudiante alumno = new Estudiante();
		System.out.println("BIENVENIDO !! ,  alumno => "+alumno.cod_alumno+" "+alumno.nombre);
		System.out.println("De la carrera de "+alumno.carrera+".");
	}
	
	public Estudiante() {
		System.out.print("Ingrese su Nombre: ");
		this.nombre = scanner.nextLine();
		System.out.print("Ingrese su Codigo de Alumno: ");
		this.cod_alumno = scanner.nextLine();
		System.out.print("Ingrese su Edad: ");
		this.edad = Integer.parseInt(scanner.nextLine());
		System.out.print("A que Carrera pertenece ?: ");
		this.carrera = scanner.nextLine();
	}

}
