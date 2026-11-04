import java.util.Scanner;

public class Ejercicio4 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double t, distancia;
        System.out.print("Ingrese el tiempo en segundos: ");
        t = sc.nextDouble();
        distancia = 9.81 * (t * t) / 2;
        System.out.println("La distancia de caída es: " + distancia);
    }
}