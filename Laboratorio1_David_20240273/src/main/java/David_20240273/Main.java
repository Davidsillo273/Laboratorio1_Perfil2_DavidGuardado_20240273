package David_20240273;

import static David_20240273.SistemaInventario.actualizarStock;
import static David_20240273.SistemaInventario.alertarStockBajo;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            System.out.println("\nSistema de Inventario");
            System.out.println("1. Actualizar stock de un producto");
            System.out.println("2. Listar productos con stock bajo");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();
            scanner.nextLine(); // Limpiar el buffer

            switch (opcion) {
                case 1:
                    // Actualizar stock
                    System.out.print("Introduce el ID del producto: ");
                    String id = scanner.nextLine();
                    System.out.print("Introduce la nueva cantidad: ");
                    int cantidad = scanner.nextInt();
                    actualizarStock(id, cantidad);
                    break;
                case 2:
                    // Listar productos con stock bajo
                    alertarStockBajo();
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intenta de nuevo.");
            }
        } while (opcion != 3);

        scanner.close();
    }

}