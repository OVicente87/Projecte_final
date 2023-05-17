// Funció resta per a restar números complexos


// "Complejo" es refereix a un objecte que conté dos variables, "parteReal" i "parteImaginaria" que sería per exemple, 3  3i
// I les funcions "get" son bàsicament getters del complexe que li passem com a parametre de la funcio resta, és a dir "complejo resta"
public Complejo resta(Complejo resta) {
        // Creem la variable real per a guardar el resultat dels reals, i fa el procediment de la resta NOMÉS DELS REALS
        int real = parteReal - resta.getParteReal();
        // Creem la variable imaginario per a guardar el resultat dels imaginaris, i fa el procediment de la resta NOMÉS DELS IMAGINARIS
        int imaginario = parteImaginaria - resta.getParteImaginaria();
        // Retornem el nou Complex que té com a valors el resultat de la resta dels dos complexos que li hem passat
        return new Complejo(real, imaginario);
    }

// Exemple de execució per a veure-ho mes clar:

Complejo numero1 = new Complejo(5, 3);  // Creem numero1 amb valor real 5 e imaginari 3 --> (5 + 3i)
Complejo numero2 = new Complejo(2, 1);  // Creem numero2 amb valor real 2 e imaginari 1 --> (2 + 1i)

Complejo resultado = numero1.resta(numero2);  // Creem el resultat que es igual a numero1 restat pel numero2

System.out.println(resultado);  // I fem un print del objecte resultat que es (3 + 2i)
