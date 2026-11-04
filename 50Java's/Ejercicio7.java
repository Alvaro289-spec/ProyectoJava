import java.util.Scanner;

public class Ejercicio7 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        double examenes, tareas, proyecto, calificacionFinal;
        System.out.print("Ingrese la nota de Exámenes: ");
        examenes = sc.nextDouble();
        System.out.print("Ingrese la nota de Tareas: ");
        tareas = sc.nextDouble();
        System.out.print("Ingrese la nota de Proyecto: ");
        proyecto = sc.nextDouble();
        calificacionFinal = examenes * 0.40 + tareas * 0.30 + proyecto * 0.30;
        System.out.println("La calificación final es: " + calificacionFinal);
    }
}