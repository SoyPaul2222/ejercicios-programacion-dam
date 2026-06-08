/*
Per passar totes les proves, caldrà que implementis a la biblioteca UtilString els mòduls:

String inverteix(String): Retorna el text del revés

String cometeja(String): Separa cada caràcter que no sigui un espai en blanc amb una coma i un espai.
*/

public class UtilString {
    public static String inverteix(String text) {
        
       String resposta = ""; 
        for (int i = text.length() - 1; i >= 0; i--) {
            char c = text.charAt(i);
            resposta  += c;
        }
        
        return resposta;
    }
    
    public static String cometeja (String text) {
        
       String resposta = "";
       boolean primeraLletra = true;
       
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (!Character.isWhitespace(c)) {
                  
                  if (!primeraLletra) {
                    resposta +=", ";
                  } 
                    resposta += c;
                    primeraLletra = false;
             
            }
        }
        
        return resposta;
    }
}
