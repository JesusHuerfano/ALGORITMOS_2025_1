import java.util.Scanner;

public class SumaVectores {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir un vector de tamaño 5
        int[] vector = new int[5];
        
        // Llenar el vector
        System.out.println("Ingrese 5 números enteros:");
        for (int i = 0; i < 5; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Calcular la suma de los números
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            suma += vector[i];
        }
        
        // Mostrar el resultado
        System.out.println("La suma de los números es: " + suma);
        
        scanner.close();
    }
}
