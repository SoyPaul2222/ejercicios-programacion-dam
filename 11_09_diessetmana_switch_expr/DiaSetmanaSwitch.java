/*
* 
/ Programa que mostra el dia de la setmana corresponent a un número (1-7) utilitzant switch
*/

public class DiaSetmanaSwitch {
    public static void main(String[] args) {
        int numeroDia = Integer.parseInt(args[0]);

switch (numeroDia) {
  case 1 -> System.out.println("Dilluns");
  case 2 -> System.out.println("Dimarts");
  case 3 -> System.out.println("Dimecres");
  case 4 -> System.out.println("Dijous");
  case 5 -> System.out.println("Divendres");
  case 6 -> System.out.println("Dissabte");
  case 7 -> System.out.println("Diumenge");
  default -> System.out.println("Error");
    }
   
    }
}
