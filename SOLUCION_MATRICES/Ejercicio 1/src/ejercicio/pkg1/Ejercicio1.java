package ejercicio.pkg1;
import java.util.Random;
import java.util.Scanner;
public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        Random random = new Random();
        int limNotas =3;
        int limEstu = 28;
        double promMayor, promMenor;
        String estMayor = " ", estMenor = " ";
        
        String[] arrNombreEstu = new String[limEstu];
        double[][] arrNotasEstu = new double[limEstu][limNotas];
        double[] arrPromEstu =new double[limEstu];
        double promTotal, sumaPro = 0;
        
        for (int i = 0; i < limEstu; i++) {
            System.out.print("Ingresar nombre del Estudiante " + (i + 1) + ": ");
            arrNombreEstu[i] = teclado.nextLine();
            for (int j = 0; j < limNotas; j++) {
                arrNotasEstu[i][j] = random.nextInt(11); 
            }     
        }
        for (int i = 0; i < limEstu; i++) {
            arrPromEstu[i] = (arrNotasEstu[i][0] * 0.35) + (arrNotasEstu[i][1] * 0.35) + (arrNotasEstu[i][2] * 0.3);
            sumaPro += arrPromEstu[i];        
        } 
        promTotal = sumaPro / limEstu;

        System.out.println("El promedio del curso: " + promTotal);
        System.out.println(" ");
        System.out.println("Estudiantes con promedios por encima del curso:");

        for (int i = 0; i < limEstu; i++) {
            if (arrPromEstu[i] > promTotal) {
                System.out.println(arrNombreEstu[i] + " | Promedio: " + arrPromEstu[i]);
            }
        }
        System.out.println(" ");
        System.out.println("Estudiantes con promedios por debajo del curso:");

        for (int i = 0; i < limEstu; i++) {
            if (arrPromEstu[i] < promTotal) {
                System.out.println(arrNombreEstu[i] + " | Promedio: " + arrPromEstu[i]);
            }
        }
        System.out.println(" ");

        promMayor = arrPromEstu[0];
        promMenor = arrPromEstu[0];

        for (int i = 1; i < limEstu; i++) {
            if (arrPromEstu[i] > promMayor) {
                promMayor = arrPromEstu[i];
                estMayor = arrNombreEstu[i];
            }

            if (arrPromEstu[i] < promMenor) {
                promMenor = arrPromEstu[i];
                estMenor = arrNombreEstu[i];
            }
        }

        System.out.println("Estudiantes con el mayor promedio:" + estMayor + " | PROMEDIO: " + promMayor);
        System.out.println("Estudiantes con el menor promedio:" + estMenor + " | PROMEDIO: " + promMenor);
    }
}
    
    
