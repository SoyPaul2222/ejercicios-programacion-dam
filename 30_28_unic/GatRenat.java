/*
Enunciat

Ara ja sabem afegir paràmetres als constructors. Per exemple:

public class GatRenat {
    private int vides;
    public GatRenat(int novesVides) {
        vides = n
*/

public class GatRenat {
    private int vides = 7;
    private String posicio = "estirat";
    private static GatRenat instancia;


    private GatRenat(){this(7, "estirat");}
    private GatRenat(int vides){  this(vides, "estirat");} 
    private GatRenat(String posicio){this(7, posicio);}
    private GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
    }
    
    public static GatRenat getInstancia() {
    if (instancia == null) {
        instancia = new GatRenat();
    }
    return instancia;
    }
    
    public static GatRenat getInstancia(int vides) {
        if (instancia == null) {
            instancia = new GatRenat(vides);
         } else {
           instancia.setVides(vides); 
         }
        return instancia;
      } 

    public static GatRenat getInstancia(String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(posicio);
        } else {
            instancia.setPosicio(posicio);
        }
        return instancia;
    }

    public static GatRenat getInstancia(int vides, String posicio) {
        if (instancia == null) {
            instancia = new GatRenat(vides, posicio);
        } else {
            instancia.setVides(vides);
            instancia.setPosicio(posicio);
        }
        return instancia;
    }
    
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }

    public String getPosicio() {return posicio;}

    public void setPosicio(String posicio) {
         if (!posicio.isEmpty() && (posicio.equals("dret") || posicio.equals("assegut") || posicio.equals("estirat") )) {
              this.posicio = posicio;
          }
    }

    @Override
    public String toString() { return String.format("Vides: %d. Posició: %s" , vides, posicio); }
}
