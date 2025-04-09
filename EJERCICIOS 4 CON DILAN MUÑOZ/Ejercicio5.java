import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double[] temperaturas = new double[7];
        double suma = 0;
        boolean fiebre = false;

        for (int i = 0; i < 7; i++) {
            System.out.print("Temperatura del día " + (i + 1) + ": ");
            temperaturas[i] = sc.nextDouble();
            suma += temperaturas[i];
            if (temperaturas[i] > 38) {
                fiebre = true;
            }
        }

        double promedio = suma / 7;
        System.out.println("Promedio de temperatura: " + promedio);

        if (fiebre) {
            System.out.println("¡Alerta de fiebre detectada!");
        } else {
            System.out.println("No hay fiebre.");
        }
    }
}
