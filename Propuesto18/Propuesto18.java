package Propuesto18;

import java.util.Scanner;

public class Propuesto18 {
    
    public static void main(String[] args) {
        
        int codigo_empleado;
        String nombre_empleado;
        double num_horas;
        double valor_hora;
        double retencion_fuente;
        double porcentaje_ret;
        double salario_bruto;
        double salario_neto;

        System.out.println("Ingrese el Codigo de empleado: ");
        Scanner codigo = new Scanner(System.in);
        codigo_empleado = codigo.nextInt();
        System.out.println("Ingrese el nombre del empleado: ");
        Scanner nombre = new Scanner(System.in);
        nombre_empleado = nombre.nextLine();
        System.out.println("Ingrese el numero de horas trabajadas al mes: ");
        Scanner entrada = new Scanner(System.in);
        num_horas = entrada.nextDouble();
        System.out.println("Ingrese el valor por hora: ");
        Scanner entrada2 = new Scanner(System.in);
        valor_hora = entrada2.nextDouble();
        retencion_fuente = 10;
        porcentaje_ret = retencion_fuente/100;
        salario_bruto = num_horas*valor_hora;
        salario_neto = salario_bruto - salario_bruto*porcentaje_ret;

        System.out.println("Codigo: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario neto: " + salario_neto);
        System.out.println("Salario bruto: " + salario_bruto);
    }
}
