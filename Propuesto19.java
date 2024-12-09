import java.util.Scanner;
public class Propuesto19 {
    public static void main(String[] args) {

        double long_lado;
        double perimetro;
        double altura;
        double area;

        System.out.println("Ingrese la longitud de los lados: ");
        Scanner lados = new Scanner(System.in);
        long_lado = lados.nextDouble();

        perimetro = 3*long_lado;
        altura = (Math.sqrt(3)*long_lado)/2;
        area = (Math.sqrt(3)*(long_lado*long_lado))/4;

        System.out.println("Perimetro: " + perimetro);
        System.out.println("Altura: " + altura);
        System.out.println("area: " + area);


    }
}
