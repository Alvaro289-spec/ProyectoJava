import java.util.Scanner;
public class Ejercicio1{
    public static void main (String[] args){
        Scanner scanner = new Scanner (System.in);

        System.out.println("Dame el radio de tu cilindro");
        double radio =  scanner.nextDouble();

        System.out.println("Ahora dame la altura");
        double altura = scanner.nextDouble();

        double vol = Math.PI*radio*radio*altura;
        
        System.out.println("EL volumen de tu cilindro es de: " + vol  );
    }
}