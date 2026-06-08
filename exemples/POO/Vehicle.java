package POO;

public class Vehicle {
    private String brand;
    private String model;
    private static int contador = 0;
    // CONSTRUCTOR PER DEFECTE
    public Vehicle() {
        contador++;
    }
    
    //CONSTRUCTOR ESPECIFIC
    public Vehicle (String brand, String model) {
   
        setBrand(brand);
        setModel(model);
        contador++;
    }

    public static int getContador() {
        return contador;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel (String model) {
        this.model = model;
    }


    @Override
    public String toString() {
        return brand + "-" + model;
    }
    
}
