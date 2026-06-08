/*
Desenvolupa una nova versió del programa anterior. Aquest cop, des de main es cridarà un mòdul anomenat dibuixaQuadrats() que farà la feina de demanar el número de quadrats a dibuixar i els dibuixarà.
*/

public class Quadrats {
    public static void main (String [] args) {
   
        dibuixaQuadrats();
        
       }
    
    public static void dibuixaQuadrats() {
     
        System.out.println("Quants?");
        int quantitat = Integer.parseInt(Entrada.readLine());
        
        if (quantitat <= 0) {
            return;
        } else {
            
            for (int q = 1; q <= quantitat; q++) {
                for (int l = 1; l <= 5; l++) {
                  
                    for (int c = 1; c <= 5; c++) {

                        System.out.print(" X");
                    }
                    
                    System.out.println();
                            
                }    
                
                 System.out.println();
            }
        }
      
      }
        
    
}
