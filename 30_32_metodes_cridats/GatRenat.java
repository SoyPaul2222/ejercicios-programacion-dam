/*
v    public Gat() {
        System.out.println("Neix Gat");
    }
    public void miola() {
        System.out.println("Gat miola des de " + this.getClass());
    }
    @Override
    public void menja(Menjar menjar) {
        System.out.println("Gat menja " + menjar + " des de " + this.getClass());
        super.menja(menjar);
    }
*/

public class GatRenat extends Gat {
    public GatRenat() {
        System.out.println("Neix Renat");
    }
    @Override
    public void miola() {
        System.out.println("Renat miola des de " + this.getClass());
    }

    @Override
    public void menja(Menjar menjar) {
        System.out.println("Renat menja " + menjar + " des de " + this.getClass());
        netejaUrpes();
        super.menja(menjar);
    }
}
