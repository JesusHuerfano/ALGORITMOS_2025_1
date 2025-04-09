import java.util.Scanner;

public class FibonacciFactorial {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Solicitar al usuario la cantidad de números de la serie de Fibonacci
        System.out.print("Ingrese cuántos números de la serie de Fibonacci desea imprimir: ");
        int n = scanner.nextInt();

        // Imprimir la serie de Fibonacci
        System.out.println("Serie de Fibonacci:");
        int a = 0, b = 1, temp;
        for (int i = 0; i < n; i++) {
            System.out.print(a + " ");
            temp = a + b;
            a = b;
            b = temp;
        }
        System.out.println();

        // Calcular e imprimir el factorial del número ingresado
        System.out.println("Factorial de " + n + " es: " + factorial(n));
    }

    // Método para calcular el factorial
    public static long factorial(int num) {
        long fact = 1;
        for (int i = 1; i <= num; i++) {
            fact *= i;
        }
        return fact;
    }
}
