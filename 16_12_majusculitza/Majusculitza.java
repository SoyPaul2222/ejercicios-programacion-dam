/*
Desenvolupa un programa anomenat Majusculitza que demani un text i mostri el mateix text amb les inicials de cada paraula en majúscules i la resta en minúscules.

Considera que una paraula és cada segment del text que només conté lletres, i que a l'inici i final del segment tenen quelcom que no sigui una lletra, o bé són la primera o darrera paraula del text.
*/

public class Majusculitza {
    public static void main (String [] args) {
    
        System.out.println("Text?");
        String text = Entrada.readLine();
        String resposta = majusculitza(text);
        
        System.out.println(resposta);
    
    }
    
    public static String majusculitza(String text) {
         String resposta = "";
      
         for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);        
            if (Character.isLetter(c) && (i == 0 || !Character.isLetter(text.charAt(i - 1)))) {         
                resposta += Character.toUpperCase(c);                
            } else {
               resposta += Character.toLowerCase(c);
            }
            
           
            
         }
         
         return resposta;
    }
}
