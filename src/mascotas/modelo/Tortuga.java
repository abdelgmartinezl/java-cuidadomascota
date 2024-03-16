package mascotas.modelo;

public class Tortuga extends Mascota {
    public Tortuga(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void alimentar() {
        System.out.println(get_nombre() + ", la tortuga, come lechuga.");
    }

    @Override
    public void jugar() {
        System.out.println(get_nombre() + ", la tortuga, practica kungfu.");
    }

    @Override
    public void dormir() {
        System.out.println(get_nombre() + ", la tortuga, duerme en la cocina.");
    }
}
