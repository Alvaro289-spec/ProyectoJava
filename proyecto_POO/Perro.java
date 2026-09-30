public class Perro extends Animal implements Nadador {

    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void hacerSonido() {
        System.out.println(Nombre + " dice: ¡Guau!");
    }

    @Override
    public void nadar() {
        System.out.println(Nombre + " está nadando.");
    }
}