import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n;
        do {
            System.out.print("Ingrese tamaño de la matriz (máximo 5): ");
            n = sc.nextInt();
        } while (n > 5 || n < 1);

        int[][] matriz = new int[n][n];
        int sumaPrincipal = 0;
        int sumaSecundaria = 0;

        // Llenar la matriz
        for (int i = 0; i < n; i++) {
            for (int j = 0; j < n; j++) {
                System.out.print("Elemento [" + i + "][" + j + "]: ");
                matriz[i][j] = sc.nextInt();
            }
        }

        // Calcular las sumas de las diagonales
        for (int i = 0; i < n; i++) {
            sumaPrincipal += matriz[i][i];
            sumaSecundaria += matriz[i][n - 1 - i];
        }

        System.out.println("Suma diagonal principal: " + sumaPrincipal);
        System.out.println("Suma diagonal secundaria: " + sumaSecundaria);
    }
}
