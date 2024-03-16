package mascotas.modelo;

public abstract class Mascota {
    private String nombre;
    private int edad;

    public Mascota(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String get_nombre(){
        return this.nombre;
    }

    public int get_edad(){
        return this.edad;
    }

    public abstract void alimentar();

    public abstract void jugar();

    public abstract void dormir();
}
