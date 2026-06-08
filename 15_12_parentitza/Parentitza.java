/*
Desenvolupa una nova versió de l'exercici que posava parèntesis a les lletres.

La nova versió tindrà la mateixa sortida que l'original però el codi del programa serà més modular. En concret, el mòdul main() se n'encarregarà d'obtenir les dades d'entrada, i cridarà un nou mòdul que serà qui realitzi realment la feina.
*/

public class Parentitza {
    public static void main (String [] args) {
        
        System.out.println("Text?");
        String frase = Entrada.readLine();
        
        parentitza(frase);
        
    }
    
    public static void parentitza(String text) {
        
        for (int posicio = 0; posicio <= text.length() - 1;  posicio += 1) {        
        
            comprovaCaracter(text, posicio);
        }
        
        System.out.println();
    }
    
   public static void comprovaCaracter(String text, int posicio) {
         char caracter = text.charAt(posicio);
         
            if (Character.isLetter(caracter)) {
            System.out.print( "(" + text.charAt(posicio) + ")");
            } else {
                System.out.print(caracter);
            }
   } 
}
