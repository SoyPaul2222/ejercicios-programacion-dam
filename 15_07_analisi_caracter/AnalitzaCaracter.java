/*
Desenvolupa una nova versió de l'exercici que analitzava un caràcter.

La nova versió tindrà el mateix comportament que l'original però el codi serà diferent:

El mòdul main() se n'encarregarà d'obtenir les dades d'entrada, comprovarà que siguin vàlides, mostrarà els errors corresponents, i n'extraurà el caràcter que finalment s'haurà d'analitzar.

Aquest caràcter a analitzar se li passarà al mòdul analitzaCaracter() que serà qui se n'encarregui de realitzar l'anàlisi.
*/

public class AnalitzaCaracter {
    public static void main (String [] args) {
            
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("Text buit");
            return;
        }
        
        System.out.println("Posició?");
        int numero = Integer.parseInt(Entrada.readLine());
        
        if (numero >= 0) {
             int numeroDefinitiva = numero % text.length();
             char caracter = text.charAt(numeroDefinitiva);
             analitzaCaracter(caracter);
        } else {
             int numeroDefinitiva = ((numero % text.length()) + text.length()) % text.length();
              
              if (numeroDefinitiva < 0) {
                    numeroDefinitiva = 0; 
              }
             
             char caracter = text.charAt(numeroDefinitiva);
             analitzaCaracter(caracter);
        }
        
        
          
    }
    
    
    public static void analitzaCaracter(char caracter) {
          if (Character.isLowerCase(caracter)) {
                  System.out.println("'" + caracter + "'" + " és una lletra minúscula");  
                } else if  (Character.isUpperCase(caracter)) {
                     System.out.println("'" + caracter + "'" + " és una lletra majúscula"); 
                } else if (Character.isDigit(caracter)) {
                     System.out.println("'" + caracter + "'" + " és un dígit"); 
                } else {
                     System.out.println("'" + caracter + "'" + " és una altra cosa"); 
                } 
        
    }
   
  
}
