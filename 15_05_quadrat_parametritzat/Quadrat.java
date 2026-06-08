/*
Desenvolupa un programa anomenat Quadrat que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.
*/

public class Quadrat {
    public static void main (String [] args) {
            
          int valor = Integer.parseInt(args [0]);
          
          if (valor < 1) {
            return;
          } else {
              dibuixaQuadrat(valor); 
          }
    }
    
    public static void dibuixaQuadrat(int linia) {
         for (int i = 1; i <= linia; i++) {
              dibuixaLinia(linia);
         }
    }
    
   public static void dibuixaLinia(int costat) {
         for (int c = 1; c <= costat; c++) {
             System.out.print(" X");
          }
            System.out.println();
   } 
}
