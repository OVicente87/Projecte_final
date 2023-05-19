

public class Resta {
	/**
	 * Realitza la resta de dos números complexos
	 * @param c1 Primer complex (x+xi)
	 * @param c2 Segon complex (x+xi)
	 * @return Resultat de la resta dels dos complexos
	 */
	public static String calculResta(String c1, String c2) {
		int c1_1, c1_2, c2_1, c2_2, resultat1, resultat2;
		try {
			c1_1 = Integer.parseInt(c1.substring(0, c1.indexOf("+")));
			c1_2 = Integer.parseInt(c1.substring(c1.indexOf("+") + 1, c1.indexOf("i")));
			c2_1 = Integer.parseInt(c2.substring(0, c2.indexOf("+")));
			c2_2 = Integer.parseInt(c2.substring(c2.indexOf("+") + 1, c2.indexOf("i")));
		} catch (NumberFormatException e) {
			throw new NumberFormatException("Has d'introduir números sencers.");
		}
		resultat1 = c1_1 - c2_1;
		resultat2 = c1_2 - c2_2;
		String resultat1Str = String.valueOf(resultat1);
		String resultat2Str = String.valueOf(resultat2);
		String resultat;
		if (resultat2 < 0) {
			resultat = resultat1Str + resultat2Str + "i";
		} else {
			resultat = resultat1Str + "+" + resultat2Str + "i";
		}
		return resultat;
	}
		
		
		/* public Complejo resta(Complejo resta) {
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
	
	System.out.println("El resultat de la resta és: " + resultado);  // I fem un print del objecte resultat que es (3 + 2i)
		

	} */

}
