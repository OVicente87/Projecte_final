// Esta función verifica si el dividendo o el divisor son iguales 0 
// Luego realiza la división si ninguno de los dos es igual a 0

public Complejo division(Complejo divisor) {
          // Comprueba si el dividendo o el divisor son iguales a 0 y lanza una ArithmeticEexception en el caso de que se cumpla.
        if (divisor.getParteReal() == 0 && divisor.getParteImaginaria() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
          // Obtiene los valores de l divisor con los geters
          // Asigna la parte real a la variable 'divisorReal'
        int divisorReal = divisor.getParteReal();
          // Asigna a la variable 'divisorImaginario' la parte imaginaria del divisor
        int divisorImaginario = divisor.getParteImaginaria();
         
          // Realiza los cálculos de la división con los valores de los números complejos
        int real = (parteReal * divisorReal + parteImaginaria * divisorImaginario) /
                (divisorReal * divisorReal + divisorImaginario * divisorImaginario);
        int imaginario = (parteReal * divisorImaginario - parteImaginaria * divisorReal) /
                (divisorReal * divisorReal + divisorImaginario * divisorImaginario);
          // Crea un nuevo objeto 'Complejo' con la parte real e imaginaria resultante  y lo retorna
        return new Complejo(real, imaginario);
    }


// EJEMPLO DE EJECUCIÓN:

// Crear un objeto Complejo para el dividendo con parte real 2 y parte imaginaria 3
Complejo dividendo = new Complejo(2, 3);

// Crear un objeto Complejo para el divisor con parte real 1 y parte imaginaria 1
Complejo divisor = new Complejo(1, 1);

// Llamar al método division del objeto dividendo pasando como argumento el objeto divisor
Complejo resultado = dividendo.division(divisor);

// Imprimir el resultado de la división en la consola
System.out.println("Resultado de la división: " + resultado.getParteReal() + " + " + resultado.getParteImaginaria() + "i");
