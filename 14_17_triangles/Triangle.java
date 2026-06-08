/*
Desenvolupa un programa anomenat Triangle, que demani un nombre enter positiu i dibuixi tants triangles com se li indiqui.

Si el valor d'entrada és menor que 1, el programa no mostrarà cap sortida.
*/

public class Triangle {
    public static void main (String [] args) {
        
    System.out.println("quants?");
    int quantitat = Integer.parseInt(Entrada.readLine());
    
    if (quantitat > 0) {
    
    for (int q = 0; q < quantitat; q++) { 
     
        for (int i = 0; i <= 9; i++) {
        
            for (int colPunt = 0; colPunt < 9 - i; colPunt++) {
                System.out.print(".");
            }
            
            for (int colNum = 9 - i ; colNum <= 9; colNum++) {
                System.out.print(colNum);
            }
            
            for (int colNum = 8; colNum >= 9 - i; colNum--) {
                System.out.print(colNum);
            }
            
            for (int colPunt = 0; colPunt < 9 - i; colPunt++) {
                System.out.print(".");
            }
            
           
            
            
            System.out.println();
        }
        
    }
    
    } else {
        
    }    
    }
}
