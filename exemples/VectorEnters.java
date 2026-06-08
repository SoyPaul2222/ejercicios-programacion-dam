public class VectorEnters {
      
      /*
        Fer un modul que em retorni un vector amb eles edats de tots els alumnes de clase
      */
    
    public static int [] edatsClasse(int nAlumnes) {
         int [] edats = new int [nAlumnes];
         
         for (int i = 0; i < nAlumnes; i++) {
            System.out.println("Edat?");
            edats [i] = Integer.parseInt(Entrada.readLine());
         }
         
         return edats;
    }  
      
    public static void main (String [] args) {
          int edats [] = edatsClasse(3);
          
          for (int i =0; i < edats.length; i++) {
             System.out.println("Edat: " + i + " " + edats[i]);
          }
    
    
    }
}
