/**
 * Representa un programa que realiza operaciones con números complejos.
 *
 * Este programa define una clase llamada Complejo que representa un número complejo, compuesto por una parte real y una parte imaginaria.
 * Proporciona métodos para establecer y obtener las partes real e imaginaria, así como para realizar operaciones como la suma, la resta, la multiplicación y la división.
 *
 * @author Albert Garcia
 * @version 1.0.0
 */
public class Complejo {
    private int parteReal; // Almacena la parte real del número complejo
    private int parteImaginaria; // Almacena la parte imaginaria del número complejo
    
    /**
     * Crea un objeto Complejo con valores predeterminados de cero para la parte real e imaginaria.
     * Esto representa el número complejo 0 + 0i.
     */
    public Complejo() {
        parteReal = 0; // Inicializa la parte real en 0
        parteImaginaria = 0; // Inicializa la parte imaginaria en 0
    }
    
    /**
     * Crea un objeto Complejo con las partes real e imaginaria especificadas.
     *
     * @param real        La parte real del número complejo.
     * @param imaginario  La parte imaginaria del número complejo.
     */
    public Complejo(int real, int imaginario) {
        parteReal = real; // Inicializa la parte real con el valor proporcionado
        parteImaginaria = imaginario; // Inicializa la parte imaginaria con el valor proporcionado
    }
    
    /**
     * Establece el valor de la parte real del número complejo.
     *
     * @param numeroReal  El valor a establecer como parte real.
     */
    public void setParteReal(int numeroReal) {
        parteReal = numeroReal; // Establece el valor de la parte real con el número proporcionado
    }
    
    /**
     * Establece el valor de la parte imaginaria del número complejo.
     *
     * @param numeroImaginario  El valor a establecer como parte imaginaria.
     * @throws IllegalArgumentException si el valor especificado es negativo.
     */
    public void setParteImaginaria(int numeroImaginario) {
        if (numeroImaginario < 0) {
            throw new IllegalArgumentException("La parte imaginaria no puede ser negativa."); 
            // Lanza una excepción si se proporciona un valor negativo para la parte imaginaria
        }
        parteImaginaria = numeroImaginario; // Establece el valor de la parte imaginaria con el número proporcionado
    }
    
    /**
     * Obtiene el valor de la parte real del número complejo.
     *
     * @return El valor de la parte real.
     */
    public int getParteReal() {
        return parteReal; // Devuelve el valor de la parte real
    }
    
    /**
     * Obtiene el valor de la parte imaginaria del número complejo.
     *
     * @return El valor de la parte imaginaria.
     */
    public int getParteImaginaria() {
        return parteImaginaria; // Devuelve el valor de la parte imaginaria
    }
    
    /**
     * Suma el número complejo especificado al número complejo actual.
     *
     * @param sumando  El número complejo que se sumará.
     * @return Un nuevo objeto Complejo que representa la suma de los dos números complejos.
     */
    public Complejo suma(Complejo sumando) {
        int real = parteReal + sumando.getParteReal(); // Suma las partes reales
        int imaginario = parteImaginaria + sumando.getParteImaginaria(); // Suma las partes imaginarias
        return new Complejo(real, imaginario); // Crea un nuevo objeto Complejo con el resultado y lo devuelve
    }
    
    /**
     * Resta el número complejo especificado al número complejo actual.
     *
     * @param resta  El número complejo que se restará.
     * @return Un nuevo objeto Complejo que representa la resta de los dos números complejos.
     */
    public Complejo resta(Complejo resta) {
        int real = parteReal - resta.getParteReal(); // Resta las partes reales
        int imaginario = parteImaginaria - resta.getParteImaginaria(); // Resta las partes imaginarias
        return new Complejo(real, imaginario); // Crea un nuevo objeto Complejo con el resultado y lo devuelve
    }
    
    /**
     * Realiza la multiplicación de dos números complejos.
     *
     * @param multiplicador  El número complejo que se multiplicará.
     * @return Un nuevo objeto Complejo que representa la multiplicación de los dos números complejos.
     */
    public Complejo multiplicacion(Complejo multiplicador) {
        int real = parteReal * multiplicador.getParteReal() - parteImaginaria * multiplicador.getParteImaginaria();
        // Realiza la multiplicación de las partes reales e imaginarias
        int imaginario = parteReal * multiplicador.getParteImaginaria() + parteImaginaria * multiplicador.getParteReal();
        // Realiza la multiplicación cruzada de las partes reales e imaginarias
        return new Complejo(real, imaginario); // Crea un nuevo objeto Complejo con el resultado y lo devuelve
    }
    
    /**
     * Realiza la división de dos números complejos.
     *
     * @param divisor  El número complejo que se utilizará como divisor.
     * @return Un nuevo objeto Complejo que representa la división de los dos números complejos.
     * @throws ArithmeticException si se intenta dividir por cero (divisor es 0+0i).
     */
    public Complejo division(Complejo divisor) {
        if (divisor.getParteReal() == 0 && divisor.getParteImaginaria() == 0) {
            throw new ArithmeticException("No se puede dividir por cero."); 
            // Lanza una excepción si se intenta dividir por cero (divisor es 0+0i)
        }
        int divisorReal = divisor.getParteReal(); // Almacena la parte real del divisor
        int divisorImaginario = divisor.getParteImaginaria(); // Almacena la parte imaginaria del divisor
        int real = (parteReal * divisorReal + parteImaginaria * divisorImaginario) /
                (divisorReal * divisorReal + divisorImaginario * divisorImaginario);
        // Realiza la división de las partes reales aplicando la fórmula (a*c + b*d) / (c*c + d*d)
        int imaginario = (parteReal * divisorImaginario - parteImaginaria * divisorReal) /
                (divisorReal * divisorReal + divisorImaginario * divisorImaginario);
        // Realiza la división de las partes imaginarias aplicando la fórmula (b*c - a*d) / (c*c + d*d)
        return new Complejo(real, imaginario); // Crea un nuevo objeto Complejo con el resultado y lo devuelve
    }
    
    /**
     * Devuelve una representación en forma de cadena del número complejo.
     *
     * @return Una cadena que representa el número complejo.
     */
    public String toString() {
        if (parteImaginaria == 0) {
            return parteReal + ""; // Devuelve solo la parte real si la parte imaginaria es cero
        } else if (parteReal == 0) {
            return parteImaginaria + "i"; // Devuelve solo la parte imaginaria si la parte real es cero
        } else if (parteImaginaria < 0) {
            return parteReal + " - " + (-parteImaginaria) + "i"; // Devuelve la representación si la parte imaginaria es negativa
        } else {
            return parteReal + " + " + parteImaginaria + "i"; // Devuelve la representación estándar del número complejo
        }
    }
}
