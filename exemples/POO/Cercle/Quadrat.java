import java.awt.Color;

public class Quadrat extends Figura {
    
    public Quadrat(int x, int y, Color color, double costat) {
        super(x, y, color);
        this.costat = costat;
    }

    public double costat;

    public double area() {
        return costat * costat;
    }

    @Override
    public String toString() {
        return String.format("Quadrat(costat %.2f) %s", costat, super.toString());
    }
}

