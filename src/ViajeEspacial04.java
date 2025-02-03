import java.util.Scanner;

public class ViajeEspacial04 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        // Solicitar nombre, edad y peso

        String nombre = solicitarDato(scanner, "nombre");

        int edad = Integer.parseInt(solicitarDato(scanner, "edad"));

        double peso = Double.parseDouble(solicitarDato(scanner, "peso"));

        // Interactuar con el usuario usando su nombre

        System.out.println("¡Hola, " + nombre + "! Bienvenido al sistema de reservas de viajes.");

        // Menú de opciones

        int opcion;

        do {

            mostrarMenu();

            opcion = obtenerOpcion(scanner);

            switch (opcion) {

                case 1:

                    mostrarDestino("Madrid", 600);

                    break;

                case 2:

                    mostrarDestino("Barcelona", 800);

                    break;

                case 3:

                    mostrarDestino("Valencia", 400);

                    break;

                case 4:

                    mostrarDestino("Sevilla", 1000);

                    break;

                case 5:

                    confirmarSalida(scanner);

                    break;

                default:

                    System.out.println("Opción incorrecta. Por favor, elige una opción válida.");

            }

        } while (opcion != 5);

        scanner.close();

    }

    // Método para solicitar datos al usuario

    public static String solicitarDato(Scanner scanner, String dato) {

        System.out.print("Por favor, ingresa tu " + dato + ": ");

        return scanner.nextLine();

    }

    // Método para mostrar el menú de opciones

    public static void mostrarMenu() {

        System.out.println("\nOpciones de viaje:");

        System.out.println("1. Viajar a Madrid (600 km)");

        System.out.println("2. Viajar a Barcelona (800 km)");

        System.out.println("3. Viajar a Valencia (400 km)");

        System.out.println("4. Viajar a Sevilla (1000 km)");

        System.out.println("5. Salir del programa");

    }

    // Método para obtener la opción del usuario

    public static int obtenerOpcion(Scanner scanner) {

        System.out.print("Elige una opción: ");

        while (!scanner.hasNextInt()) {

            System.out.println("Entrada inválida. Por favor, ingresa un número.");

            scanner.next(); // Limpiar el buffer

            System.out.print("Elige una opción: ");

        }

        int opcion = scanner.nextInt();

        scanner.nextLine(); // Limpiar el buffer

        return opcion;

    }

    // Método para mostrar el destino seleccionado y la distancia

    public static void mostrarDestino(String ciudad, int distancia) {

        System.out.println("Has seleccionado viajar a " + ciudad + ".");

        System.out.println("La distancia del viaje es de " + distancia + " km.");

    }

    // Método para confirmar la salida del programa

    public static void confirmarSalida(Scanner scanner) {

        System.out.print("¿Estás seguro de que quieres salir? (s/n): ");

        String confirmacion = scanner.nextLine();

        if (confirmacion.equalsIgnoreCase("s")) {

            System.out.println("¡Gracias por usar nuestro sistema de reservas de viajes! ¡Hasta pronto!");

            System.exit(0);

        } else {

            System.out.println("Continuando con el programa...");

        }

    }

}

/*
 * Explicación del código:
 * 
 * 1. **Solicitud de datos**: El programa solicita al usuario su nombre, edad y
 * peso utilizando
 * el método `solicitarDato`. Este método se encarga de pedir y retornar el dato
 * ingresado por el usuario.
 * 
 * 2. **Menú de opciones**: El método `mostrarMenu` muestra las opciones
 * disponibles para viajar a diferentes
 * ciudades, así como la opción de salir del programa.
 * 
 * 3. **Obtención de la opción**: El método `obtenerOpcion` se encarga de
 * obtener la opción seleccionada por
 * el usuario. Si el usuario ingresa una opción no válida, se le pide que
 * ingrese una opción válida.
 * 
 * 4. **Mostrar destino**: El método `mostrarDestino` muestra el destino
 * seleccionado por el usuario y la distancia
 * en kilómetros.
 * 
 * 5. **Confirmación de salida**: El método `confirmarSalida` pide confirmación
 * al usuario antes de salir del
 * programa. Si el usuario confirma, el programa se cierra con un mensaje de
 * despedida.
 * 
 * 6. **Bucle principal**: El programa entra en un bucle `do-while` que continúa
 * ejecutándose hasta que el
 * usuario elige la opción de salir.
 */
