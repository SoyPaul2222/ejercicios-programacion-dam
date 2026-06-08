/*
Desenvolupa un programa anomenat Password que demani una contrasenya i digui si és vàlida o no segons els següents criteris:

Té una llargària mínima de 8 caràcters i màxima de 16

Ha de contenir un mínim d'un número

Ha de contenir un mínim d'una lletra majúscula

Ha de contenir un mínim d'una lletra minúscula. Considera que una lletra és minúscula si no és majúscula.

Ha de contenir un mínim d'un símbol

El nombre de lletres majúscules no pot ser inferior al de minúscules

No pot contenir espais en blanc

No es poden repetir caràcters excepte si són vocals (a,e,i,o,u)

No poden ser més de 4 caràcters seguits del mateix tipus. Els tipus són números, lletres majúscules, lletres minúscules i símbols. Ex. "91235a!A" no és vàlid perquè té més de quatre dígits seguits.

No poden contenir més de tres números consecutius. Ex. "1234Abc!" no es vàlid perquè inclou els números consecutius 1, 2, 3 i 4. Atenció: No es considera consecutius "8901", és a dir, no són consecutius circulars.

Per passar les proves, els missatges d'error esperat estaran en l'ordre indicat. És a dir, el text "abcdefg" no és un password vàlid per vàries raons. Per exemple, no té números, ni símbols, ni majúscules, etc. El problema pel que es queixarà Password, però, serà per que la longitud no és correcta, ja que és aquesta la primera comprovació a realitzar.

Aniràs descobrint els missatges a donar a partir dels errors que t'indicarà el prgtest.

Pista: No saps per on començar? Et proposo que comencis per resoldre cada regla per separat. Quan una no et passi les proves, considera provar-la en un programa a part, fins que la tinguis funcionant.
*/

public class Password {
    public static void main (String [] args) {
        System.out.println("Contrasenya?");
        String password = Entrada.readLine();
        
        boolean longitudValid = false;
        boolean conteUnNumero = false;
        boolean minimUnaMajuscula = false;
        boolean minimUnaMinuscula = false;
        boolean conteSimbol = false;
        boolean majusculesMesMinuscules = false;
        boolean espais = false;
        boolean repetirCaracters = true;
        boolean mes4DigitsMateixTipus = false;
        boolean tresNumerosConsecutius = true;
        boolean contrasenyaValida = false;
        
        String majuscules = "";
        String minuscules = "";
        String numeros = "";
        String simbols = "";
        
        if (password.length() <= 8 && password.length() >= 16) {
           longitudValid = true; 
        }
        
        if (!longitudValid) {
            System.out.println("No es valid la longitud");
        }
        
        
        if (longitudValid) {
        for (int i = 0 ; i < password.length(); i++) {                
            char c = password.charAt(i);
            
            if (Character.isDigit(c)) {
               conteUnNumero = true;
               numeros += c;
            }
            
            if (Character.isLowerCase(c)) {
                minimUnaMinuscula = true;
                minuscules += c;
            }
            
            if (Character.isUpperCase(c)) {
                minimUnaMajuscula = true;
                majuscules += c;
            }
            
            if (!Character.isLetter(c)) {
                conteSimbol = true;
                simbols += c;
            }
            
            if (majuscules.length() > minuscules.length()) {
               majusculesMesMinuscules = true;
            }
            
            if (Character.isWhitespace(c)) {
                espais = true;
            }
            
            if (majuscules.length() > 4 || minuscules.length() > 4 || numeros.length() > 4 || simbols.length() > 4 ) {
               mes4DigitsMateixTipus = true;
            }  
            
            
        //    conteSimbol && majusculesMesMinuscules && !espais && !mes4DigitsMateixTipus
            
                  
        }
        
        if (conteUnNumero && minimUnaMajuscula) {
            contrasenyaValida = true;
        }
        
        if (contrasenyaValida) {
            System.out.println("Contrasenya valida!!");
        }
        
      }
        
    
    }
}


