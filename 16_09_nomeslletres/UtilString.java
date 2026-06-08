/*
Obtenció del text d'entrada

Filtrat de les lletres del text

Separació de les lletres filtradesObtenció del text d'entrada   Obtenció del text d'entrada

Filtrat de les lletres del text
 
Separació de les lletres filtrades

Filtrat de les lletres del text

Separació de les lletres filtradesObtenció del text d'entrada

Filtrat de les lletres del text

Separació de les lletres filtradesObtenció del text d'entrada

Filtrat de les lletres del text

Se
*/

public class UtilString {
    public static String nomesLletres (String text) {
    
        String filtrat = "";
    
         for (int posicio = 0; posicio <= text.length() - 1;  posicio += 1) {
            
            char caracter = text.charAt(posicio);
            
            if (Character.isLetter(caracter)) {
                filtrat += caracter;
            }
            
            
          }
          
         return filtrat; 
    }
    
    public static String lletresSeparades (String filtrat) {
        
        boolean primeraLletra = true;
        String separar = "";       
        
        for (int i = 0; i < filtrat.length(); i++) {
        
             if (!primeraLletra) {
                 separar += ", ";
             }
             separar += filtrat.charAt(i);
             primeraLletra = false;
            
        } 
       
                
          return separar;      
    }
}
