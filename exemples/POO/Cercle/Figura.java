import java.awt.Color;

public class Figura {
    private int x; 
    private int y;
    private Color color = Color.BLUE; //color = color.RED
    private double radi;
    
    public Figura(int x, int y, Color color) {
        this.x = x;
        this.y = y;
        this.color = color;
    }

    public int getX() {
        return x;
    }

    public void setX(int x) {
        this.x = x;
    }

    public int getY() {
        return y;
    }

    public void setY(int y) {
        this.y = y;
    }

    public Color getColor() {
        return color;
    }

    public void setColor(Color color) {
        this.color = color;
    }

    public double getRadi() {
        return radi;
    }

    public void setRadi (double radi) {
        this.radi = radi;
    }

    public double area() {
        return 0;
    }


    
    @Override 
    public String toString() {
        return "Cercle: (" + x + "," + y + "," + radi + "," + Color.blue +")";
    }
    
    public static void main (String [] args) {
        
    }
}
