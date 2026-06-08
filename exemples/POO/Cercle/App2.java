import java.awt.Color;

public class App2 {
    public static void main(String[] args) {
        
        Cercle c1 = new Cercle(0, 2, Color.RED, 60);
        Cercle c2 = new Cercle(90, 1, Color.yellow, 10);
        Cercle c3 = new Cercle(67, 43, Color.blue, 5);
        Cercle c4 = new Cercle(7, 144, Color.green, 8);

        Quadrat q1 = new Quadrat(0, 215, Color.RED, 60);
        Quadrat q2 = new Quadrat(900, 16, Color.yellow, 10);
        Quadrat q3 = new Quadrat(674, 43, Color.blue, 5);
        Quadrat q4 = new Quadrat(767, 144, Color.green, 8);

        System.out.printf("%s, té area %.2f\n", c1, c1.area());
        System.out.printf("%s, té area %.2f\n", c2, c2.area());
        System.out.printf("%s, té area %.2f\n", c3, c3.area());
        System.out.printf("%s, té area %.2f\n", c4, c4.area());

        System.out.printf("%s, té area %.2f\n", q1, q1.area());
        System.out.printf("%s, té area %.2f\n", q2, q2.area());
        System.out.printf("%s, té area %.2f\n", q3, q3.area());
        System.out.printf("%s, té area %.2f\n", q4, q4.area());


    }
}
