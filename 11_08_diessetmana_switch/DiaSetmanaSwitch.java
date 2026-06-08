/*
    *Retorna el nom del dia de la setmana segons un número (1-7)
    * Utilitza switch-case. Entrada: número del dia. Sortida: nom del dia o "Error"
*/

public class DiaSetmanaSwitch {
    public static void main(String[] args) {
        int numeroDia = Integer.parseInt(args[0]);

switch (numeroDia) {
  case 1:
    System.out.println("Dilluns");
    break;
  case 2:
    System.out.println("Dimarts");
    break;
  case 3:
    System.out.println("Dimecres");
    break;
  case 4:
    System.out.println("Dijous");
    break;
  case 5:
    System.out.println("Divendres");
    break;
  case 6:
    System.out.println("Dissabte");
    break;
  case 7:
    System.out.println("Diumenge");
    break;
  default:
    System.out.println("Error");
    }
    
    }
}
