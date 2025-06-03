package David_20240273;

public class SistemaInventario {
    // Arreglo de productos: [ID del Producto, Cantidad]
    static String[][] productos = {
            {"001", "15"},
            {"002", "5"},
            {"003", "50"},
            {"004", "2"},
            {"005", "100"}
    };

    //Se va a crear un método de actualizar
    public static void actualizarStock(String id, int nuevaCantidad) {
      //Esta variable será para el resultado de la busqueda, por defecto será false ya que en el "FOR" se va a confirmar si cambia o no
        boolean encontrado = false;
        //Se hace el "FOR"
        for (int i = 0; i < productos.length; i++) {
            if (productos[i][0].equals(id)) {
                // Actualiza el stock
                productos[i][1] = String.valueOf((nuevaCantidad));
                System.out.println("Stock actualizado correctamente.");
                //Cambia a true ya que sí se encontró
                encontrado = true;
                //Se termina el ciclo
                break;
            }
        }

        if //Simplemente la negación en caso de que no se encuentre
        (!encontrado) {
            System.out.println("Producto no registrado porque no fue encontrado.");
        }
    }

    // Función para listar productos con stock bajo (menor a 10)
    public static void alertarStockBajo() {
        System.out.println("Productos con stock bajo (menos de 10 unidades):");

        boolean hayStockBajo = false;
        for (int i = 0; i < productos.length; i++) {
            int cantidad = Integer.parseInt(productos[i][1]);
            if (cantidad < 10) {
                System.out.println("ID: " + productos[i][0] + " - Stock: " + cantidad);
                hayStockBajo = true;
            }
        }
        if (!hayStockBajo) {
            System.out.println("No hay productos con stock bajo.");
        }
    }
}
