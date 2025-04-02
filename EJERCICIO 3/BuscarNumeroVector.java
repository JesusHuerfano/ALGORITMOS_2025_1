import java.util.Scanner;

public class BuscarNumeroVector {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        // Definir un vector de tamaño 10
        int[] vector = new int[10];
        
        // Llenar el vector con 10 números ingresados por el usuario
        System.out.println("Ingrese 10 números enteros:");
        for (int i = 0; i < 10; i++) {
            vector[i] = scanner.nextInt();
        }
        
        // Solicitar un número adicional para buscar en el vector
        System.out.print("Ingrese un número para buscar en el vector: ");
        int numeroBuscado = scanner.nextInt();
        
        // Verificar si el número está en el vector
        boolean encontrado = false;
        for (int i = 0; i < 10; i++) {
            if (vector[i] == numeroBuscado) {
                encontrado = true;
                break;
            }
        }
        
        // Mostrar el resultado
        if (encontrado) {
            System.out.println("El número " + numeroBuscado + " fue encontrado en el vector.");
        } else {
            System.out.println("El número " + numeroBuscado + " no se encuentra en el vector.");
        }
        
        scanner.close();
    }
}
