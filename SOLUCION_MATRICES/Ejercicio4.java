package matricespares;
import java.util.Scanner;
public class Ejercicio4 {
    public static void main(String[] args) {
        char[][] tablero = {
            {' ', ' ', ' '},
            {' ', ' ', ' '},
            {' ', ' ', ' '}
        };
        char jugadorActual = 'X';
        while (true) {
            imprimirTablero(tablero);
            hacerMovimiento(tablero, jugadorActual);
            if (haGanado(tablero, jugadorActual)) {
                imprimirTablero(tablero);
                System.out.println("¡Jugador " + jugadorActual + " ha ganado!");
                break;
            } else if (esEmpate(tablero)) {
                imprimirTablero(tablero);
                System.out.println("¡Empate!");
                break;
            }
            jugadorActual = (jugadorActual == 'X') ? 'O' : 'X';
        }
    }
    public static void imprimirTablero(char[][] tablero) {
        System.out.println("-------------");
        for (int i = 0; i < 3; i++) {
            System.out.print("| ");
            for (int j = 0; j < 3; j++) {
                System.out.print(tablero[i][j] + " | ");
            }
            System.out.println();
            System.out.println("-------------");
        }
    }
    public static void hacerMovimiento(char[][] tablero, char jugador) {
        Scanner scanner = new Scanner(System.in);
        int fila, columna;
        do {
            System.out.print("Jugador " + jugador + ", ingresa la fila (0-2): ");
            fila = scanner.nextInt();
            System.out.print("Jugador " + jugador + ", ingresa la columna (0-2): ");
            columna = scanner.nextInt();
        } while (fila < 0 || fila >= 3 || columna < 0 || columna >= 3 || tablero[fila][columna] != ' ');
        tablero[fila][columna] = jugador;
    }
    public static boolean haGanado(char[][] tablero, char jugador) {
        // Verificar filas y columnas
        for (int i = 0; i < 3; i++) {
            if ((tablero[i][0] == jugador && tablero[i][1] == jugador && tablero[i][2] == jugador) ||
                (tablero[0][i] == jugador && tablero[1][i] == jugador && tablero[2][i] == jugador)) {
                return true;
            }
        }
        if ((tablero[0][0] == jugador && tablero[1][1] == jugador && tablero[2][2] == jugador) ||
            (tablero[0][2] == jugador && tablero[1][1] == jugador && tablero[2][0] == jugador)) {
            return true;
        }
        return false;
    }
    public static boolean esEmpate(char[][] tablero) {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (tablero[i][j] == ' ') {
                    return false; 
                }
            }
        }
        return true;
    }
}

