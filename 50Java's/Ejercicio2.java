import java.util.Scanner;

public class Ejercicio2 {
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dame una cantidad en dolares");
        double dolar = scanner.nextDouble();

        System.out.println("Cual e el tipo de cambio a pesos");
        double pesos = scanner.nextDouble();

        System.out.println("De cuanto es la comicion?");
        double comicion = scanner.nextDouble();

        double total = pesos * (comicion / 100);
        double total2 = pesos - total;

        System.out.println("El total es de: " + total2);
    }
}
