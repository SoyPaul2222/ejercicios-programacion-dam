


public class Mutabilitat {

 /*
 
    public static void actualitza(int [] nums2) {
    
    }
    
    /*
        nNUms nombre de numeros
        reotorna un vector de mida nNUms numeros
    */
    
    public static int [] inicialitzaNums(int nNums) {
       int [] numeros = new int[nNums];
       
       for (int i = 0; i < nNums /* o numeros.length*/; i++) {
        numeros[i] = i + 1;
       }
       
       return numeros;
    }
    
    public static void mostraEnUnaLinia(int [] nums) {
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        
        System.out.println();
    }
    
    public static void multiplicaPer2 (int [] nums) {
        
       for (int i = 0; i < nums.length /* o numeros.length*/; i++) {
        nums[i] *= 2;
     
       }
    }
    
    public static void main (String [] args) {
      
        int [] nums;
        
        nums = inicialitzaNums(/*int nNums :*/ 10);
        mostraEnUnaLinia(nums);
        multiplicaPer2(nums);
        mostraEnUnaLinia(nums);
    }
}
