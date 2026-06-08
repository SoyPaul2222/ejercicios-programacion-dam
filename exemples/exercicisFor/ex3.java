public class ex3 {
    public static void main (String [] args) {
        System.out.println("Frase?");
        String frase = Entrada.readLine();
        
        boolean primeraLletra = true;
        
        for (int i = 0; i < frase.length(); i++) {
            if (!primeraLletra) {
                    System.out.print(", ");
                }
                System.out.print(i);
                primeraLletra = false;
            }
        }
    }

