/*
Desenvolupa un programa anomenat Quadrat que esperi un valor enter positiu en args[0] i mostri un quadrat de " X" amb el costat indicat pel valor rebut.
*/

public class Quadrat {
    public static void main (String [] args) {
            
          int valor = Integer.parseInt(args [0]);
          char caracter = args [1].charAt(0);
          
          if (valor < 1) {
            return;
          } else {
              dibuixaQuadrat(valor, caracter); 
          }
    }
    
    public static void dibuixaQuadrat(int costat, char caracter) {
         for (int i = 1; i <= costat; i++) {
              dibuixaLinia(costat, caracter);
         }
    }
    
   public static void dibuixaLinia(int costat, char caracter) {
         for (int c = 1; c <= costat; c++) {
             System.out.print(" " + caracter);
          }
            System.out.println();
   } 
}
