import java.util.*;

/**
 * Representa un menú con diferentes operaciones para el código Complejo.java.
 * Permite realizar operaciones básicas con números complejos.
 * Los números complejos se representan mediante la clase Complejo.
 *
 * @author Grupo1
 * @version 1.0.0
 */
public class Main {
    private static Scanner teclado = new Scanner(System.in);

    /**
     * Muestra todas las opciones disponibles del menú.
     *
     * @return La opción seleccionada por el usuario.
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
        opcion = teclado.nextInt();
        return opcion;
    }

    /**
     * Método principal que ejecuta el programa y muestra el menú interactivo.
     *
     * @param args Argumentos de la línea de comandos (no se utilizan).
     */
    public static void main(String args[]) {
        Complejo complejo1, complejo2, resultado;
        int real, imag;
        int opcion;

        do {
            opcion = menu();

            switch (opcion) {
                case 1:
                    System.out.print("Escribe el primer número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el primer número imaginario: ");
                    imag = teclado.nextInt();
                    complejo1 = new Complejo(real, imag);

                    System.out.print("Escribe el segundo número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el segundo número imaginario: ");
                    imag = teclado.nextInt();
                    complejo2 = new Complejo(real, imag);

                    resultado = complejo1.suma(complejo2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 2:
                    System.out.print("Escribe el primer número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el primer número imaginario: ");
                    imag = teclado.nextInt();
                    complejo1 = new Complejo(real, imag);

                    System.out.print("Escribe el segundo número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el segundo número imaginario: ");
                    imag = teclado.nextInt();
                    complejo2 = new Complejo(real, imag);

                    resultado = complejo1.resta(complejo2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 3:
                    System.out.print("Escribe el primer número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el primer número imaginario: ");
                    imag = teclado.nextInt();
                    complejo1 = new Complejo(real, imag);

                    System.out.print("Escribe el segundo número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el segundo número imaginario: ");
                    imag = teclado.nextInt();
                    complejo2 = new Complejo(real, imag);

                    resultado = complejo1.multiplicacion(complejo2);
                    System.out.println("El resultado es: " + resultado);
                    break;

                case 4:
                    System.out.print("Escribe el primer número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el primer número imaginario: ");
                    imag = teclado.nextInt();
                    complejo1 = new Complejo(real, imag);

                    System.out.print("Escribe el segundo número real: ");
                    real = teclado.nextInt();
                    System.out.print("Escribe el segundo número imaginario: ");
                    imag = teclado.nextInt();
                    complejo2 = new Complejo(real, imag);

                    resultado = complejo1.division(complejo2);
                    System.out.println("El resultado es: " + resultado);
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
