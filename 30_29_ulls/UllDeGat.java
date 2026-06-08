/*

Un UllDeGat pot estar obert o tancat i ofereix els mètodes:

obret()

tancat()

boolean esObert()

A banda, ofereix dos constructors, el de per defecte que l'inicialitzarà tancat, i un d'específic que permet indicar si l'ull comença obert (true) o no.
*/

public class UllDeGat {

    private boolean obert = false;

    public UllDeGat() {
        obert = false;
    }

    public UllDeGat(boolean esObert) {
        this.obert = esObert;
    }

    public void obret() {
        this.obert = true;
    }

    public void tancat() {
        this.obert = false;
    }

    public boolean esObert() {
        return obert;
    }
    
}
