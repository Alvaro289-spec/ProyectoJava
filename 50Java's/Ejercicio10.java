import java.util.Scanner;

public class Ejercicio10 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double a, b, c, areaTotal;
        System.out.print("Ingresa el largo (a): ");
        a = sc.nextDouble();
        System.out.print("Ingressa el ancho (b): ");
        b = sc.nextDouble();
        System.out.print("Ingresa el alto (c): ");
        c = sc.nextDouble();
        areaTotal = 2 * (a * b + a * c + b * c);
        System.out.println("El área total es...: " + areaTotal);
    }
}