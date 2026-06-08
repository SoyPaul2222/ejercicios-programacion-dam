/*
Desenvolupa un programa, anomenat Enters que vagi demanant texts fins rebre la cadena buida.

Per cada text no buit que rebi, indicarà si correspon o no a un nombre enter escrit amb dígits.

Aquest exercici considerarà estrictament els nombres enters formats per dígits, amb la única excepció que el primer caràcter pot ser + o -.
*/

public class Enters {
    public static void main (String [] args) {
      
        
        System.out.println("Introdueix els texts a analitzar:");
        String text = Entrada.readLine();
        
        while (!text.isEmpty()) {
           boolean esEnter = true;
              
              int inici = 0;
              if (text.charAt(0) == '+' || text.charAt(0) == '-') {
                    inici = 1;
                     if (text.length() == 1) {
                     esEnter = false; 
                     }
               }
               
        
            for (int i = inici; i < text.length(); i++) {
                if (!Character.isDigit(text.charAt(i))) {
                    esEnter = false;
                }
            }
            
             if (esEnter) {                   
                    System.out.println( "\"" + text +  "\"" + " és enter");
                } else {
                    System.out.println( "\"" + text + "\"" + " no és enter");
              }
                
        
               text = Entrada.readLine();
            
           
        }
        
        System.out.println("Adéu");
    }
}
