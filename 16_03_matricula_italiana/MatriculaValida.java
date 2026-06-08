/*
En aquesta ocasió rescatarem l'exercici de les matrícules italanes i en farem una nova versió que farà servir la funció esLletraValidaPerMatriculaItaliana() que rep un caràcter i retorna un booleà a cert quan el caràcter pot ser una lletra vàlida per una matrícula italiana.

Així, caldrà reprogramar el main() del programa de manera que, allà on feies les comparacions per decidir si un caràcter era o no una lletra vàlida, ara faràs una crida a la nova funció.
*/

public class MatriculaValida {
    public static void main (String [] args) {
        
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        boolean esValida = true;
        
        
        if (matricula.length() != 7 || matricula.isBlank()) {
            System.out.println("No és una matrícula italiana vàlida");
            return;
        }
        

        
        for (int i = 0; i < matricula.length(); i++) {
            char c = matricula.charAt(i);
            
             if (i == 2 || i == 3 || i == 4) {
                if (!Character.isDigit(c)) {
                    esValida = false;
                    } 
             } else {
                  if (!esLletraValidaPerMatriculaItaliana(c)) {
                      esValida = false;  
                   }
             }
             
         }
         
         mostraMissatge(esValida);
     
     }
     
     
        public static boolean esLletraValidaPerMatriculaItaliana(char c) {
            if (c < 'A' || c > 'Z') {
              return false;    
            }
            
            return c != 'I' && c != 'O' && c != 'Q' && c != 'U';
         }
         
         public static void mostraMissatge(boolean esValida) {
            if (esValida) {
              System.out.println("És una matrícula italiana vàlida");
            } else {
               System.out.println("No és una matrícula italiana vàlida");
            }
         }
    
    
}
