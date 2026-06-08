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
        
     
     int comptador = 0 ;  
      for (int i = inici; i < text.length(); i++) {
        if (text.charAt(i) == '0') {
            comptador++;
        } else {
            break;
        }
      }
      
      int iniciDefinitiu = inici + comptador;
      
      if (text.length() - iniciDefinitiu > 9) {
            return false;
      }
           
        for (int i = iniciDefinitiu; i < text.length(); i++) {
            char c = text.charAt(i);
            
            if (!Character.isDigit(c)) {
                return false;
            }
 
        }
        
        return true;
    }
 
    public static String normalitzaBlancs(String text) {
   
        int inici = 0;
        int fi = text.length() - 1;

        while (inici <= fi && Character.isWhitespace(text.charAt(inici))) {
            inici++;
        }
        while (fi >= inici && Character.isWhitespace(text.charAt(fi))) {
            fi--;
        }

        if (inici > fi) {
            return "";
        }
        
        String resultat = "";
        boolean anteriorEraEspai = false;

        for (int i = inici; i <= fi; i++) {
            char c = text.charAt(i);
            if (Character.isWhitespace(c)) {
                if (!anteriorEraEspai) {
                    resultat += ' ';
                    anteriorEraEspai = true;
                }
            } else {
                resultat += c;
                anteriorEraEspai = false;
            }
            
          }

        return resultat;
   }
   
   public static String cadenaContinua(String text, int nombre) {
          
          String cadena = "";  
            if (nombre >= 1) {
                for (int i = 0; i < nombre; i++) {
                    cadena += text.charAt(i % text.length());         
                    
                }
                return cadena;
            }
            
            return "";
   }
   
    public static String intervalString(String text, int inici, int fi) {
       
        int longitudText = text.length();
        int ultimIndex = longitudText - 1;
        
        
        if (inici < 0) {
            inici = 0;
        } else if (inici >= longitudText) {
            inici = ultimIndex;
        }
        
        if (fi < 0) {
            fi = 0;
        } else if (fi >= longitudText) {
            fi = ultimIndex;
        }

        String resultat = "";

        if (inici <= fi) {
        
            for (int i = inici; i <= fi; i++) {
              resultat += text.charAt(i);
            }
        } else {   
           for (int i = inici; i >= fi; i--) {
            resultat += text.charAt(i);
            }
        }

        return resultat;
    
    }
      
   public static int numDigits(String text) {
         int comptador = 0;
      for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
          if (Character.isDigit(c)) {
           comptador++;
          }
      }
    return comptador;
   }

    public static int numVocalsMajuscules(String text) {
       int comptador = 0;
       for (int i = 0; i < text.length(); i++) {
         char c = text.charAt(i);
        
        if (Character.isUpperCase(c)) {
            c = Character.toLowerCase(c);
            if (esVocal(c)) {
            comptador++;
            }
        }
      }
    return comptador;
    } 

    public static int numVocalsMinuscules(String text) {
       int comptador = 0;
       for (int i = 0; i < text.length(); i++) {
          char c = text.charAt(i);
       
          if (esVocal(c)) {
            comptador++;
           }
       }
    return comptador;
     }

    public static int numLletresMajuscules(String text) {
        int comptador = 0;
       for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
           if (Character.isUpperCase(c)) {
            comptador++;
           }
        }
    return comptador;
     }

    public static int numLletresMinuscules(String text) {
       int comptador = 0;
       for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
           if (Character.isLowerCase(c)) {
              comptador++;
           }
       }
        return comptador;
     }

    public static int numLletres(String text) {
        int comptador = 0;
       for (int i = 0; i < text.length(); i++) {
            char c = text.charAt(i);
          if (Character.isLetter(c)) {
             comptador++;
          }
       }
       return comptador;
      }
      
    public static boolean esPrefix(String prefix, String text, boolean esEstricte) {

        if (prefix.length() == 0)  {
          return true;
          }

        if (esEstricte) {
      
            if (prefix.length() > text.length()) { 
            return false;
            
            }
            for (int i = 0; i < prefix.length(); i++) {
                if (prefix.charAt(i) != text.charAt(i)) {
                    return false;
                }
            }
            return true;
        } else {

        String prefixBrut = normalitzaText(prefix);
        String textBrut = normalitzaText(text);
        
        
        String prefixNet = normalitzaBlancs(prefixBrut);
        String textNet = normalitzaBlancs(textBrut);
 
            if (prefixNet.length() > textNet.length()) { 
            return false;
            }

  
            for (int i = 0; i < prefixNet.length(); i++) {
            
            
            String prefixDefinitiu = intervalString(prefixNet, i, i);
            String textDefinitiu = intervalString(textNet, i, i);

            if (!prefixDefinitiu.equalsIgnoreCase(textDefinitiu)) {
                return false;
            }
                
                
            }
            return true;
        }
    }

    public static boolean esPrefix(String prefix, String text) {
        return esPrefix(prefix, text, true);
    }
    
    public static boolean esSufix(String sufix, String text, boolean esEstricte) {
        if (esEstricte) {
            if (sufix.length() > text.length()) {
                return false;
            }

            int iniciAlText = text.length() - sufix.length();

            for (int i = 0; i < sufix.length(); i++) {
                if (sufix.charAt(i) != text.charAt(iniciAlText + i)) {
                    return false;
                }
            }
            return true;

        } else {
        String sufixBrut = normalitzaText(sufix);
        String textBrut = normalitzaText(text);
        

        String sufixNet = normalitzaBlancs(sufixBrut);
        String textNet = normalitzaBlancs(textBrut);

            if (sufixNet.length() > textNet.length()) {
                return false;
            }

            int iniciNet = textNet.length() - sufixNet.length();

            for (int i = 0; i < sufixNet.length(); i++) {
            
            
            String sufixDefinitiu = intervalString(sufixNet, i, i);
            String textDefinitiu = intervalString(textNet, iniciNet + i, iniciNet + i);

            if (!sufixDefinitiu.equalsIgnoreCase(textDefinitiu)) {
                return false;
            }
                
                
            }
            return true;
        }
    }

    public static boolean esSufix(String sufix, String text) {
        return esSufix(sufix, text, true);
    }
  
      
      
      
    
    
}
