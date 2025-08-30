package pack_casos;
import java.util.Scanner;

public class UsuarioSimple {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		
		System.out.print("Ingrese su nombre: ");
		String nombre = scanner.nextLine();
		
		System.out.println("Hola "+nombre+"! , este es el Caso1");
	}

}
