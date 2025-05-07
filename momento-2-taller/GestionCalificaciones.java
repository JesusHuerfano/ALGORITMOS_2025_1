
/*
 * Ejercicio 2: Gestión de Calificaciones de Estudiantes
 * Estrategia: Se utiliza una matriz para guardar las notas de cada estudiante.
 * Se calculan los promedios y se guardan en un vector. Se cuenta cuántos aprobaron.
 */

import java.util.Scanner;

public class GestionCalificaciones {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Ingrese el número de estudiantes: ");
        int estudiantes = scanner.nextInt();

        double[][] notas = new double[estudiantes][3];
        double[] promedios = new double[estudiantes];
        int aprobados = 0, reprobados = 0;

        for (int i = 0; i < estudiantes; i++) {
            System.out.println("Estudiante " + (i + 1) + ":");
            double suma = 0;
            for (int j = 0; j < 3; j++) {
                System.out.print("  Nota del examen " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
                suma += notas[i][j];
            }
            promedios[i] = suma / 3;
            if (promedios[i] >= 6.0) {
                aprobados++;
            } else {
                reprobados++;
            }
        }

        System.out.println("
Resultados:");
        for (int i = 0; i < estudiantes; i++) {
            System.out.printf("Estudiante %d - Promedio: %.2f%n", i + 1, promedios[i]);
        }

        System.out.println("Total de aprobados: " + aprobados);
        System.out.println("Total de reprobados: " + reprobados);
    }
}
