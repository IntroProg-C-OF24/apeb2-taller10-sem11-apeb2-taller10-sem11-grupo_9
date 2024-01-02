package matricespares;
import java.util.Scanner;
public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Calculadora de Matrices");
        int[][] matrizA = generarMatrizAleatoria();
        int[][] matrizB = generarMatrizAleatoria();
        int opcion;
        do {
            System.out.println("\nMenú:");
            System.out.println("1. Suma de Matrices");
            System.out.println("2. Resta de Matrices");
            System.out.println("3. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = teclado.nextInt();
            switch (opcion) {
                case 1:
                    mostrarMatriz("Matriz A", matrizA);
                    mostrarMatriz("Matriz B", matrizB);
                    int[][] resultadoSuma = sumarMatrices(matrizA, matrizB);
                    mostrarMatriz("Resultado de la Suma", resultadoSuma);
                    break;
                case 2:
                    mostrarMatriz("Matriz A", matrizA);
                    mostrarMatriz("Matriz B", matrizB);
                    int[][] resultadoResta = restarMatrices(matrizA, matrizB);
                    mostrarMatriz("Resultado de la Resta", resultadoResta);
                    break;
                case 3:
                    System.out.println("¡Hasta luego!");
                    break;
                default:
                    System.out.println("Opción no válida. Intente de nuevo.");
            }
        } while (opcion != 3);
        teclado.close();
    }
    public static int[][] generarMatrizAleatoria() {
        int[][] matriz = new int[3][3];
        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                matriz[i][j] = (int) (Math.random() * 19) - 9;
            }
        }
        return matriz;
    }
    public static void mostrarMatriz(String nombre, int[][] matriz) {
        System.out.println("\n" + nombre + ":");
        for (int[] fila : matriz) {
            for (int elemento : fila) {
                System.out.print(elemento + " ");
            }
            System.out.println();
        }
    }
    public static int[][] sumarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];

        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] + matrizB[i][j];
            }
        }
        return resultado;
    }
    public static int[][] restarMatrices(int[][] matrizA, int[][] matrizB) {
        int filas = matrizA.length;
        int columnas = matrizA[0].length;
        int[][] resultado = new int[filas][columnas];
        for (int i = 0; i < filas; i++) {
            for (int j = 0; j < columnas; j++) {
                resultado[i][j] = matrizA[i][j] - matrizB[i][j];
            }
        }
        return resultado;
    }
}

