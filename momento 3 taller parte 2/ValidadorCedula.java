import java.util.Scanner;

public class ValidadorCedula {

    // Método para verificar si la cédula cumple con todas las reglas
    public static boolean esFormatoCedulaValido(String numeroCedula) {
        if (numeroCedula.length() != 10) {
            System.out.println("Error: longitud incorrecta.");
            return false;
        }

        if (numeroCedula.charAt(0) == '0') {
            System.out.println("Error: la cédula no puede empezar con 0.");
            return false;
        }

        for (int i = 0; i < numeroCedula.length(); i++) {
            char c = numeroCedula.charAt(i);
            if (!esDigito(c)) {
                System.out.println("Error: contiene un carácter no numérico.");
                return false;
            }
        }

        return true;
    }

    // Método auxiliar para verificar si un carácter es un dígito
    public static boolean esDigito(char caracter) {
        return caracter >= '0' && caracter <= '9';
    }

    // Método principal
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String opcion;

        System.out.println("Sistema Validador de Formato de Cédulas");

        do {
            System.out.print("\nIngrese el número de cédula a validar: ");
            String cedula = scanner.nextLine();

            if (esFormatoCedulaValido(cedula)) {
                System.out.println("Formato de Cédula VÁLIDO.");
            } else {
                System.out.println("Formato de Cédula INVÁLIDO.");
            }

            System.out.print("\n¿Desea validar otra cédula? (S/N): ");
            opcion = scanner.nextLine().trim().toLowerCase();

        } while (opcion.equals("s"));

        System.out.println("Gracias por usar el sistema.");
        scanner.close();
    }
}
