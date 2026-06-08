/*
Desenvolupa un programa anomenat TriangleLletres, que demani un text i dibuixi un triangle amb les lletres del text.

Per passar les proves, el mòdul main() se se n'encarregarà d'obtenir les dades d'entrada, i cridarà un mòdul anomenat dibuixaTriangle() que serà qui realitzi realment la feina de mostrar el triangle. De fet, aquest es recolzarà en un altre anomenat dibuixaLinia() que serà qui realment faci la feina de dibuixar cada línia del triangle.
*/

public class TriangleLletres {
    public static void main (String [] args) {
        
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        dibuixaTriangle(text);    
    
    }
    
    public static void dibuixaTriangle(String text) {
        for (int linia = 1; linia <= text.length(); linia++) {
            dibuixaLinia(text, linia);
        }
        
    }
    
    public static void dibuixaLinia(String text, int linia) {
            
          for (int c = 0; c < linia; c++) {
              if (c == linia - 1) {
                System.out.print(text.charAt(c));
              } else {
                System.out.print(text.charAt(c) + ", " );
              }
          }
          
          System.out.println();
        
    }
    
    
}
