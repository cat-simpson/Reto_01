//Modelo referencia

import java.util.Scanner;

public class ViajeEspacial02 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int opcion;

        do {
            // Mostrar el menú de opciones
            System.out.println("Seleccione una opción:");
            System.out.println("1. Opción 1");
            System.out.println("2. Opción 2");
            System.out.println("3. Opción 3");
            System.out.print("Ingrese su elección: ");

            // Leer la opción del usuario
            opcion = scanner.nextInt();

            // Verificar si la opción es válida
            if (opcion < 1 || opcion > 3) {
                System.out.println("Opción inválida. Por favor, intente nuevamente.\n");
            } else {
                // Procesar la opción seleccionada
                switch (opcion) {
                    case 1:
                        System.out.println("Ha seleccionado la Opción 1.");
                        break;
                    case 2:
                        System.out.println("Ha seleccionado la Opción 2.");
                        break;
                    case 3:
                        System.out.println("Ha seleccionado la Opción 3.");
                        break;
                }
            }
        } while (opcion < 1 || opcion > 3); // Repetir el bucle si la opción es inválida

        scanner.close();
    }
}

        
    

