public class ex4 {
    public static void main (String [] args) {
    
    System.out.println("Frase?");
    String frase = Entrada.readLine();
    String vocal = "aeiou";
        
        boolean conteVocal = false;
        
        for (int i = 0; i < frase.length(); i++) {
            char frases = frase.charAt(i);
             for (int j = 0; j < vocal.length(); j++) {
               char vocals = vocal.charAt(j);
               
                 if (vocals == frases){
                   conteVocal = true;
                   System.out.println("Conté vocal");
                   return;
                }
        
        }
            
     }
        
       
        
      
        if (conteVocal) {
            System.out.println("Conté vocal");
        } else {
            System.out.println("No conté vocal");
        }
        
        
    }
}
