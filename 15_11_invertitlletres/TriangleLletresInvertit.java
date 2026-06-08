/*
Desenvolupa un programa anomenat TriangleLletres, que demani un text i dibuixi un triangle amb les lletres del text.

Per passar les proves, el mòdul main() se se n'encarregarà d'obtenir les dades d'entrada, i cridarà un mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.
*/

public class TriangleLletresInvertit {
    public static void main (String [] args) {
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        dibuixaTriangleInvertit(text);    
    
    }
    
    public static void dibuixaTriangleInvertit(String text) {
        for (int linia = text.length(); linia > 0; linia--) {
            dibuixaLiniaInvertida(text, linia);
        }
        
    }
    
    public static void dibuixaLiniaInvertida(String text, int linia) {
            
          for (int c = linia - 1; c >= 0; c--) {
              if (c == 0) {
                System.out.print(text.charAt(c));
              } else {
                System.out.print(text.charAt(c) + ", " );
              }
          }
          
          System.out.println();
        
    }
    
    
}
