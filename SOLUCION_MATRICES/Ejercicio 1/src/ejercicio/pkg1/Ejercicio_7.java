package ejercicio.pkg1;
import java.util.Scanner;
public class Ejercicio_7 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        int limMatriz;
        System.out.println("Ingresar tamaño de la matriz cuadrada");
        limMatriz = teclado.nextInt();
        int[][] mt = new int[limMatriz][limMatriz];
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                mt[i][j] = (int) (Math.random() * 19 - 9); 
            }
        }
        System.out.println("Matriz Lista");
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                System.out.print(mt[i][j] + " | ");
            }
            System.out.println(" ");
        }

        System.out.println("Elementos de la diagonal secundaria");
        for (int i = 0; i < limMatriz; i++) {
            System.out.print(mt[i][(limMatriz - i) - 1] + " | ");
        }
        System.out.println();

        System.out.println("Elementos por encima de la diagonal secundaria");
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                if (j < (limMatriz - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println(" ");
        System.out.println("Elementos por debajo de la diagonal secundaria");
        for (int i = 0; i < limMatriz; i++) {
            for (int j = 0; j < limMatriz; j++) {
                if (j > (limMatriz - i) - 1) {
                    System.out.print(mt[i][j] + " | ");
                }
            }
        }
        System.out.println(" ");
    }
}
    
