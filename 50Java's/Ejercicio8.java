import java.util.Scanner;

public class Ejercicio8 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double km, litros, rendimiento;
        System.out.print("Ingrese los kilómetros recorridos: ");
        km = sc.nextDouble();
        System.out.print("Ingresa los litros de gasolina consumidos: ");
        litros = sc.nextDouble();
        rendimiento = km / litros;
        System.out.println("El rendimiento es: " + rendimiento + " km/l");
    }
}