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
    private UllDeGat ullDret;
    private UllDeGat ullEsquerra;

    public GatRenat(){this(7, "estirat");}
    public GatRenat(int vides){  this(vides, "estirat");} 
    public GatRenat(String posicio){this(7, posicio);}
    public GatRenat(int vides, String posicio) {
        setVides(vides);
        setPosicio(posicio);
        ullDret = new UllDeGat();
        ullEsquerra = new UllDeGat(); 
    }
    public int getVides() { return vides; }
    public void setVides(int novesVides) {
        if (novesVides >= 0)  {
            vides = novesVides;
        }
    }
    
    public UllDeGat getUllDret() {
        return ullDret;
    }
    
    public UllDeGat getUllEsquerre() {
        return ullEsquerra;
    }

    public String getPosicio() {return posicio;}

    public void setPosicio(String posicio) {
         if (!posicio.isEmpty() && (posicio.equals("dret") || posicio.equals("assegut") || posicio.equals("estirat") )) {
              this.posicio = posicio;
          }
    }

    public boolean esDret() {
        return posicio.equals("dret");
    }
    public boolean esAssegut() {
        return posicio.equals("assegut");
    }
    public boolean esEstirat() {
        return posicio.equals("estirat");
    }

    public String aixecat() {
        if (esDret()) {
            return "passo de fer res";
        } else {
            posicio = "dret";
            ullDret.obret();
            ullEsquerra.obret();
            return "ja m'aixeco";
        }
    }

    public String seu() {
        if (esAssegut()) {
            return "passo de fer res";
        } else {
            posicio = "assegut"; 
            ullDret.obret();
            ullEsquerra.tancat();
            return "ja m'assec";
        }
    }

    public String estirat() {
        if (esEstirat()) {
            return "passo de fer res";
        } else {
            posicio = "estirat";
            ullDret.tancat();
            ullEsquerra.tancat();
            return "ja m'estiro";
        }
    }

    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        UllDeGat ullDret = renat.getUllDret();
         UllDeGat ullEsquerre = renat.getUllEsquerre();
         System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().esObert(),
            renat.getUllEsquerre().esObert());
      renat.seu();
       System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().esObert(),
            renat.getUllEsquerre().esObert());
      renat.aixecat();
      System.out.printf("Quan està %s: %b + %b%n",
            renat.getPosicio(),
            renat.getUllDret().esObert(),
            renat.getUllEsquerre().esObert());
    }
}
