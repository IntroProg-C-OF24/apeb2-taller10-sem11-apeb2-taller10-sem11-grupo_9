package ejercicio.pkg1;

import java.util.Scanner;

public class Ejercicio_5 {

    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int fila1, columna1, fila2, columna2;
        int[][] resultado;
        System.out.println("Ingresar numero de filas de la matriz  1:");
        fila1 = teclado.nextInt();
        System.out.println("Ingresar numero de columna de la matriz 1 : ");
        columna1 = teclado.nextInt();
        int[][] matriz1 = new int[fila1][columna1];

        System.out.println("Ingresar numero de filas de la matriz  2:");
        fila1 = teclado.nextInt();
        System.out.println("Ingresar numero de columna de la matriz  2:");
        columna2 = teclado.nextInt();
        int[][] matriz2 = new int[fila1][columna2];
        if (columna1 != fila1) {
            System.out.println("tiene q ser iguales las matrices, el numero de columna1 tiene que ser igual al columna 2");
        } else {
            resultado = new int[fila1][columna2];

            System.out.println("Matriz 1");
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna1; j++) {
                    matriz1[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matriz1[i][j] + "  | ");
                }
                System.out.println();
            }
            System.out.println("Matriz 2 ");
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna2; j++) {
                    matriz2[i][j] = (int) (Math.random() * 19 - 9);
                    System.out.print(matriz2[i][j] + "  | ");
                }
                System.out.println(" ");
            }

            System.out.println("Resultado final de la multiplicación de matrices");
            for (int i = 0; i < fila1; i++) {
                for (int j = 0; j < columna2; j++) {
                    resultado[i][j] = matriz1[i][j] * matriz2[i][j];
                    System.out.print(resultado[i][j] + "  | ");
                }
                System.out.println(" ");
            }
        }
    }
}
