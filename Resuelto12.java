import java.util.Scanner;

public class Resuelto12 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el nombre del trabajador: ");
      String NOM = sc.nextLine();
      System.out.println("Ingrese el número de horas trabajadas: ");
      int NHT = sc.nextInt();
      System.out.println("Ingrese el valor de la hora: ");
      int VHN = sc.nextInt();
      
     if (NHT <= 40) {
       System.out.println("El trajabador " + NOM + " devenegó: $" + 8 * VHN);
     } else if (NHT <= 48) {
       System.out.println("El trajabador " + NOM + " devenegó: $" + (40 * VHN + (NHT - 40) * (VHN * 2)));
     } else {
       System.out.println("El trajabador " + NOM + " devenegó: $" + (40 * VHN + (8) * (VHN * 2) + (NHT - 48) * (VHN * 3)));
     }
  }
}
