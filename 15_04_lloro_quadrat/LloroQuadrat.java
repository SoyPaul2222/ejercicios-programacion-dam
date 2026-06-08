/*
Desenvolupa el programa LloroQuadrat que implementi una versió del lloro que, com és tradicional, vagi demanant texts i els repeteixi fins que arribi un text en blanc o buit.

En aquesta versió, no obstant, si el text que rep és "dibuixa quadrat" o "dibuixa rectangle", en comptes de repetir el text, dibuixarà el quadrat o el rectangle corresponent.

En finalitzar, s'acomiadarà amb el tradicional "Adéu"
*/

public class LloroQuadrat {
    public static void main (String [] args) {
        
   
            while (true) {
            System.out.println("El lloro espera paraula:");
            String paraula = Entrada.readLine();
                
                if (paraula.isEmpty()) {
                    break;
                }
            
                if (paraula.equals("dibuixa quadrat")) {
                    dibuixaQuadrat();
                }  else if (paraula.equals("dibuixa rectangle")) {
                    dibuixaRectangle();
                } else {
                  System.out.println("El lloro repeteix: " + paraula);
                }
               
         }
         
         System.out.println("Adéu");
           
    }
    
   public static void dibuixaQuadrat() {
         for (int l = 1; l <= 5; l++) {                  
              for (int c = 1; c <= 5; c++) {
                  System.out.print(" X");
               }     
                    System.out.println();                            
                }    
         }
   
   public static void dibuixaRectangle() {
      for (int l = 1; l <= 5; l++) {                  
              for (int c = 1; c <= 10; c++) {
                  System.out.print(" X");
               }     
                    System.out.println();                            
                }    
         }
    
}
   
   
