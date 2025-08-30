package pack_casos;
import java.util.Scanner;

public class CuentaBancaria {

    private double saldo = 0;
    private final int clave = 1234;
    Scanner scanner = new Scanner(System.in);

    public static void main(String[] args) {
        CuentaBancaria cuenta = new CuentaBancaria();
        cuenta.menu();
    }

    public void menu() {
        boolean continuar = true;

        while (continuar) {
            System.out.print("\033[H\033[2J"); 
            System.out.println("Ingrese su Clave de 4 dígitos:");
            int claveIngresada = scanner.nextInt();

            if (claveIngresada == clave) {
                System.out.println("1) Depositar");
                System.out.println("2) Retirar");
                System.out.println("3) Mostrar Saldo");
                System.out.println("4) Salir");
                System.out.print("Elija opción: ");
                int opcion = scanner.nextInt();

                switch (opcion) {
                    case 1 -> Depositar();
                    case 2 -> Retirar();
                    case 3 -> MostrarSaldo();
                    case 4 -> {
                        System.out.println("GRACIAS!");
                        continuar = false;
                    }
                    default -> System.out.println("Opción inválida.");
                }
            } else {
                System.out.println("Contraseña incorrecta.");
            }

            if (continuar) {
                System.out.println("\nPresione Enter para continuar...");
                scanner.nextLine();
                scanner.nextLine();
            }
        }
    }

    public void Depositar() {
        System.out.print("Ingrese la cantidad a depositar: ");
        if (scanner.hasNextDouble()) {
            double cantidad = scanner.nextDouble();
            saldo += cantidad;
            System.out.println("Se depositó S/ " + cantidad + ". Nuevo saldo: S/ " + saldo);
        } else {
            System.out.println("Debe ingresar una cantidad numérica.");
            scanner.next();
        }
    }

    public void Retirar() {
        System.out.print("Ingrese la cantidad que desea retirar: ");
        if (scanner.hasNextDouble()) {
            double cantidad = scanner.nextDouble();
            if (cantidad > saldo) {
                System.out.println("Saldo insuficiente. Su saldo actual es S/ " + saldo);
            } else {
                saldo -= cantidad;
                System.out.println("Se retiró S/ " + cantidad + ". Nuevo saldo: S/ " + saldo);
            }
        } else {
            System.out.println("Debe ingresar una cantidad numérica.");
            scanner.next();
        }
    }

    public void MostrarSaldo() {
        System.out.println("Su saldo actual es: S/ " + saldo);
    }
}
