/*
Desenvolupa un programa anomenat InformeText que demani un text i mostri un petit informe resum d'estadístiques del text.

L'informe indicarà quants caràcters, lletres i vocals catalanes (majúscules i minúscules), dígits i altres caràcters conté. A banda, indicarà, per cada categoria, el percentatge respecte el total dels caràcters.

Per què el teu programa tingui el verd del prgtest caldrà que incloguis les següents funcions dins de UtilString:

boolean esVocal(char): indica si el caràcter introduït és una vocal catalana en minúscules.

int numDigits(String)

int numVocalsMajuscules(String)

int numVocalsMinuscules(String)

int numLletresMajuscules(String)

int numLletresMinuscules(String)

int numLletres(String): no totes les lletres són o bé majúscules o bé minúscules!
*/

public class InformeText {

    public static void main(String[] args) {
       
        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("Cadena buida");
            return;
        }
        
     
        int totalCaracters = text.length();
        
        int lletresMajuscules = UtilString.numLletresMajuscules(text);
        int lletresMinuscules = UtilString.numLletresMinuscules(text);
        int totalLletres = lletresMajuscules + lletresMinuscules;
        
        int vocalsMajuscules = UtilString.numVocalsMajuscules(text);
        int vocalsMinuscules = UtilString.numVocalsMinuscules(text);
        int totalVocals = vocalsMajuscules + vocalsMinuscules;
        
        int digits = UtilString.numDigits(text);
        int altresCaracters = totalCaracters - totalLletres - digits;
        
        System.out.println("Informe");
        System.out.println("=======");
        
        System.out.printf("lletres en majúscules: %d (%.2f%%)%n", 
                          lletresMajuscules, 100.0 * lletresMajuscules / totalCaracters);
        System.out.printf("lletres en minúscules: %d (%.2f%%)%n", 
                          lletresMinuscules, 100.0 * lletresMinuscules / totalCaracters);
        System.out.printf("total lletres: %d (%.2f%%)%n", 
                          totalLletres, 100.0 * totalLletres / totalCaracters);
        System.out.printf("vocals en majúscules: %d (%.2f%%)%n", 
                          vocalsMajuscules, 100.0 * vocalsMajuscules / totalCaracters);
        System.out.printf("vocals en minúscules: %d (%.2f%%)%n", 
                          vocalsMinuscules, 100.0 * vocalsMinuscules / totalCaracters);
        System.out.printf("total vocals: %d (%.2f%%)%n", 
                          totalVocals, 100.0 * totalVocals / totalCaracters);
        System.out.printf("digits: %d (%.2f%%)%n", 
                          digits, 100.0 * digits / totalCaracters);
        System.out.printf("altres caràcters: %d (%.2f%%)%n", 
                          altresCaracters, 100.0 * altresCaracters / totalCaracters);
        System.out.println("total caràcters: " + totalCaracters);
        

    }
}
