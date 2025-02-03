import java.util.Scanner;

public class ViajeEspacial03 {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in); 

        // Solicitar nombre, edad y peso 

        String nombre = solicitarDato(scanner, "nombre"); 

        int edad = solicitarEdad(scanner); 

        double peso = solicitarPeso(scanner); 


        // Interactuar con el usuario usando su nombre 

        System.out.println("¡Hola, " + nombre + "! Bienvenido al sistema de reservas de viajes."); 

 
        // Menú de opciones 

        int opcion; 

        do { 

            mostrarMenu(); 

            opcion = solicitarOpcion(scanner); 

 

            switch (opcion) { 

                case 1: 

                    mostrarDestino("Madrid", 600); 

                    break; 

                case 2: 

                    mostrarDestino("Barcelona", 500); 

                    break; 

                case 3: 

                    mostrarDestino("Valencia", 300); 

                    break; 

                case 4: 

                    mostrarDestino("Sevilla", 200); 

                    break; 

                case 5: 

                    if (confirmarSalida(scanner)) { 

                        System.out.println("¡Gracias por usar nuestro sistema, " + nombre + "! ¡Hasta pronto!"); 

                        return; 

                    } 

                    break; 

                default: 

                    System.out.println("Opción no válida. Por favor, selecciona una opción correcta."); 

            } 

        } while (opcion != 5); 

 

        scanner.close(); 

    } 

 

    // Método para solicitar un dato genérico 

    public static String solicitarDato(Scanner scanner, String dato) { 

        System.out.print("Por favor, ingresa tu " + dato + ": "); 

        return scanner.nextLine(); 

    } 

 

    // Método para solicitar la edad 

    public static int solicitarEdad(Scanner scanner) { 

        int edad = 0; 

        boolean valido = false; 

        while (!valido) { 

            try { 

                System.out.print("Por favor, ingresa tu edad: "); 

                edad = Integer.parseInt(scanner.nextLine()); 

                if (edad > 0) { 

                    valido = true; 

                } else { 

                    System.out.println("La edad debe ser un número positivo."); 

                } 

            } catch (NumberFormatException e) { 

                System.out.println("Entrada no válida. Por favor, ingresa un número entero."); 

            } 

        } 

        return edad; 

    } 

 

    // Método para solicitar el peso 

    public static double solicitarPeso(Scanner scanner) { 

        double peso = 0; 

        boolean valido = false; 

        while (!valido) { 

            try { 

                System.out.print("Por favor, ingresa tu peso en kg: "); 

                peso = Double.parseDouble(scanner.nextLine()); 

                if (peso > 0) { 

                    valido = true; 

                } else { 

                    System.out.println("El peso debe ser un número positivo."); 

                } 

            } catch (NumberFormatException e) { 

                System.out.println("Entrada no válida. Por favor, ingresa un número."); 

            } 

        } 

        return peso; 

    } 

 

    // Método para mostrar el menú de opciones 

    public static void mostrarMenu() { 

        System.out.println("\nSelecciona una opción de viaje:"); 

        System.out.println("1. Viajar a Madrid (600 km)"); 

        System.out.println("2. Viajar a Barcelona (500 km)"); 

        System.out.println("3. Viajar a Valencia (300 km)"); 

        System.out.println("4. Viajar a Sevilla (200 km)"); 

        System.out.println("5. Salir"); 

    } 

 

    // Método para solicitar una opción del menú 

    public static int solicitarOpcion(Scanner scanner) { 

        int opcion = 0; 

        boolean valido = false; 

        while (!valido) { 

            try { 

                System.out.print("Ingresa el número de la opción: "); 

                opcion = Integer.parseInt(scanner.nextLine()); 

                if (opcion >= 1 && opcion <= 5) { 

                    valido = true; 

                } else { 

                    System.out.println("Opción no válida. Por favor, selecciona una opción entre 1 y 5."); 

                } 

            } catch (NumberFormatException e) { 

                System.out.println("Entrada no válida. Por favor, ingresa un número entero."); 

            } 

        } 

        return opcion; 

    } 

 

    // Método para mostrar el destino seleccionado y la distancia 

    public static void mostrarDestino(String ciudad, int distancia) { 

        System.out.println("Has seleccionado viajar a " + ciudad + "."); 

        System.out.println("La distancia del viaje es de " + distancia + " km."); 

    } 

 

    // Método para confirmar la salida del programa 

    public static boolean confirmarSalida(Scanner scanner) { 

        System.out.print("¿Estás seguro de que deseas salir? (s/n): "); 

        String respuesta = scanner.nextLine().toLowerCase(); 

        return respuesta.equals("s"); 

    } 

} 

 

 

/*Explicación del código: 

 

1. **Solicitud de datos**: Se solicitan el nombre, la edad y el peso del usuario. Se utilizan métodos para asegurar que los datos ingresados sean válidos. 

2. **Menú de opciones**: Se muestra un menú con varias opciones de viaje y una opción para salir del programa. 

3. **Manejo de opciones**: Se utiliza un `switch` para manejar las opciones seleccionadas por el usuario. Si el usuario selecciona una opción de viaje, se muestra el destino y la distancia. Si selecciona la opción de salir, se le pide confirmación antes de cerrar el programa. 

4. **Validación de entradas**: Se utilizan bucles `while` y bloques `try-catch` para manejar entradas incorrectas y permitir que el usuario ingrese datos válidos sin que el programa se cierre. 

5. **Métodos auxiliares**: Se utilizan métodos para modularizar el código y hacerlo más legible y mantenible.*/         
    

