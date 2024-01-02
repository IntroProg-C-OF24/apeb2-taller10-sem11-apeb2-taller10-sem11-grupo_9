package matricespares;
public class Ejercicio8 {
    public static void main(String[] args) {
        int limMatr = 5;
        int[][] mtrx = new int[limMatr][limMatr];
        for (int i = 0; i < limMatr; i++) {
            for (int j = 0; j < limMatr; j++) {
                mtrx[i][j] = (int) (Math.random() * 19 - 9);
                System.out.print(mtrx[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println("Diagonal");
        for (int i = 0; i < limMatr; i++) {
            System.out.print(mtrx[i][i] + "\t");
        }
        System.out.println("\n Sobre ");
        for (int i = 0; i < limMatr; i++) {
            for (int j = i + 1; j < limMatr; j++) {
                System.out.print(mtrx[i][j] + "\t");
            }
            System.out.println();
        }
        System.out.println(" Debajo ");
        for (int i = 0; i < limMatr; i++) {
            for (int j = 0; j < i; j++) {
                System.out.print(mtrx[i][j] + "\t");
            }
            System.out.println();
        }
    }
}

