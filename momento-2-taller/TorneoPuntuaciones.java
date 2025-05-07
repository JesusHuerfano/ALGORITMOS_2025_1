
/*
 * Ejercicio 3: Corrección de código TorneoPuntuaciones
 * Se corrigieron errores de sintaxis (tipos, índices de array, signos) y lógica (comparación del máximo).
 */

import java.util.Scanner;

public class TorneoPuntuaciones {

    public static void main(String[] args) {
        // Declarar vector para 5 puntuaciones
        int[] puntuaciones = new int[5];
        Scanner teclado = new Scanner(System.in);
        int puntuacionMaxima = Integer.MIN_VALUE;

        System.out.println("Ingrese las 5 puntuaciones de los jugadores:");

        // Ciclo para ingresar puntuaciones
        for (int i = 0; i < puntuaciones.length; i++) {
            System.out.print("Puntuación jugador " + (i + 1) + ": ");
            puntuaciones[i] = teclado.nextInt();

            // Comprobar si es la puntuación máxima
            if (puntuaciones[i] > puntuacionMaxima) {
                puntuacionMaxima = puntuaciones[i];
            }
        }

        // Mostrar puntuaciones
        System.out.println("\nPuntuaciones ingresadas:");
        for (int k = 0; k < puntuaciones.length; k++) {
            System.out.println("Jugador " + (k + 1) + ": " + puntuaciones[k]);
        }

        // Mostrar puntuación máxima
        System.out.println("\nLa puntuación máxima fue: " + puntuacionMaxima);
    }
}
