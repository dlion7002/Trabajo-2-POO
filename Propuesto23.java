import java.util.Scanner;

public class Propuesto23 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la constante a: ");
        double a = sc.nextDouble();
        System.out.println("Ingrese la constante b: ");
        double b = sc.nextDouble();
        System.out.println("Ingrese la constante c: ");
        double c = sc.nextDouble();

        double solu1 = (-b + Math.sqrt(b*b - 4*a*c))/(2*a);
        double solu2 = (-b - Math.sqrt(b*b - 4*a*c))/(2*a);
      
        if (b*b - 4*a*c > 0) {
          System.out.println("La ecuación tiene dos soluciones reales, x1: " + solu1 + " y x2: " + solu2);
        } else if (b*b - 4*a*c == 0) {
          System.out.println("La ecuación tiene una solución real, x: " + solu1);
        } else {
          System.out.println("La ecuación no tiene soluciones reales");
        }
  }
}
