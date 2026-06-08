/*
Desenvolupa una nova versió de l'exercici que filtrava les lletres d'un text.

La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/

public class NomesLletres {
    public static void main (String [] args) {
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        filtraLletres(text);
        
    }
    
    public static void filtraLletres(String text) {
    
        boolean primeraLletra = true;       
    
        for (int posicio = 0; posicio <= text.length() - 1;  posicio += 1) {
            
            char caracter = text.charAt(posicio);
            
            if (Character.isLetter(caracter)) {
                if (!primeraLletra) {
                    System.out.print(", ");
                }
                System.out.print(caracter);
                primeraLletra = false;
            }
          }
        
      System.out.println();
    
    }

}
