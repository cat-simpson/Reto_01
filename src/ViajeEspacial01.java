import java.util.Scanner;

public class ViajeEspacial01 {
   
        // Constantes para las distancias, consumo de oxígeno y combustible
    private static final int DISTANCIA_TIERRA_MARTE = 225; // en millones de km
    private static final int DISTANCIA_TIERRA_JUPITER = 628; // en millones de km
    private static final int DISTANCIA_TIERRA_ALPHA_CENTAURI = 4; // en años luz

    private static final double CONSUMO_OXIGENO_POR_KM = 0.01; // litros por millón de km
    private static final double CONSUMO_COMBUSTIBLE_POR_KM = 0.05; // litros por millón de km

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Bienvenido al Simulador de Viaje Intergaláctico");
        System.out.println("Por favor, elige tu destino:");
        System.out.println("1. Marte");
        System.out.println("2. Júpiter");
        System.out.println("3. Alpha Centauri");

        int opcion = scanner.nextInt();

        int distancia = 0;
        String destino = "";

        switch (opcion) {
            case 1:
                distancia = DISTANCIA_TIERRA_MARTE;
                destino = "Marte";
                break;
            case 2:
                distancia = DISTANCIA_TIERRA_JUPITER;
                destino = "Júpiter";
                break;
            case 3:
                distancia = DISTANCIA_TIERRA_ALPHA_CENTAURI;
                destino = "Alpha Centauri";
                break;
            default:
                System.out.println("Opción no válida. Saliendo del programa.");
                return;
        }

        double oxigenoGastado = distancia * CONSUMO_OXIGENO_POR_KM;
        double combustibleGastado = distancia * CONSUMO_COMBUSTIBLE_POR_KM;

        System.out.println("\nResumen del viaje:");
        System.out.println("Destino: " + destino);
        System.out.println("Distancia: " + distancia + " millones de km");
        System.out.println("Oxígeno gastado: " + oxigenoGastado + " litros");
        System.out.println("Combustible gastado: " + combustibleGastado + " litros");

        System.out.println("\n¡Gracias por usar el Simulador de Viaje Intergaláctico!");
    }
}

