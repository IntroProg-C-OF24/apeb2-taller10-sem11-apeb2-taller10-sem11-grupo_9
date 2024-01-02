package matricespares;
public class Ejercicio10 {
    public static void main(String[] args) {
        int tamano = 4;
        for (int i = 1; i <= tamano; i++) {
            // Imprimir espacios en blanco
            for (int j = tamano - i; j > 0; j--) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$ ");
            }
            System.out.println();
        }
        for (int i = tamano - 1; i >= 1; i--) {
            for (int j = 0; j < tamano - i; j++) {
                System.out.print(" ");
            }
            for (int k = 1; k <= i; k++) {
                System.out.print("$ ");
            }

            System.out.println();
        }
    }
}

