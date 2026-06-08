/*
En aquesta ocasió desenvoluparem un programa anomenat TriangleParaules, que ens permetrà construir un triangle, no de caràcters sinó de paraules!

Considerarem que les paraules són cadenes de caràcters separades per espais en blanc.
*/

public class TriangleParaules {
    public static void main (String [] args) {
        System.out.println("Text?");
        String text = Entrada.readLine();       
        mostraTriangle(text);
    }
    
    public static void mostraTriangle(String text) {
     int comptadorEspais = 1;
        for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
             comptadorEspais++;  
             }
        }
        
        generarParaules(text, comptadorEspais);
        
      }
        

     public static void generarParaules(String text, int comptadorEspais) {   
        for (int j = 1; j <= comptadorEspais; j++) {
            int paraules = 0;
        
           for (int i = 0; i < text.length(); i++) {
              char c = text.charAt(i);
            
                 if (Character.isWhitespace(c)) {
                    paraules++;
                  }
            
              
               if (paraules == j) {
                 break;
               }
            
            System.out.print(c);
           }
        System.out.println();
       }
    
    }
    
   
}
