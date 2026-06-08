import java.awt.Color;

public class Cercle extends Figura {
    

    public Cercle(int x, int y, Color color, double radi) {
        super(x, y, color);
        this.radi = radi;
    }

    public double radi;

    public double area() {
        return Math.PI * radi * radi;
    }

    @Override
    public String toString() {
        return String.format("Quadrat(radi %.2f) %s", radi, super.toString());
    }
}
