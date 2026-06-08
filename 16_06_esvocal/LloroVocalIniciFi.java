/*
Programa que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocalPrograma que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocal

Programa que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocal
Programa que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocal
Programa que llegeixi de l'entrada estàndard un text i indiqui si comença o finalitza o no per vocal
*/

public class LloroVocalIniciFi {
    public static void main (String [] args) {
          
        int comptador = 1;  
       
           while (true) {
           
           System.out.println("Text?"); 
           String text = Entrada.readLine();
           
           if (text.isEmpty()) {
              
              System.out.println("Sortir?");
              String resposta = Entrada.readLine();
              boolean confirmacio = false; 
              confirmacio = UtilitatsConfirmacio.respostaABoolean(resposta);
              
              if (confirmacio) {
                 System.out.println("Adéu");
                 return;
              } else {
                continue;
              }
           }
           
           char primerCaracter = text.charAt(0);
           char ultimCaracter = text.charAt(text.length()-1);
           
           boolean primerVocal = UtilString.esVocal(primerCaracter);
           boolean ultimVocal = UtilString.esVocal(ultimCaracter);
           
              if (primerVocal || ultimVocal) {
                 if (comptador < 10) {
                     System.out.println("  " + comptador + ": \"" + text + "\"");
                 } else {
                    System.out.println(" " + comptador + ": \"" + text + "\"");
                 }
                 comptador++;
              }
             
                       

         }

           
           
    }
}
