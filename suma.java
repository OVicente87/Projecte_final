// Mètode suma que pertany a la classe Complejo.
// Aquest mètode rep un objecte de la mateixa classe anomenat sumando i retorna un nou objecte Complejo que representa la suma d'ambdos nombres complexos.

public Complejo suma(Complejo sumando) {
    // Suma les parts reals d'ambdós nombres complexos
    int real = parteReal + sumando.getParteReal();
    
    // Suma les parts imaginàries d'ambdós nombres complexos
    int imaginario = parteImaginaria + sumando.getParteImaginaria();
    
    // Retorna un nou objecte Complejo amb les parts real i imaginària sumades
    return new Complejo(real, imaginario);
}


// EXEMPLE DE EXECUCIÓ

// Cream dos objectes Complejo amb valors inicials
Complejo complejo1 = new Complejo(3, 4); // Representa el número complex 3 + 4i
Complejo complejo2 = new Complejo(1, 2); // Representa el número complex 1 + 2i

// Truquem al mètode suma en l'objecte complejo1, passant complejo2 com a argument
Complejo resultado = complejo1.suma(complejo2);

// Imprimim el resultat de la suma
System.out.println("El resultado de la suma es: " + resultado);

// El objecte resultat té el valor del nombre complex 4 + 6i, que és la suma de complejo1 i complejo2

