/*
// Programa que simula el moviment d'un ascensor de tres plantes
// Calcula el nou pis segons la posició actual i el botó premut (pujar/baixar)
*/

public class Ascensor {
    public static void main(String [] args) {
        System.out.println("pis?");
        String pis = Entrada.readLine();
        
        System.out.println("botó?");
        String boto = Entrada.readLine();
        
        if (pis.equals("planta baixa")) {
            if(boto.equals("pujar un")) {
                System.out.println("primer pis");
            } else if(boto.equals("pujar dos")) {
                System.out.println("segon pis");
            } else {
                System.out.println("error");
            }
        } else if (pis.equals("primer pis")) {
            if (boto.equals("pujar un")) {
                System.out.println("segon pis");
            } else if (boto.equals("baixar un")) {
                System.out.println("planta baixa");
            } else {
                System.out.println("error");
            }
        } else if (pis.equals("segon pis")) {
            if (boto.equals("baixar un")) {
                System.out.println("primer pis");
            } else if (boto.equals("baixar dos")) {
                System.out.println("planta baixa");
            } else {
                System.out.println("error");
            }
        } else {
            System.out.println("error");
        }
    }
}
