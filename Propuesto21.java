import java.util.Scanner;
public class Propuesto21 {
    
    public static void main(String[] args) {

        double lado1;
        double lado2;
        double lado3;
        double perimetro;
        double semiperímetro;
        double area;

        System.out.println("Ingrese la longitud del lado 1: ");
        Scanner lados1 = new Scanner(System.in);
        lado1 = lados1.nextDouble();

        System.out.println("Ingrese la longitud del lado 2: ");
        Scanner lados2 = new Scanner(System.in);
        lado2 = lados2.nextDouble();

        System.out.println("Ingrese la longitud del lado 3: ");
        Scanner lados3 = new Scanner(System.in);
        lado3 = lados3.nextDouble();

        perimetro = lado1 + lado2 + lado3;
        semiperímetro = (lado1 + lado2 + lado3)/2;
        area = Math.sqrt(semiperímetro*(semiperímetro-lado1)*(semiperímetro-lado2)*(semiperímetro-lado3));

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Semiperimetro: " + semiperímetro);
        System.out.println("area: " + area);

    }
}
