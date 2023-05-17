// Esta función verifica si el dividendo o el divisor son iguales 0 
// Luego realiza la división si ninguno de los dos es igual a 0

public Complejo division(Complejo divisor) {
          // Comprueba si el dividendo o el divisor son iguales a 0 y lanza una ArithmeticEexception en el caso de que se cumpla.
        if (divisor.getParteReal() == 0 && divisor.getParteImaginaria() == 0) {
            throw new ArithmeticException("No se puede dividir por cero.");
        }
          // Obtiene los valores del divisor con los geters
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
