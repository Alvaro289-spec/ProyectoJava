import java.util.Scanner;

public class Ejercicio9 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int totalHoras, dias, horasSobrantes;
        System.out.print("Ingrese el total de horas: ");
        totalHoras = sc.nextInt();
        dias = totalHoras / 24;
        horasSobrantes = totalHoras % 24;
        System.out.println("Días completos: " + dias);
        System.out.println("Horas sobrantes: " + horasSobrantes);
    }
}