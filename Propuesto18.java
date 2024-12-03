public class Propuesto18 {
    
    public static void main(String[] args) {
        
        int codigo_empleado;
        String nombre_empleado;
        double numero_horas_trab_mes;
        double valor_hora;
        int retencion_fuente;
        double porcentaje_ret;
        double salario_bruto;
        double salario_neto;


        codigo_empleado = 1000414715;
        nombre_empleado = "David Gonzalez";
        numero_horas_trab_mes = 40;
        valor_hora = 90000;
        retencion_fuente = 10;
        porcentaje_ret = retencion_fuente/100;
        salario_bruto = numero_horas_trab_mes*valor_hora;
        salario_neto = salario_bruto - porcentaje_ret;

        System.out.println("Codigo: " + codigo_empleado);
        System.out.println("Nombre: " + nombre_empleado);
        System.out.println("Salario neto: " + salario_neto);
        System.out.println("Salario bruto: " + salario_bruto);
    }
}
