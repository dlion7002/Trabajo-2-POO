import java.util.Scanner;

public class Resuelto11 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el numero1: ");
        double N1 = sc.nextDouble();
        System.out.println("Ingrese el numero2: ");
        double N2 = sc.nextDouble();
        System.out.println("Ingrese el numero3: ");
        double N3 = sc.nextDouble();

        double MAYOR; // Declare MAYOR outside the if-else blocks

        if (N1 > N2 && N1 > N3) {
            MAYOR = N1;
        } else if (N2 > N3 && N2 > N1) {
            MAYOR = N2;
        } else {
            MAYOR = N3;
        }

        System.out.println("El mayor valor entre: " + N1 + ", " + N2 + " y " + N3 + " es: " + MAYOR);

    }
}
