// Funció per a multiplicar números complexos

// "Complejo" es refereix a un objecte que conté dos variables, "parteReal" i "parteImaginaria" que sería per exemple, 3  3i
// I les funcions "get" son bàsicament getters del complexe que li passem com a parametre de la funcio multiplicador, és a dir "complejo multiplicador"

public Complejo multiplicacion(Complejo multiplicador) {
        // Creem la variable real per a guardar el resultat dels reals, i fa el procediment de la multiplicació NOMÉS DELS REALS
        int real = parteReal * multiplicador.getParteReal() - parteImaginaria * multiplicador.getParteImaginaria();
        // Creem la variable imaginario per a guardar el resultat dels imaginaris, i fa el procediment de la multiplicació NOMÉS DELS IMAGINARIS
        int imaginario = parteReal * multiplicador.getParteImaginaria() + parteImaginaria * multiplicador.getParteReal();
        // Retornem el nou Complex que té com a valors el resultat de la multiplicació dels dos complexos que li hem passat
        return new Complejo(real, imaginario);
    }

// Exemple de execució per a veure-ho mes clar:

Complejo numero1 = new Complejo(2, 3); // Creem numero1 amb valor real 2 e imaginari 3
Complejo numero2 = new Complejo(4, 5); // Creem numero2 amb valor real 4 e imaginari 5

Complejo resultado = numero1.multiplicacion(numero2); // Creem el resultat que es igual a numero1 multiplicat pel numero2

System.out.println(resultado); // I fem un print del objecte resultat que es -7 +22i
