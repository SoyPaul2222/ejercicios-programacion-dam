/*
Desenvolupa un programa anomenat ConteDarrer, que vagi demanant texts fins que un no contingui el darrer caràcter del text anterior. El primer text és acceptat sempre a menys que estigui buit.

*/

public class ConteDarrer {
    public static void main (String [] args) {
        
        System.out.println("Introdueix texts (enter sol per finalitzar)");
        String text = Entrada.readLine();
        String textMajuscula = text.toUpperCase();
        
        if (text.isEmpty()) {
            System.out.println("Adéu");
            return;
        }  
        
        text = text.toUpperCase();
        System.out.println("bé");
        
        while (true) {     
        String textActual = Entrada.readLine();


        if (textActual.isEmpty()) {
           System.out.println("Adéu");
            break;
         }
         
         textActual = textActual.toUpperCase();
        
           boolean darrerCaracter = false;
           char ultimCaracter = text.charAt(text.length() - 1);
            
            for (int i = 0; i < textActual.length(); i++) {
                if (textActual.charAt(i) == ultimCaracter) {
                    darrerCaracter = true;
                    break;  
                }
            }
            
          if (darrerCaracter) {
              System.out.println("bé");
              text = textActual;
          } else {
             System.out.println("Adéu");
             break;
          }
        
        }
        
      
        
    }
}
