/*
Desenvolupa un nou "Lloro". En aquest cas li anomenaràs LloroVocalIniFi i només repetirà les paraules que iniciïn i finalitzin amb la mateixa vocal, independentment de si apareixen en majúscules o minúscules.
*/

public class LloroVocalIniFi {
    public static void main (String [] args) {
       
        System.out.println("Paraula?");
        String paraula = Entrada.readLine();
     
      while (!paraula.isBlank()) {
          
          char iniciVocal = paraula.charAt(0);
          char iniciVocalMinuscula = Character.toLowerCase(iniciVocal);
          char fiVocal = paraula.charAt(paraula.length()-1);
          char fiVocalMinuscula = Character.toLowerCase(fiVocal);
          
            if ((iniciVocalMinuscula == 'a' && fiVocalMinuscula == 'a') || 
                (iniciVocalMinuscula == 'e' && fiVocalMinuscula == 'e') || 
                (iniciVocalMinuscula == 'i' && fiVocalMinuscula == 'i') || 
                (iniciVocalMinuscula == 'o' && fiVocalMinuscula == 'o') || 
                (iniciVocalMinuscula == 'u' && fiVocalMinuscula == 'u') )  {
          System.out.println("Repeteixo: " + paraula);
          }
          
           System.out.println("Paraula?");
           paraula = Entrada.readLine();
      }
      
    
        System.out.println("Adéu");
    }
}
