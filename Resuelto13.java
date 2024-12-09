import java.util.Scanner;

public class Resuelto13 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese el valor de la compra: ");
        float VALCOMP = sc.nextFloat();
        sc.nextLine(); // Consumir el salto de línea después del número
        System.out.println("Ingrese el color de la bolita: ");
        String COLOR = sc.nextLine().toUpperCase().intern(); // Convertir a mayúsculas y usar intern para comparar referencias

        float descuento;

        if (COLOR == "BLANCO") {
            descuento = 0;
        } else if (COLOR == "VERDE") {
            descuento = 10;
        } else if (COLOR == "AMARILLO") {
            descuento = 25;
        } else if (COLOR == "AZUL") {
            descuento = 50;
        } else {
            descuento = 100;
        }

        float totalPagar = VALCOMP * (1 - (descuento / 100));
        System.out.println(descuento + "% $" + totalPagar);
    }
}

