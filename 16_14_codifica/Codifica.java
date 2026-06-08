/*
Desenvolupa una nova versió de l'exercici que codificava un text.

Aquesta nova versió també demanarà un text per entrada estàndard, però esperarà un índex per línia de comandes i, en cas que no correspongui a un enter o bé aquest sigui negatiu, generarà un error i finalitzarà.

Pot suposar que Codifica sempre rebrà l'índex.

La nova versió també requerirà reemplaçar l'antic procediment mostraCodificat() per una funció anomenada codifica() que rebrà el text a codificar i un índex, i retornarà el text codificat a partir de l'índex especificat.

La signatura serà: String codifica(String text, int index).

La capacitat de codificació de codifica() supera mostraCodificat() en més d'un aspecte. Per començar, també funciona amb majúscules i números.
*/

public class Codifica {
    public static void main (String [] args) {
         
        int index = Integer.parseInt(args[0]);
        
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        text = codifica(text, index);
        System.out.println(text);
    }
    
    public static String codifica(String text, int index) {
    
        String resposta = "";
        
        if (index < 0) {
            index = 0;
        }
        
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
           if (!Character.isWhitespace(c)) {
                if (Character.isLowerCase(c)) {
                   if (c >= 'a' && c <= 'z') {
                       
                     (char)(c += index);
                       
                       if (c > 'z') {
                          c = (char) (c - 26);
                       }
                    }
                }
                
                if (Character.isUpperCase(c)) {
                   if (c >= 'A' && c <= 'Z') {
                       c += index;
                    }
                }
                
                if (Character.isDigit(c)) {
                   if (c >= '0' && c <= '9') {
                       c += index;
                    }
                }
                
            }
            resposta += c;
         
        }
        
        return resposta;
    }
}
