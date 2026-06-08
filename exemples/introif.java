/*
En aquest exemple practicarem if / else
*/
public class introif {
    public static void main(String [] args) {
        boolean faSol = false;
    /*
        System.out.println("Avui fa sol: " + faSol);
        // si fa Sol → "Quin bon dia que fa"
        // no fa sol → "QUin dia més gris" 
        
        if (faSol == true) {
            System.out.println("Quin bon dia que fa");
      */
          
    
      //dau
      //1. "Has perdut"
      //2. "Mala sort, perds igualment"
      //3. "Ets un campió!"
      
      System.out.println("Llancem el dau. Entra resultat:");
      int dau = Integer.parseInt(Entrada.readLine());      
        
        if (dau == 1) {
        System.out.println("Has perdut");
        } else if (dau == 2) {
        System.out.println("Mala sort, perds igualment");
        } else if (dau > 3) {
        System.out.println("Ets un campió!");
        }
    }
}

