/*
Desenvolupa un programa, anomenat Enters que vagi demanant texts fins rebre la cadena buida.

Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.

Aquest exercici considerarà estrictament els nombres enters formats per dígits, amb la única excepció que el primer caràcter pot ser + o -.

Desenvolupa un programa, anomenat Enters que vagi demanant texts fins rebre la cadena buida.

Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.

Aquest exercici considerarà estrictament els nombres enters formats per dígits, amb la única excepció que el primer caràcter pot ser + o -.
*/

public class UtilString {
     
   public static boolean esEnter(String text) {
    
     if (text.length() == 0) {
        return false;
    }
    
    int inici = 0;
    
    
        if (text.charAt(0) == '+' || text.charAt(0) == '-') {
            inici = 1;
            
            if (text.length() == 1) {
                return false;
            }
        }
        
        
        for (int i = inici; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (!Character.isDigit(c)) {
                return false;
            }
 
        }
        
        return true;
    }
    
}
