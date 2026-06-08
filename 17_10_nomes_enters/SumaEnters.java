/*

Desenvolupa un programa que a partir dels arguments que rebi per línia de comandes, mostri el resultat de sumar els enters que rebi.

Per passar les proves, el teu programa haurà de desenvolupar els següents mòduls dins del programa SumaEnters:

public static int quantsEnters(String[] valors)     // nombre d'enters a valors
public static int[] filtraEnters(String[] valors)   // enters que hi ha a valors
public static int sumaEnters(int[] valors)          // suma dels valors


En cas que no hi hagi cap enter, el resultat serà 0

*/

public class SumaEnters {

      public static void main(String[] args) {
        int[] enters = filtraEnters(args);
        int resultat = sumaEnters(enters);
        System.out.println(resultat);
        }
     
     public static int quantsEnters(String[] valors) {
        int comptador = 0;
        for (int i = 0; i < valors.length; i++) {
            String numeros = valors[i];
            
            if (UtilString.esEnter(numeros)) {
                comptador++;
            }
        }
        return comptador;
    }
     
       
      public static int[] filtraEnters(String[] valors) {
        int mida = quantsEnters(valors);
        int[] enters = new int[mida];
        int indexEnters = 0;

        for (int i = 0; i < valors.length; i++) {
           String numeros = valors[i];
            if (UtilString.esEnter(numeros)) {
                enters[indexEnters] = Integer.parseInt(numeros);
                indexEnters++;
            }
        }
        return enters;
    }

    
    public static int sumaEnters(int[] valors) {
        int suma = 0;
        for (int i = 0; i < valors.length; i++) {
            suma += valors[i];
        }
        return suma;
    }        


} 
