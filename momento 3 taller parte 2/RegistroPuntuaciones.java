import java.util.Scanner;

public class RegistroPuntuaciones {

    // Usamos arrays de tamaño fijo para almacenar nombres y puntuaciones.
    // Suponemos un máximo de 5 puntuaciones altas.
    static final int MAX_PUNTUACIONES = 5;
    String[] nombresJugadores = new String[MAX_PUNTUACIONES];
    int[] puntuaciones = new int[MAX_PUNTUACIONES];
    int contadorActual = 0; // Para saber cuántas puntuaciones hemos registrado

    // Método para agregar una nueva puntuación
    // No se preocupará por ordenarlas, solo por registrarlas si hay espacio.
    public void agregarPuntuacion(String nombre, int puntaje) {
        if (contadorActual < MAX_PUNTUACIONES) {
            nombresJugadores[contadorActual] = nombre;
            puntuaciones[contadorActual] = puntaje;
            contadorActual++;
            System.out.println("Puntuación para " + nombre + " registrada.");
        } else {
            System.out.println("Registro lleno. No se pudo agregar la puntuación de " + nombre);
        }
        // No es necesario el return aquí porque es void.
    }

    // Método para mostrar todas las puntuaciones registradas
    public void mostrarPuntuaciones() {
        System.out.println("\n--- Puntuaciones Más Altas ---");
        if (contadorActual == 0) {
            System.out.println("Aún no hay puntuaciones registradas.");
            return; // Salimos porque no hay datos para mostrar
        }
        for (int i = 0; i < contadorActual; i++) {  // Condición corregida: < en lugar de <=
            System.out.println(nombresJugadores[i] + ": " + puntuaciones[i] + " puntos");
        }
        System.out.println();
    }

    public static void main(String[] args) {
        RegistroPuntuaciones registro = new RegistroPuntuaciones();
        Scanner teclado = new Scanner(System.in);
        String opcionUsuario = "0"; // debe ser String para comparar con "3"

        while (!opcionUsuario.equals("3")) {
            System.out.println("\nSistema de Puntuaciones Arcade");
            System.out.println("1. Agregar Puntuación");
            System.out.println("2. Mostrar Puntuaciones");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            opcionUsuario = teclado.nextLine();

            switch (opcionUsuario) {
                case "1":
                    if (registro.contadorActual < RegistroPuntuaciones.MAX_PUNTUACIONES) {
                        System.out.print("Nombre del jugador: ");
                        String nombreJugador = teclado.nextLine();

                        System.out.print("Puntuación obtenida: ");
                        int puntajeObtenido = 0;
                        try {
                            puntajeObtenido = Integer.parseInt(teclado.nextLine());
                        } catch (NumberFormatException e) {
                            System.out.println("Entrada inválida para la puntuación. Intente de nuevo.");
                            break;
                        }
                        registro.agregarPuntuacion(nombreJugador, puntajeObtenido);
                    } else {
                        System.out.println("El registro de puntuaciones está lleno.");
                    }
                    break;

                case "2":
                    registro.mostrarPuntuaciones();
                    break;

                case "3":
                    System.out.println("Gracias por jugar!");
                    break;

                default:
                    System.out.println("Opción no válida. Intente nuevamente.");
                    break;
            }
        }
        teclado.close();
    }
}
