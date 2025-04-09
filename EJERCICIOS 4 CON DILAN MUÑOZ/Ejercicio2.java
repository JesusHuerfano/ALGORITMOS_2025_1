import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese un número entero positivo: ");
        int num = sc.nextInt();
        int original = num;
        int reverso = 0;

        while (num > 0) {
            int digito = num % 10;
            reverso = reverso * 10 + digito;
            num = num / 10;
        }

        if (original == reverso) {
            System.out.println(original + " es palíndromo.");
        } else {
            System.out.println(original + " no es palíndromo.");
        }
    }
}

    

