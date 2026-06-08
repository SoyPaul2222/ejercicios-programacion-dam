/*
Això és un utilStringAixò és un utilStringAixò és un utilString
Això és un utilStringAixò és un utilString
Això és un utilString

Això és un utilStringAixò és un utilString

UtilStringUtilStringUtilStringUtilString
UtilString
UtilString
UtilStringUtilStringUtilStringUtilStringUtilStringUtilStringUtilString

*/

public class UtilString {
    
   public static boolean esVocal(char c) {
        
        String vocals = "aàeèéiíïoòóuúü";
        
        if (Character.isUpperCase(c)) {
            return false;
        }
         
        for (int i = 0; i < vocals.length(); i++) {
            char v = vocals.charAt(i);
             
             if (v == c) {
                return true;
             } 
        }
    
        return false;
    }
    
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
    
    
   public static char normalitzaChar(char c) {
         
         String vocalsCatalanes = "àèéíïòóúüçÀÈÉÍÏÒÓÚÜÇ";
            String normalitzats = "aeeiioouucAEEIIOOUUC";
         
         for (int i = 0 ; i < vocalsCatalanes.length(); i++) {
             if (c == vocalsCatalanes.charAt(i)) {
                return normalitzats.charAt(i);
             } 
         }
         
        return c;
    }
    
    public static String normalitzaText(String text) {

        String resultat = "";

        for (int i = 0; i < text.length(); i++) {
            resultat += normalitzaChar(text.charAt(i));
        }

        return resultat;
    }
    
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
    
    // retorna un String format per les cadenes de text separades pel separador amb darrer separador
   
   /*
    public static String junta(String[] cadenes, String separador, String darrerSeparador) {
         
    }
    // equivalent a junta(cadenes, separador, separador)
    public static String junta(String[] cadenes, String separador) {
     
    }
    */
 
    
    
}
