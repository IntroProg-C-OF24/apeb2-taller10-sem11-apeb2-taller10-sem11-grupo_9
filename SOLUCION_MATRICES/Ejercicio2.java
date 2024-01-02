package matricespares;
import java.util.Scanner;   
public class MatricesPares{
    public static void main(String[] args) {
        String[][] inventario = new String[100][3]; 
        int totalProductos = 0;
        Scanner teclado = new Scanner(System.in);
        int opcion;
        do {
            System.out.println("1. Agregar producto");
            System.out.println("2. Actualizar producto");
            System.out.println("3. Buscar producto");
            System.out.println("4. Eliminar producto");
            System.out.println("5. Mostrar inventario");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            if (opcion == 1) {
                if (totalProductos < inventario.length) {
                    System.out.print("Ingrese el nombre del producto: ");
                    inventario[totalProductos][0] = teclado.next();
                    System.out.print("Ingrese el precio del producto: ");
                    inventario[totalProductos][1] = teclado.next();
                    System.out.print("Ingrese la cantidad del producto: ");
                    inventario[totalProductos][2] = teclado.next();
                    totalProductos++;
                    System.out.println("Producto agregado con éxito.");
                } else {
                    System.out.println("No se pueden agregar mas productos.");
                }
            } else if (opcion == 2) {
                System.out.print("Ingrese el nombre del producto a actualizar: ");
                String nombreProducto = teclado.next();
                boolean encontrado = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreProducto)) {
                        System.out.print("Ingrese la nueva cantidad del producto: ");
                        inventario[i][2] = teclado.next();
                        System.out.println("Producto actualizado.");
                        encontrado = true;
                        break;
                    }
                }
                if (!encontrado) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 3) {
                System.out.print("Ingrese el nombre del producto a buscar: ");
                String nombreBuscar = teclado.next();
                boolean encontradoBuscar = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreBuscar)) {
                        System.out.println("Producto encontrado:");
                        System.out.println("Nombre: " + inventario[i][0]);
                        System.out.println("Precio: " + inventario[i][1]);
                        System.out.println("Existencias: " + inventario[i][2]);
                        encontradoBuscar = true;
                        break;
                    }
                }
                if (!encontradoBuscar) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 4) {
                System.out.print("Ingrese el nombre del producto a eliminar: ");
                String nombreEliminar = teclado.next();
                boolean encontradoEliminar = false;
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0] != null && inventario[i][0].equalsIgnoreCase(nombreEliminar)) {
                        inventario[i][0] = null;
                        inventario[i][1] = null;
                        inventario[i][2] = null;
                        System.out.println("Producto eliminado con éxito.");
                        encontradoEliminar = true;
                        break;
                    }
                }
                if (!encontradoEliminar) {
                    System.out.println("Producto no encontrado en el inventario.");
                }
            } else if (opcion == 5) {
                System.out.println("Inventario:");
                System.out.printf("%-20s%-20s%-20s\n", "Nombre", "Precio", "Existencias");
                for (int i = 0; i < totalProductos; i++) {
                    if (inventario[i][0] != null) {
                        System.out.printf("%-20s%-20s%-20s\n", inventario[i][0], inventario[i][1], inventario[i][2]);
                    }
                }
            } else {
                System.out.println("Opción no válida. Por favor, seleccione una opción válida.");
            }
        } while (opcion != 0);
        teclado.close();
    }
}
