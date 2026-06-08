/*
Desenvolupa una nova versió del programa Exercici 14_28. Enters estrictes. En aquesta ocasió implementaràs una interpretació més flexible dels enters.

En concret, a banda dels enters estrictes:

Cal ignorar els espais en qualsevol lloc que hi puguin aparèixer.

Cal ignorar els separadors (punts . i guions baixos _) sempre i quant es trobin entre dos dígits doncs poden fer la funció de separació.

Per exemple, 192.168.0.1 es considera un enter.
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
                    char c = text.charAt(i);

                    if (Character.isDigit(c)) {                       
                    } else if (c == '.' || c == '_') {

                        if (!(i > 0 && i < text.length() - 1 && 
                              Character.isDigit(text.charAt(i - 1)) && 
                              Character.isDigit(text.charAt(i + 1)))) {
                            esEnter = false;
                        }
                    } else {
                      
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
