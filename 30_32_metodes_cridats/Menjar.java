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
public class Menjar {
    private static final String MENJAR_PER_DEFECTE = "sardines";
    private final String nom;
    public Menjar(String nom) {
        if (nom != null && !nom.isEmpty()) {
            this.nom = nom;
        } else {
            this.nom = MENJAR_PER_DEFECTE;
        }
        System.out.println("Neix Menjar(\"" + this.nom + "\")");
    }
    public String toString() { return nom; }
}
