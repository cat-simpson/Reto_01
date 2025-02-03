
    
    import java.util.Scanner;

    public class PruebaVarios {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int opcion;
        boolean continuar = true;

        while (continuar) {
            System.out.println("Bienvenido al Simulador de Viaje Intergaláctico");
            System.out.println("1. Viajar a Alpha Centauri");
            System.out.println("2. Viajar a la Nebulosa de Orión");
            System.out.println("3. Viajar a la Galaxia de Andrómeda");
            System.out.println("4. Salir");
            System.out.print("Elige una opción: ");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    realizarViaje("Alpha Centauri", 4.37);
                    break;
                case 2:
                    realizarViaje("Nebulosa de Orión", 1344);
                    break;
                case 3:
                    realizarViaje("Galaxia de Andrómeda", 2537000);
                    break;
                case 4:
                    continuar = false;
                    System.out.println("Gracias por usar el Simulador de Viaje Intergaláctico. ¡Hasta pronto!");
                    break;
                default:
                    System.out.println("Opción no válida. Inténtalo de nuevo.");
                    break;
            }
        }

        scanner.close();
    }

     public static void realizarViaje(String destino, double distanciaAniosLuz) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Has elegido viajar a " + destino + ".");
        System.out.println("La distancia es de " + distanciaAniosLuz + " años luz.");

        // Convertir años luz a kilómetros (1 año luz ≈ 9.461e+12 km)
        double distanciaKm = distanciaAniosLuz * 9.461e+12;
        System.out.println("La distancia en kilómetros es: " + distanciaKm + " km");

        // Calcular el oxígeno y combustible gastado
        double oxigenoGastado = distanciaKm * 0.01; // 0.01 litros de oxígeno por km
        double combustibleGastado = distanciaKm * 0.05; // 0.05 litros de combustible por km

        System.out.println("Oxígeno gastado: " + oxigenoGastado + " litros");
        System.out.println("Combustible gastado: " + combustibleGastado + " litros");

        System.out.print("¿Deseas realizar otro viaje? (s/n): ");
        String respuesta = scanner.next();

        if (!respuesta.equalsIgnoreCase("s")) {
            System.out.println("Gracias por usar el Simulador de Viaje Intergaláctico. ¡Hasta pronto!");
            System.exit(0);
        }
    }
}

