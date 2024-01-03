package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio_3 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double iva, precio, totalAplicandoIva, totalSinIva;
        int cantidadProdu, unidadDese, codFact;
        boolean hecho = false;
        iva = 0.12;
        System.out.print("Ingresar numero de productor para el inventario: ");
        cantidadProdu = teclado.nextInt();
        String[] nombrePro = new String[cantidadProdu];
        int[][] resultadoProdu = new int[cantidadProdu][3];
        for (int i = 0; i < cantidadProdu; i++) {
            resultadoProdu[i][0] = i + 1;
            System.out.println(" ");
            System.out.println("código producto : " + resultadoProdu[i][0]);
            System.out.print("Ingresar  nombre del producto:   " + (i + 1) );
            teclado.nextLine();
            nombrePro[i] = teclado.nextLine();
            System.out.print("Ingresar valor del producto: ");
            resultadoProdu[i][1] = teclado.nextInt();
            System.out.print("Ingresar la unidad del producto: ");
            resultadoProdu[i][2] = teclado.nextInt();
        }   
        System.out.println(" ");
        System.out.println("factura");
        for (int i = 0; i < cantidadProdu; i++) {
            System.out.println("Codigo: " + resultadoProdu[i][0] + ", Producto: " + nombrePro[i]);
            System.out.println("Precio: " + resultadoProdu[i][1] + ", unidad: " + resultadoProdu[i][2]);
        }
        System.out.println(" ");
        System.out.println("factura ");
        System.out.print("Ingresar código del producto que facturara ");
        codFact = teclado.nextInt();
        for (int i = 0; i < cantidadProdu; i++) {
            if (resultadoProdu[i][0] == codFact) {
                hecho = true;
                System.out.print("Ingresar unidad deseada a facturar: " + nombrePro[i]);
                unidadDese = teclado.nextInt();
                precio = resultadoProdu[i][1];
                totalSinIva = precio * unidadDese;
                totalAplicandoIva = totalSinIva + (totalSinIva * iva);
                if (totalSinIva >= 100) {
                    System.out.println("Ha superado los 100 $ en compras se aplicara un descuento ");
                    System.out.println("Producto: " + nombrePro[i] + ", Unidad: " + unidadDese);
                    System.out.println("Su valor a pagar es: " + totalSinIva );
                } else {
                    System.out.println("Producto: " + nombrePro[i] + ", Cantidad: " + unidadDese);
                    System.out.println("Su valor total a pagar es: $" + totalSinIva + " , Sumando el iva (12%): " + totalAplicandoIva );
                }
            }
        }

    }
}
    