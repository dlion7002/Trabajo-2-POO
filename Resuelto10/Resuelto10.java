package Resuelto10;
import java.util.Scanner;

public class Resuelto10 {
        public static void main(String[] args) {
        double patrimonio;
        double pagmat;
        int ni;
        int est;
        String nombre, apellido;

        Scanner sc = new Scanner(System.in);

        System.out.println("Ingrese el nombre: ");
        nombre = sc.nextLine();

        System.out.println("Ingrese el apellido: ");
        apellido = sc.nextLine();

        System.out.println("Ingrese el valor del nivel: ");
        ni = sc.nextInt();

        System.out.println("Ingrese el valor del estrato: ");
        est = sc.nextInt();

        System.out.println("Ingrese el patrimonio: ");
        patrimonio = sc.nextDouble();

        Estudiante.obtener_pagmat(patrimonio, est);

        System.out.println("El estudiante: " + nombre + " " + apellido + " " + ni + "" + " debe pagar " + Estudiante.obtener_pagmat(patrimonio,est));
        }
}

