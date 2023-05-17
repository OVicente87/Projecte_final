import java.util.*;

/**
 * Representa un menú con diferentes operaciones para el código complejo.java
 *
 * @author GRUPO1
 * @version 1.0.0
 */
public class Main {
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Muestra todas las opciones disponibles del menú
     *
     * @return La opción seleccionada
     */
    public static int menu() {
        int opcion;
        System.out.println();
        System.out.println("Calculadora de números complejos");
        System.out.println();
        System.out.println("1) SUMAR");
        System.out.println("2) RESTAR");
        System.out.println("3) MULTIPLICAR");
        System.out.println("4) DIVIDIR");
        System.out.println("5) SALIR");
        System.out.println();
        System.out.print("OPCIÓN: ");
        opcion = obtenerEntero();
        return opcion;
    }

    /**
     * Método para obtener un entero válido desde la entrada del usuario
     *
     * @return El entero válido ingresado por el usuario
     */
    public static int obtenerEntero() {
        int entero;
        try {
            entero = Integer.parseInt(teclado.nextLine());
        } catch (NumberFormatException e) {
            throw new IllegalArgumentException("Entrada inválida. Debes ingresar un número entero entre 1 y 5.");
        }
        return entero;
    }

    /**
     * Método para obtener un número complejo válido desde la entrada del usuario
     *
     * @return El número complejo válido ingresado por el usuario
     */
    public static Complejo obtenerComplejo() {
        int real, imag;
        try {
            System.out.print("Escribe el real: ");
            real = obtenerEntero();
            System.out.print("Escribe el imaginario: ");
            imag = obtenerEntero();
        } catch (IllegalArgumentException e) {
            throw new IllegalArgumentException("Entrada inválida para el número complejo. Debes ingresar un número entero.");
        }
        return new Complejo(real, imag);
    }

    /**
     * Método principal que ejecuta el programa y muestra el menú interactivo.
     *
     * @param args Argumentos de la línea de comandos
     */
    public static void main(String args[]) {
        Complejo complejo1, complejo2, resultado;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    try {
                        System.out.println("Primer número complejo:");
                        complejo1 = obtenerComplejo();

                        System.out.println("Segundo número complejo:");
                        complejo2 = obtenerComplejo();

                        resultado = complejo1.suma(complejo2);
                        System.out.println("El resultado es: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 2:
                    try {
                        System.out.println("Primer número complejo:");
                        complejo1 = obtenerComplejo();

                        System.out.println("Segundo número complejo:");
                        complejo2 = obtenerComplejo();

                        resultado = complejo1.resta(complejo2);
                        System.out.println("El resultado es: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 3:
                    try {
                        System.out.println("Primer número complejo:");
                        complejo1 = obtenerComplejo();

                        System.out.println("Segundo número complejo:");
                        complejo2 = obtenerComplejo();

                        resultado = complejo1.multiplicacion(complejo2);
                        System.out.println("El resultado es: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 4:
                    try {
                        System.out.println("Primer número complejo:");
                        complejo1 = obtenerComplejo();

                        System.out.println("Segundo número complejo:");
                        complejo2 = obtenerComplejo();

                        resultado = complejo1.division(complejo2);
                        System.out.println("El resultado es: " + resultado);
                    } catch (IllegalArgumentException e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;

                case 5:
                    System.out.println("Adiós");
                    break;
                default:
                    break;
            }
        } while (opcion != 5);
    }
}
