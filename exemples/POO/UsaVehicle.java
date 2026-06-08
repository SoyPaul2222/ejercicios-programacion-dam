package POO;


public class UsaVehicle {
    public static void main (String [] args) {
    Vehicle delorean = new Vehicle("DMC", "delorean");
    System.out.println(Vehicle.getContador() + ": " + delorean.toString());    

    Vehicle cocheFantastico = new Vehicle("Pondiac", "Kit");
    System.out.println(Vehicle.getContador() + " " + cocheFantastico.toString());

    Vehicle buit = new Vehicle(null, null);

    
    System.out.println(buit);
    buit.setBrand("Mercedes");
    buit.setModel("Benz");
    System.out.println("Nova marca: " + buit);
     
    System.out.println("En total, tenim " + Vehicle.getContador() + " vehicles");
    }

}
