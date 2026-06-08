/*
En aquesta ocasió desenvoluparàs un programa anomenat RectanglesAMida que anirà demanant nombres enters fins rebre'n un de negatiu o bé una cadena buida o només formada per espais en blanc.

Per cada nombre que rebi, dibuixarà un rectangle d'asteriscs ('*') amb el nombre de columnes indicat pel número introduït, i el nombre de files indicat pel número anterior. En el cas del primer número, el nombre de files serà 1.

El rectangle estarà encapçalat pel número de columna, començant per la 0. En cas que tingui més de 10 files, després de la 9 passarà un altre cop a la 1. D'igual manera, per cada fila també indicarà el número corresponent.

Finalment mostrarà un resum amb el nombre de rectangles i punts dibuixats, o bé el missatge "Cap rectangle dibuixat".
*/

public class RectanglesAMida {
    public static void main (String [] args) {
        System.out.println("1 x ?");
        String columnaString = Entrada.readLine();
        int fila = 1;
        int comptadorRectangles = 0;
        int comptadorAsterisc = 0;
        
        if (columnaString.isBlank()) {
            System.out.println("Cap rectangle dibuixat");
        } else {
        
        int columna = Integer.parseInt(columnaString);
        
         if (columna < 0) {
            System.out.println("Cap rectangle dibuixat");
         } else {
        
          while (columna > 0 && !columnaString.isBlank()) {
            System.out.print("  ");
            for (int n = 0; n < columna; n++) {
            
                System.out.print(n % 10);
            }
            System.out.println(); 
            for (int f = 0; f < fila; f++) {
                System.out.print((f  % 10) + " ");
              for (int c = 0; c < columna; c++) {
               System.out.print("*");
               comptadorAsterisc++;
            }
              System.out.println();
            }  
            
            comptadorRectangles++;
            fila = columna;
            System.out.println(columna + " x ?");
            columnaString = Entrada.readLine();
            
            if (!columnaString.isBlank()) {
                columna = Integer.parseInt(columnaString);
            }
            
            
           }
        
            System.out.println("Rectangles: " + comptadorRectangles);
            System.out.println("Punts: " + comptadorAsterisc);
       } 
       
       }
    }
}
