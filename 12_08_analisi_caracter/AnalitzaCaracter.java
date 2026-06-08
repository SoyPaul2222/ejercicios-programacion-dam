/*
Desenvolupa un programa anomenat AnalitzaCaracter que demani un text i una posició.

Si el text és buit, indicarà "Text buit" i finalitzarà sense demanar res més.

Si la posició està dins del rang de caracters del text introduït, considerarà el caracter corresponent a la posició. Per exemple, si la paraula és "hola" i la posició és 2, el caràcter corresponent serà 'l'.

Si la posició supera el nombre de caràcters del text, continuarà comptant a partir del primer. Per exemple, si la paraula és "hola" i la posició és 6, el caràcter corresponent serà 'l'.

Si la posició és negativa, començarà a comptar a partir de l'últim caràcter del text introduït. Per exemple, -2 correspondrà a l'últim caràcter.

Un cop identificat el caràcter escollit, el programa indicarà:

el caràcter que correspon a la posició demanada

la categoria del caràcter:

lletra majúscula

lletra minúscula

dígit

altre: quan no sigui cap dels anteriors
*/

public class AnalitzaCaracter {
    public static void main (String [] args) {

        System.out.println("Text?");
        String text = Entrada.readLine();
        
        if (text.isEmpty()) {
            System.out.println("Text buit");
        } else {
            System.out.println("Posició?");
            int numero = Integer.parseInt(Entrada.readLine());
            
            if (numero >= 0) {
                int numeroDefinitiva = numero % text.length();
                if (Character.isLowerCase(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una lletra minúscula");  
                } else if  (Character.isUpperCase(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una lletra majúscula"); 
                } else if (Character.isDigit(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és un dígit"); 
                } else {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una altra cosa"); 
                }        

            } else { 
                 int numeroDefinitiva = ((numero % text.length()) + text.length()) % text.length();
                
                if (numeroDefinitiva < 0) {
                    numeroDefinitiva = 0; 
                }

                if (Character.isLowerCase(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una lletra minúscula");  
                } else if  (Character.isUpperCase(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una lletra majúscula"); 
                } else if (Character.isDigit(text.charAt(numeroDefinitiva))) {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és un dígit"); 
                } else {
                     System.out.println("'" + text.charAt(numeroDefinitiva) + "'" + " és una altra cosa"); 
                } 
            }
        }
    }
}
