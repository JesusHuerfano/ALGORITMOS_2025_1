import java.util.Scanner;

public class PromedioEstudiantes {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
         double[][] notas = new double[3][4];
        for (int i = 0; i < 3; i++) {
            System.out.println("Ingrese las 4 notas del estudiante " + (i + 1) + ":");
            for (int j = 0; j < 4; j++) {
                System.out.print("Asignatura " + (j + 1) + ": ");
                notas[i][j] = scanner.nextDouble();
            }
        }
            System.out.println("Promedio de cada estudiante:");
        for (int i = 0; i < 3; i++) {
            double suma = 0;
            for (int j = 0; j < 4; j++) {
                suma += notas[i][j];
            }
            double promedio = suma / 4;
            System.out.println("Estudiante " + (i + 1) + ": " + promedio);
        }
        
        scanner.close();
    }
}
