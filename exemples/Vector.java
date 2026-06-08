public class Vector {
    public static void main (String args []) {
        
        
        
        int [][] nums = {{1, 2, 3 },
                         {0, 2, 4},
                         {10, 11, 12}
                         };      
                         
         for (int i = 0; i < nums.length; i++) {
            for (int j = 0; j < nums[i].length; j++) {
                System.out.print(nums[i][j] + " ");
            }
            System.out.println();
         }      
         
         System.out.println();        
         
         //[][] La primera es fila y la segunda columna
         //Cuando hacemos new, reservamos espacio.
         //Cuanto más "[]" ponemos, aumentamos las dimensiones
         int [][] nums2 = new int[3][3];
         nums [0][0] = 1;
         nums [0][1] = 2; 
        
        
        char [] nom1 = {'F', 'e', 'r'};
        char [] nom2 = {'J', 'u', 'd', 'i', 't', 'h'};
        char [] nom3 = {'A', 'd', 'r', 'i', 'a'};
        
        char [][] nomsArray = new char[3][];
        
        nomsArray[0] = nom1;
        nomsArray[1] = nom2;
        
        //new; reservé espacios de 10 caracteres en blanco
        nomsArray[2] = new char[10];
        
        for (int i = 0; i < nomsArray.length; i++) {
            for (int j = 0; j <nomsArray[i].length; j++ ) {
                
                System.out.print(nomsArray[i][j]);
                
            }
            
            System.out.println();
        }
        
        /*
        
        String [] paraules3 = new String[3];
        System.out.println(paraules3.length);
        
        System.out.println(paraules.length);
        paraules3[0] = "Paul";
        paraules3[1] = "Aron";
        paraules3[2] = "Imad";
        
        for (int i = 0; i < paraules3.length; i++) {
            String nom = paraules3[i];
            for (int j = 0; j <paraules3[i].length(); j++) {
                    System.out.print(paraules3[i].charAt(j));
            }
            System.out.println();
            
            */
        
        /*Es como el charAt
            String paraula = paraules3[i];
            
            System.out.println(paraula);
            
            */
        }
    }

