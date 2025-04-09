import java.util.Scanner;

public class OperacionesMatematicas {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú
            System.out.println("\nMenú de operaciones:");
            System.out.println("1. Sumar dos números");
            System.out.println("2. Restar dos números");
            System.out.println("3. Multiplicar dos números");
            System.out.println("4. Dividir dos números");
            System.out.println("5. Factorial de un número");
            System.out.println("6. Salir");
            System.out.print("Seleccione una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarOperacion(scanner, "sumar");
                    break;
                case 2:
                    realizarOperacion(scanner, "restar");
                    break;
                case 3:
                    realizarOperacion(scanner, "multiplicar");
                    break;
                case 4:
                    realizarOperacion(scanner, "dividir");
                    break;
                case 5:
                    System.out.print("Ingrese un número para calcular el factorial: ");
                    int num = scanner.nextInt();
                    System.out.println("Factorial de " + num + " es: " + factorial(num));
                    break;
                case 6:
                    System.out.println("Saliendo del programa...");
                    break;
                default:
                    System.out.println("Opción no válida, intente de nuevo.");
            }
        } while (opcion != 6);

        scanner.close();
    }

    // Método para realizar operaciones básicas
    public static void realizarOperacion(Scanner scanner, String operacion) {
        System.out.print("Ingrese el primer número: ");
        double num1 = scanner.nextDouble();
        System.out.print("Ingrese el segundo número: ");
        double num2 = scanner.nextDouble();

        double resultado = 0;
        switch (operacion) {
            case "sumar":
                resultado = num1 + num2;
                break;
            case "restar":
                resultado = num1 - num2;
                break;
            case "multiplicar":
                resultado = num1 * num2;
                break;
            case "dividir":
                if (num2 != 0) {
                    resultado = num1 / num2;
                } else {
                    System.out.println("No se puede dividir por cero.");
                    return;
                }
                break;
        }
        System.out.println("El resultado de la operación es: " + resultado);
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
