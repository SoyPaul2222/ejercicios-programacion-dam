public class ex2 {
    public static void main (String [] args) {
        System.out.println("Frase?");
        String frase = Entrada.readLine();
        
        for (int i = 0; i < frase.length(); i++) {
            System.out.print(i);
        }
        
        System.out.println();
    }
}
