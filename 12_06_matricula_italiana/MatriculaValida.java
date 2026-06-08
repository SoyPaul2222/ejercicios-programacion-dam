/*
Desenvolupa un programa anomenat MatriculaValida que demani a l'usuari una matrícula i li digui si el que li ha introduït correspon a una matrícula italiana vàlida en el format vigent.

Per simplicitat, no considerarem ni el codi del país, ni altres marques com ara l'any de matriculació o el codi de província.

Una matrícula vàlida està formada per:

dues lletres inicials

tres dígits

dues lletres finals

Les lletres poden ser qualsevol lletra majúscula sense caràcters especials com Ç, À, Ñ o ß, i exceptuant les lletres que porten a confusió I, O, Q i U.
*/

public class MatriculaValida {
    public static void main (String [] args) {
        System.out.println("Introduïu una matrícula");
        String matricula = Entrada.readLine();
        
        
       if (matricula.length() == 7 && !matricula.isBlank()) { 
        if (!Character.isDigit(matricula.charAt(0)) && 
            !Character.isDigit(matricula.charAt(1)) && 
             Character.isDigit(matricula.charAt(2)) && 
             Character.isDigit(matricula.charAt(3)) &&  
             Character.isDigit(matricula.charAt(4)) && 
            !Character.isDigit(matricula.charAt(5)) && 
            !Character.isDigit(matricula.charAt(6))) {
           if (Character.isUpperCase(matricula.charAt(0)) && 
               Character.isUpperCase(matricula.charAt(1)) && 
               Character.isUpperCase(matricula.charAt(5)) && 
               Character.isUpperCase(matricula.charAt(6))) {
                if (matricula.charAt(0) != 'I' && 
                    matricula.charAt(1) != 'I' && 
                    matricula.charAt(5) != 'I' &&
                    matricula.charAt(6) != 'I' &&
                    matricula.charAt(0) != 'O' && 
                    matricula.charAt(1) != 'O' && 
                    matricula.charAt(5) != 'O' &&
                    matricula.charAt(6) != 'O' &&
                    matricula.charAt(0) != 'Q' && 
                    matricula.charAt(1) != 'Q' && 
                    matricula.charAt(5) != 'Q' &&
                    matricula.charAt(6) != 'Q' &&
                    matricula.charAt(0) != 'U' && 
                    matricula.charAt(1) != 'U' && 
                    matricula.charAt(5) != 'U' &&
                    matricula.charAt(6) != 'U' &&
                    matricula.charAt(0) >= 'A' && matricula.charAt(0) <= 'Z' &&
                    matricula.charAt(1) >= 'A' && matricula.charAt(1) <= 'Z' &&
                    matricula.charAt(5) >= 'A' && matricula.charAt(5) <= 'Z' &&
                    matricula.charAt(6) >= 'A' && matricula.charAt(6) <= 'Z') {
                 System.out.println("És una matrícula italiana vàlida");
                } else {
                    System.out.println("No és una matrícula italiana vàlida");
                } 
           } else {
            System.out.println("No és una matrícula italiana vàlida");
        }
       } else {
        System.out.println("No és una matrícula italiana vàlida");
       }
       
      } else {
        System.out.println("No és una matrícula italiana vàlida");
      }
    }
}
