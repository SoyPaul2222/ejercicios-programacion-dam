public class ex5 {
    public static void main (String [] args) {
    
    System.out.println("Frase?");
    String frase = Entrada.readLine();
    String vocal = "aeiou";
        
        
        for (int i = 0; i < frase.length(); i++) {
            char frases = frase.charAt(i);
             for (int j = 0; j < vocal.length(); j++) {
               char vocals = vocal.charAt(j);
               
                 if (vocals == frases){
                   

                   System.out.print(vocals + ", ");
                }
        
        }
            
     }
        
       
        
        
    }
}
