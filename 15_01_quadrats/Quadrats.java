/*
Desenvolupa un programa anomenat Quadrats que demani un número per entrada estàndard, i dibuixi tants quadrats com indiqui el número. Si el número és 0 o negatiu, no dibuixarà res.

Els quadrats els anirà dibuixant separant-los per una línia en blanc.
*/

public class Quadrats {
    public static void main (String [] args) {
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
