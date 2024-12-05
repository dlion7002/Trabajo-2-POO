import java.util.Scanner;

public class Propuesto22 {
    public static void main(String[] args) {
      Scanner sc = new Scanner(System.in);
      System.out.println("Ingrese el nombre del trabajador: ");
      String nombre = sc.nextLine();
      System.out.println("Ingrese el salario por hora: ");
      int salarioHora = sc.nextInt();
      System.out.println("Ingrese las horas trabajadas: ");
      int horas = sc.nextInt();
      
     if ((horas * salarioHora) <= 450000) {
       System.out.println("El trajabador se llama: " + nombre);
     } else {
       System.out.println("El trajabador se llama " + nombre + " y su salario mensual es: " + (horas * salarioHora));
     }
  }
}