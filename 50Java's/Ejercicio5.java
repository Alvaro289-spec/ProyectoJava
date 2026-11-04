import java.util.Scanner;

public class Ejercicio5 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double horas, costoHora, sueldoBruto, retencion, salarioNeto;
        System.out.print("Ingrese las horas trabajadas: ");
        horas = sc.nextDouble();
        System.out.print("Ingrese el costo por hora: ");
        costoHora = sc.nextDouble();
        sueldoBruto = horas * costoHora;
        retencion = sueldoBruto * 0.12;
        salarioNeto = sueldoBruto - retencion - 150;
        System.out.println("Sueldo bruto: " + sueldoBruto);
        System.out.println("Retención: " + retencion);
        System.out.println("Salario neto final: " + salarioNeto);
    }
}