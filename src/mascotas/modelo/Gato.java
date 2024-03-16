package mascotas.modelo;

public class Gato extends Mascota {
    public Gato(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void alimentar() {
        System.out.println(get_nombre() + ", el gato, come enojado.");
    }

    @Override
    public void jugar() {
        System.out.println(get_nombre() + ", el gato, busca el raton de juguete.");
    }

    @Override
    public void dormir() {
        System.out.println(get_nombre() + ", el gato, duerme placidamente.");
    }

    public void maullar() {
        System.out.println(get_nombre() + ", el gato, dice: Miau!");
    }
}
