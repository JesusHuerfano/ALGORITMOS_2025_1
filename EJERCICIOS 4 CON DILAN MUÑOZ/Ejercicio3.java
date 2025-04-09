import java.util.Scanner;

public class Ejercicio3 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        char[] caracteres = new char[10];
        int contadorVocales = 0;

        for (int i = 0; i < 10; i++) {
            System.out.print("Ingrese caracter #" + (i + 1) + ": ");
            caracteres[i] = sc.next().charAt(0);
            char c = Character.toLowerCase(caracteres[i]);
            if (c == 'a' || c == 'e' || c == 'i' || c == 'o' || c == 'u') {
                contadorVocales++;
            }
        }

        System.out.println("Cantidad de vocales: " + contadorVocales);
    }
}

    

