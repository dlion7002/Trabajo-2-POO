import java.util.Scanner;

public class Propuesto24 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el tamaño de la esfera A: ");
        double A = sc.nextDouble();
        System.out.println("Ingrese el tamaño de la esfera B: ");
        double B = sc.nextDouble();
        System.out.println("Ingrese el tamaño de la esfera C: ");
        double C = sc.nextDouble();
      
        if (A > B && A > C) {
          System.out.println("La esfera A es la más grande");
        } else if (B > C && B > A) {
          System.out.println("La esfera B es la más grande");
        } else {
          System.out.println("La esfera C es la más grande");
        }
  }
}
