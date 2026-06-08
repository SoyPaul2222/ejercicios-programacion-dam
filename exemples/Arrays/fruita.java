/*
Crea un array de fruites = tipus de fruita (Poma, Plàtan, Kiwi)
Crea un matriu de 3x3 que representa 3 tipus de fruites venudes en 3 dies diferentes.
*/


public class fruita { 
    public static void main (String [] args) {
            String [] fruites = {"Poma", "Plàtan", "Kiwi"};
            int [][] vendes = { {5, 2, 3},
                                 {1, 4, 7},           
                                 {4, 23, 23}
                                };
        
        mostrarDies(vendes);
        int[] arrayTotalFruites = sumaFruitesDia(vendes); 
        mostrarTotalFruites(arrayTotalFruites);         
        int[] arrayTotalQuantitat = sumaCadaFruita(vendes); 
        mostrarTotalQuantitat(arrayTotalQuantitat, fruites);   
                           
    }
    
    
    public static void mostrarDies(int vendes [][]) {
 
        for (int dia = 0; dia < vendes.length; dia++) {
            System.out.print("Dia " + (dia + 1) + ": "  );
            for (int quantitat = 0; quantitat < vendes[dia].length; quantitat++) {
            System.out.print(vendes[dia][quantitat] + " ");

            }
            
            System.out.println();
        }
    }
    
    public static int[] sumaFruitesDia (int vendes [][]) {
        int [] totalFruitesXDia = new int[3];
        
        
         for (int dia = 0; dia < vendes.length; dia++) {
         int suma = 0;
            for (int quantitat = 0; quantitat < vendes[dia].length; quantitat++) {
                     suma += vendes[dia][quantitat];      
            }

            
            totalFruitesXDia[dia] = suma;
        }
        
        return totalFruitesXDia;
    }
    
      public static void mostrarTotalFruites(int [] totalFruites) {
 
        for (int i = 0; i < totalFruites.length; i++) {
            System.out.print("TOTAL FRUITES DIA: " + (i + 1) + " " + totalFruites[i] );
      
            
            System.out.println();
        }
    }
    
    public static int[] sumaCadaFruita (int [][] vendes) {
        int [] totalFruites = new int [3];
        
       for (int dia = 0; dia < vendes.length; dia++) {
         int suma = 0;
            for (int quantitat = 0; quantitat < vendes[dia].length; quantitat++) {
                     suma += vendes[quantitat][dia];      
            }
            
            totalFruites[dia] = suma;
            
            
        }
        
        return totalFruites;
    }
    
      public static void mostrarTotalQuantitat(int [] totalQuantitat, String [] fruites) {
 
        for (int i = 0; i < totalQuantitat.length; i++) {
            System.out.print("TOTAL " + fruites[i] +   " DIA: " + (i + 1) + " " + totalQuantitat[i] );
      
            
            System.out.println();
        }
    
  }
  
  }
    


