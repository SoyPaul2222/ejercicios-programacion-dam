/*
Desenvolupa un programa anomenat PiramideLletres, que rep un text com a primer argument de la línia de comandes, i dibuixa piràmide amb les seves lletres.
*/

public class PiramideLletres {
    public static void main (String [] args) {
    
      String text = args[0];
      piramitza(text);    
    }
    
    public static void piramitza(String text) {
    
        int longitud = text.length();
        
     
        
        for (int l = 0; l < longitud; l++) {

             for (int e = 0; e < (longitud - l - 1) * 2 + 1; e++) {
                System.out.print(".");
            }


            for (int el = 0; el <= l; el++) {
                System.out.print(text.charAt(el));

                if (l > 0 || el < l)  {
                 System.out.print(".");
                 }
            }


            for (int dl = l - 1; dl >= 0; dl--) {
                System.out.print(text.charAt(dl));
                System.out.print(".");
            }

            for (int d = 0; d < (longitud - l - 1) * 2 + 1; d++) {
                System.out.print(".");
            }
        
           System.out.println();        
        }
    }
    
 }
