import java.util.Scanner;

public class Resuelto14 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ventas departamento 1: ");
        double vd1 = sc.nextDouble(); 
        System.out.println("Ventas departamento 2: ");
        double vd2 = sc.nextDouble();
        System.out.println("Ventas departamento 3: ");
        double vd3 = sc.nextDouble();
        System.out.println("Salario de los vendedores: ");
        double salar = sc.nextDouble();
        
        double totven = vd1 + vd2 + vd3;
        double porven = totven * 0.33;

        if (vd1 > porven) {
            System.out.println("Salario vendedores depto 1: " + (salar + salar*0.2));
        } else {
            System.out.println("Salario vendedores depto 1: " + salar);
        }

        if (vd2 > porven) {
            System.out.println("Salario vendedores depto 2: " + (salar + salar*0.2));
        } else {
            System.out.println("Salario vendedores depto 2: " + salar);

        }

        if (vd3 > porven) {
            System.out.println("Salario vendedores depto 3: " + (salar + salar*0.2));
        } else {
            System.out.println("Salario vendedores depto 3: " + salar);
        }

  }
}