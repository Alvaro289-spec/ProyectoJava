import java.util.Scanner;

public class Ejercicio6 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int cambio, monedas10, monedas1;
        System.out.print("Ingrese la cantidad entera de cambio en pesos: ");
        cambio = sc.nextInt();
        monedas10 = cambio / 10;
        monedas1 = cambio % 10;
        System.out.println("Monedas de $10: " + monedas10);
        System.out.println("Monedas de $1: " + monedas1);
    }
}