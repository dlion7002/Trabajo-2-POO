import java.util.Scanner;

public class Resuelto15 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el peso de la esfera A: ");
        double A = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera B: ");
        double B = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera C: ");
        double C = sc.nextDouble();
        System.out.println("Ingrese el peso de la esfera D: ");
        double D = sc.nextDouble();
      
        if (A == B && A == C) {
            if (D > A) {
                System.out.println("La esfera D es diferente y es de mayor peso");
            } else {
                System.out.println("La esfera D es diferente y es de menor peso");
            }
        } else if (A == B && A == D) {
            if (C > A) {
                System.out.println("La esfera C es diferente y es de mayor peso");
            } else {
                System.out.println("La esfera C es diferente y es de menor peso");
            }
        } else if (A == C && A == D) {
            if (B > A) {
                System.out.println("La esfera B es diferente y es de mayor peso");
            } else {
                System.out.println("La esfera B es diferente y es de menor peso");
            }
        } else {
            if (A > B) {
                System.out.println("La esfera A es diferente y es de mayor peso");
            } else {
                System.out.println("La esfera A es diferente y es de menor peso");}
        }
        }

  }

