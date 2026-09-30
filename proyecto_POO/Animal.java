public class Animal{
    protected String Nombre;
    protected int Edad;

    public Animal(String nombre, int edad){
        this.Nombre = nombre;
        this.Edad = edad;
    }

     public void comer() {
        System.out.println(Nombre + " está comiendo.");
    }

    public void hacerSonido() {
        System.out.println(Nombre + " hace un sonido genérico.");
    }
}