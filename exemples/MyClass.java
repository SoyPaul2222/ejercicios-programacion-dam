
public class MyClass {
    public static void main (String [] args) {
        //array
        //inicialitzacio posant valors
        int[] nums = {1, 2, 3};
        for (int i = 0; i < nums.length; i++) {
            System.out.print( nums [i] + " " );
        }
        //inicialitzacio general
        
        System.out.println();
        int [] nums2 = new int [4];
        for (int i = 0; i < nums2.length; i++) {
            System.out.print( nums2 [i] + " ");
        } 
        
        System.out.println();
        nums2[0] = 1;
        nums2[1] = 2;
        
        for (int i = 0; i < nums2.length; i++) {
            System.out.print( nums2 [i] + " ");
        } 
        
         System.out.println();
         char [] lletres = {'h', 'o', 'l', 'a'};
         for (int i = 0; i < lletres.length; i++) {
            System.out.print(lletres[i]);
         }
         System.out.println();
         
         for (int i = 0; i  <lletres.length; i++) {
            lletres[i] = Character.toUpperCase(lletres[i]);
         }
         

         
         for (int i = 0; i < lletres.length; i++) {
            System.out.print(lletres[i]);
         }
         
        System.out.println();
        
        String [] paraules = {"Bon", "dia"};
        for (int i = 0; i < paraules.length; i++) {
            for (int j = 0; j < paraules[i].length(); j++) {
                    System.out.print(paraules[i].charAt(j));
            }
            System.out.print(" ");
        }
        System.out.println();
        
    }
}
