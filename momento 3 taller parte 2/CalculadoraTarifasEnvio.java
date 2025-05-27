import java.util.Scanner;

public class CalculadoraTarifasEnvio {

    // Costos base por zona (valores fijos en pesos colombianos)
    public static final double COSTO_BASE_LOCAL = 5000.0;
    public static final double COSTO_BASE_NACIONAL = 15000.0;
    public static final double COSTO_BASE_INTERNACIONAL = 50000.0;

    // Costo adicional por kilogramo (valores fijos en pesos colombianos)
    public static final double COSTO_ADICIONAL_POR_KG_LOCAL = 1000.0;
    public static final double COSTO_ADICIONAL_POR_KG_NACIONAL = 3000.0;
    public static final double COSTO_ADICIONAL_POR_KG_INTERNACIONAL = 10000.0;

    /**
     * Calcula el costo adicional basado en el peso del paquete y la zona.
     */
    public static double calcularCostoAdicionalPorPeso(double pesoKg, int zona) {
        double costoAdicional = 0.0;

        // Si el peso es negativo, no se cobra adicional
        if (pesoKg < 0) {
            return 0.0;
        }

        switch (zona) {
            case 1: // Local
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_LOCAL;
                break;
            case 2: // Nacional
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_NACIONAL;
                break;
            case 3: // Internacional
                costoAdicional = pesoKg * COSTO_ADICIONAL_POR_KG_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo adicional.");
                costoAdicional = 0.0;
        }

        return costoAdicional;
    }

    /**
     * Obtiene el costo base según la zona de envío.
     */
    public static double obtenerCostoBasePorZona(int zona) {
        double costoBase = 0.0;

        switch (zona) {
            case 1:
                costoBase = COSTO_BASE_LOCAL;
                break;
            case 2:
                costoBase = COSTO_BASE_NACIONAL;
                break;
            case 3:
                costoBase = COSTO_BASE_INTERNACIONAL;
                break;
            default:
                System.out.println("Advertencia: Zona no válida para costo base.");
                costoBase = 0.0;
        }

        return costoBase;
    }

    /**
     * Calcula la tarifa total del envío.
     */
    public static double calcularTarifaTotal(double pesoKg, int zona) {
        // Se obtiene el costo base de la zona
        double costoBase = obtenerCostoBasePorZona(zona);
        // Se calcula el adicional por el peso
        double costoAdicional = calcularCostoAdicionalPorPeso(pesoKg, zona);
        // La tarifa total es la suma de ambos
        double tarifaTotal = costoBase + costoAdicional;

        return tarifaTotal;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("--- Calculadora de Tarifas de Envío - Logística Veloz S.A. ---");

        // ----------- Lectura y validación del peso -----------
        double pesoPaquete;
        do {
            System.out.print("Ingrese el peso del paquete en kilogramos (ej: 2.5): ");
            while (!scanner.hasNextDouble()) {
                System.out.print("Valor inválido. Por favor, ingrese un número válido para el peso: ");
                scanner.next(); // Limpia el valor no numérico
            }
            pesoPaquete = scanner.nextDouble();
            if (pesoPaquete <= 0) {
                System.out.println("El peso debe ser mayor a 0.");
            }
        } while (pesoPaquete <= 0);

        // ----------- Lectura y validación de la zona -----------
        int zonaEnvio;
        do {
            System.out.println("\nSeleccione la zona de envío:");
            System.out.println("1. Local");
            System.out.println("2. Nacional");
            System.out.println("3. Internacional");
            System.out.print("Opción (1-3): ");

            while (!scanner.hasNextInt()) {
                System.out.print("Valor inválido. Ingrese una opción numérica entre 1 y 3: ");
                scanner.next();
            }

            zonaEnvio = scanner.nextInt();

            if (zonaEnvio < 1 || zonaEnvio > 3) {
                System.out.println("Zona inválida. Intente nuevamente.");
            }

        } while (zonaEnvio < 1 || zonaEnvio > 3);

        // ----------- Cálculo final -----------
        double tarifaFinal = calcularTarifaTotal(pesoPaquete, zonaEnvio);

        // ----------- Impresión del resumen -----------
        System.out.println("\n--- Detalle del Envío ---");
        System.out.println("Peso del Paquete: " + pesoPaquete + " kg");

        String nombreZona = switch (zonaEnvio) {
            case 1 -> "Local";
            case 2 -> "Nacional";
            case 3 -> "Internacional";
            default -> "Desconocida";
        };

        System.out.println("Zona de Destino: " + nombreZona);
        System.out.println("Tarifa Total de Envío: $" + String.format("%,.2f", tarifaFinal));

        scanner.close();
    }
}
