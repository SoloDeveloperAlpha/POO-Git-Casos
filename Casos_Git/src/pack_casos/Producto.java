package pack_casos;
import java.util.Scanner;

public class Producto {
    private String nombre;
    private double precio;
    private int stock;

    Scanner scanner = new Scanner(System.in);

    //Almacenamiento de Productos
    public Producto() {
        try {
            System.out.print("Ingrese el nombre del producto: ");
            this.nombre = scanner.nextLine();

            System.out.print("Ingrese el precio del producto: ");
            this.precio = leerDoubleSeguro();

            System.out.print("Ingrese la cantidad en stock: ");
            this.stock = leerEnteroSeguro();

        } catch (Exception e) {
            System.out.println("Error al ingresar datos: " + e.getMessage());
        }
    }

    public Producto(String nombre) {
        this.nombre = nombre;
        this.precio = 0.0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio) {
        this.nombre = nombre;
        this.precio = precio > 0 ? precio : 0;
        this.stock = 0;
    }

    public Producto(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = precio > 0 ? precio : 0;
        this.stock = stock >= 0 ? stock : 0;
    }

    private int leerEnteroSeguro() {
        while (true) {
            try {
                return Integer.parseInt(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Error: ingrese un número entero válido: ");
            }
        }
    }

    private double leerDoubleSeguro() {
        while (true) {
            try {
                return Double.parseDouble(scanner.nextLine());
            } catch (NumberFormatException e) {
                System.out.print("Error: ingrese un número decimal válido: ");
            }
        }
    }

    public void actualizar(String nombre) {
        this.nombre = nombre;
    }

    public void actualizar(String nombre, double precio) {
        this.nombre = nombre;
        if (precio > 0) {
            this.precio = precio;
        } else {
            System.out.println("Precio inválido.");
        }
    }

    public void actualizar(String nombre, double precio, int stock) {
        this.nombre = nombre;
        this.precio = (precio > 0) ? precio : this.precio;
        this.stock = (stock >= 0) ? stock : this.stock;
    }

    public void mostrarInfo() {
        System.out.println("\n=== PRODUCTO ===");
        System.out.println("Nombre: " + nombre);
        System.out.println("Precio: S/." + precio);
        System.out.println("Stock: " + stock);
    }

    public static void main(String[] args) {
        Producto p1 = new Producto();
        p1.mostrarInfo();

        Producto p2 = new Producto("Laptop");
        Producto p3 = new Producto("Celular", 1200.50);
        Producto p4 = new Producto("Mouse", 35.0, 50);

        p2.mostrarInfo();
        p3.mostrarInfo();
        p4.mostrarInfo();

        p4.actualizar("Teclado");
        p4.mostrarInfo();

        p4.actualizar("Monitor", 550.75);
        p4.mostrarInfo();

        p4.actualizar("Impresora", 750.0, 20);
        p4.mostrarInfo();
    }
}
