import java.util.Scanner;

public class Ejercicio1 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int[] numeros = new int[8];
        int max = Integer.MIN_VALUE;
        int posicion = -1;

        for (int i = 0; i < 8; i++) {
            System.out.print("Ingrese número #" + (i + 1) + ": ");
            numeros[i] = sc.nextInt();
            if (numeros[i] > max) {
                max = numeros[i];
                posicion = i;
            }
        }

        System.out.println("El número mayor es " + max + " en la posición " + posicion);
    }
}
