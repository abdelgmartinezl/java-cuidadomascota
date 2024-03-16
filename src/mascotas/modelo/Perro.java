package mascotas.modelo;

public class Perro extends Mascota {
    public Perro(String nombre, int edad) {
        super(nombre, edad);
    }

    @Override
    public void alimentar() {
        System.out.println(get_nombre() + ", el perro, come feliz.");
    }

    @Override
    public void jugar() {
        System.out.println(get_nombre() + ", el perro, busca la pelota.");
    }

    @Override
    public void dormir() {
        System.out.println(get_nombre() + ", el perro, duerme en el patio.");
    }

    public void ladrar() {
        System.out.println(get_nombre() + ", el perro, dice: Guau! Guau!");
    }
}
