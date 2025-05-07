
/*
 * Ejercicio 1: Registro de Temperaturas Mensuales
 * Estrategia: Se usa un vector de 30 posiciones para guardar las temperaturas diarias.
 * Se recorren los datos con ciclos for y se usan condicionales para encontrar los valores máximo, mínimo,
 * contar los días mayores a 25 grados y calcular el promedio.
 */

import java.util.Scanner;

public class RegistroTemperaturas {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] temperaturas = new double[30];
        double suma = 0, max = Double.MIN_VALUE, min = Double.MAX_VALUE;
        int diasCalurosos = 0;

        System.out.println("Ingrese las 30 temperaturas máximas del mes:");

        for (int i = 0; i < 30; i++) {
            System.out.print("Día " + (i + 1) + ": ");
            temperaturas[i] = scanner.nextDouble();
            suma += temperaturas[i];

            if (temperaturas[i] > max) {
                max = temperaturas[i];
            }
            if (temperaturas[i] < min) {
                min = temperaturas[i];
            }
            if (temperaturas[i] > 25) {
                diasCalurosos++;
            }
        }

        double promedio = suma / 30;

        System.out.println("
Temperatura máxima: " + max + "°C");
        System.out.println("Temperatura mínima: " + min + "°C");
        System.out.println("Temperatura promedio: " + promedio + "°C");
        System.out.println("Días con temperatura superior a 25°C: " + diasCalurosos);
    }
}
