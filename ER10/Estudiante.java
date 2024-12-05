package ER10;

public class Estudiante {
int ni;
int est;
String nombre, apellido;
public static double obtener_pagmat(double patrimonio, double est) {
    double pagmat = 50000;
    if ((patrimonio>2000000) && (est>3)) {
    }
    return pagmat + 0.03*patrimonio;
    }
}