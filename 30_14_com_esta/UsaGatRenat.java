/*
boolean esViu() // cert si encara li queda alguna vida

boolean esDret(), boolean esAssegut(), boolean esEstirat()
D'acord, no és massa creïble que el Renat pugui estar a l'hora dret i mort. Ho deixarem així de moment en favor de la simplicitat. Se t'acut, però, com podríem arreglar aquesta situació?
*/

public class UsaGatRenat {
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println("Inicialment renat.esViu(): " + renat.esViu());
        System.out.println("Inicialment renat.esDret(): " + renat.esDret());
        System.out.println("Inicialment renat.esAssegut(): " + renat.esAssegut());
        System.out.println("Inicialment renat.esEstirat(): " + renat.esEstirat());
        System.out.println("Introdueix quantes vides:");
        renat.setVides(Integer.parseInt(Entrada.readLine()));
        System.out.println("Introdueix nova posició:");
        renat.setPosicio(Entrada.readLine());
        System.out.println("Finalment renat.esViu(): " + renat.esViu());
        System.out.println("Finalment renat.esDret(): " + renat.esDret());
        System.out.println("Finalment renat.esAssegut(): " + renat.esAssegut());
        System.out.println("Finalment renat.esEstirat(): " + renat.esEstirat());
    }
}
