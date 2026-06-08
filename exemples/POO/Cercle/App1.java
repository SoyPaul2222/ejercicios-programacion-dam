import java.awt.Color;

public class App1 {
    
    public static void main (String [] args) {
        Cercle vermell = new Cercle(20, 5, Color.RED, 0);
        Cercle groc = new Cercle(7, 56, Color.yellow, 2);

        System.out.printf("%s, té area %.2f\n", vermell, vermell.area());
        System.out.printf("%s, té area %.2f\n", groc, groc.area());


        

    }

}
