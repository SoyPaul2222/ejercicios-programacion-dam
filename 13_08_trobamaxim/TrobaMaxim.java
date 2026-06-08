/*
Desenvolupa un programa anomenat TrobaMaxim, que vagi demanant enters positius i que, en el moment que rebi un de negatiu, mostri el valor màxim positiu introduït i finalitzi l'execució.
*/

public class TrobaMaxim {
    public static void main (String [] args) {
        System.out.println("Introdueix un valor");
        int valor = Integer.parseInt(Entrada.readLine());
        int valorMaxim = 0;
        
        
        while (valor >= 0) {    
                if (valor >= valorMaxim) {
                   valorMaxim = valor; 
                }
            System.out.println("Introdueix un valor");
            valor = Integer.parseInt(Entrada.readLine());
         }
         
         System.out.println("El màxim és " + valorMaxim);
    
}
}
