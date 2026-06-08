/*
Desenvolupa un programa anomenat ComptaVocals que demani un text i compti quantes vocals conté.

El programa comptarà les vocals que considerava un exercici anterior

Considera la següent simulació:

Text?
En Pinxo li va dir a en Panxo "vols que et punxi amb un punxó?"
20
Per què el teu programa passi totes les proves, ComptaVocals definirà el mòdul int numVocalsMinuscules(String) que donat un text, retornarà el nombre de vocals minúscules que conté el text.
*/

public class ComptaVocals {
    public static void main (String [] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();
        String minuscula = text.toLowerCase();
        int resposta = numVocalsMinuscules(minuscula);
        System.out.println(resposta);
        
        
    } 
    
    public static int numVocalsMinuscules(String text) {
    
        int comptador = 0;

        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
                    if (UtilString.esVocal(c)) {
                        comptador++;
                    }
            
        }
        
       return comptador;
    }
}
