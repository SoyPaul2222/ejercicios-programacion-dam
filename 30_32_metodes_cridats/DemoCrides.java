/*
blic Gat() {
        System.out.println("Neix Gat");
    }
    public void miola() {
        System.out.println("Gat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Gat menja " + menjar + " des de " + this.getClass());
        super.menja(men
*/

public class DemoCrides {
    public static void main(String[] args) {
        Feli feli = new Feli();
        Gat gat = new Gat();
        GatRenat gatRenat = new GatRenat();

        feli.netejaUrpes();
        gat.netejaUrpes();
        gatRenat.netejaUrpes();
        gat.miola();
        gatRenat.miola();
        
        Menjar menjar = new Menjar("bacallà");
        gatRenat.menja(menjar);
    }
}
