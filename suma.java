// Método suma que pertenece a la clase Complejo. 
// Recibe un objeto de la misma clase llamado sumando y devuelve un nuevo objeto Complejo que representa la suma de ambos números complejos.

public Complejo suma(Complejo sumando) {
    // Suma las partes reales de ambos números complejos
    int real = parteReal + sumando.getParteReal();
    
    // Suma las partes imaginarias de ambos números complejos
    int imaginario = parteImaginaria + sumando.getParteImaginaria();
    
    // Retorna un nuevo objeto Complejo con las partes real e imaginaria sumadas
    return new Complejo(real, imaginario);
}


// EJEMPLO DE EJECUCIÓN

// Creamos dos objetos Complejo con valores iniciales
Complejo complejo1 = new Complejo(3, 4); // Representa el número complejo 3 + 4i
Complejo complejo2 = new Complejo(1, 2); // Representa el número complejo 1 + 2i

// Llamamos al método suma en el objeto complejo1, pasando complejo2 como argumento
Complejo resultado = complejo1.suma(complejo2);

// Imprimimos el resultado de la suma
System.out.println("El resultado de la suma es: " + resultado);

// El objeto resultado tiene el valor del número complejo 4 + 6i, que es la suma de complejo1 y complejo2
