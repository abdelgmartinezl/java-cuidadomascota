package mascotas;

import mascotas.modelo.Mascota;
import mascotas.modelo.Perro;
import mascotas.modelo.Gato;
import mascotas.modelo.Tortuga;
import java.util.Scanner;

public class SimuladorCuidado {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Bienvendo al Cuidador de Mascotas!");

        System.out.print("Introduzca la cantidad de mascotas (hasta 3): ");
        int numMascotas;
        try {
            numMascotas = scanner.nextInt();
            scanner.nextLine();
            if (numMascotas < 1)
                throw new NumberFormatException();
        } catch (Exception e) {
            scanner.nextLine();
            System.out.println("Numero de mascotas invalido. Te vas con 1 mascota...");
            numMascotas = 1;
        }

        Mascota[] mascotas = new Mascota[numMascotas];

        for (int i = 0; i < numMascotas; i++) {
            System.out.println("\nIntroduce el detalle para la Mascota #" + (i + 1));
            System.out.print("Introduce el tipo de mascota (Perro, Gato, Tortuga): ");
            String tipo = scanner.nextLine();
            System.out.print("Introduce el nombre de la mascota: ");
            String nombre = scanner.nextLine();
            System.out.print("Introduce la edad de la mascota: ");
            int edad;
            try {
                edad = scanner.nextInt();
                if (edad < 1)
                    throw new NumberFormatException();
            } catch (Exception e) {
                System.out.println("Edad invalida. Te vas con 1 año...");
                edad = 1;
            }
            scanner.nextLine();

            switch(tipo.toLowerCase()) {
                case "perro":
                    mascotas[i] = new Perro(nombre, edad);
                    break;
                case "gato":
                    mascotas[i] = new Gato(nombre, edad);
                    break;
                case "tortuga":
                    mascotas[i] = new Tortuga(nombre, edad);
                    break;
                default:
                    System.out.println("Tipo de mascota invalida...");
            }
        }

        int accion = 5;
        do {
            System.out.println("\nAcciones del Simulador de Cuidado de Mascotas");
            System.out.println("=============================================");
            System.out.println("1. Alimentar");
            System.out.println("2. Jugar");
            System.out.println("3. Dormir");
            System.out.println("4. Ladrar (si es un Perro)");
            System.out.println("4. Maullar (si es un Gato)");
            System.out.println("5. Salir");

            System.out.print("\nIntroduce el numero de la accion: ");
            try {
                accion = scanner.nextInt();
                scanner.nextLine();
            } catch (Exception e) {
                System.out.println("Opcion invalida");
                accion = 100;
                scanner.nextLine();
            }

            for (Mascota mascota : mascotas) {
                if (mascota == null) continue;
                switch (accion) {
                    case 1:
                        mascota.alimentar();
                        break;
                    case 2:
                        mascota.jugar();
                        break;
                    case 3:
                        mascota.dormir();
                        break;
                    case 4:
                        if (mascota instanceof Perro) {
                            ((Perro) mascota).ladrar();
                        } else if (mascota instanceof Gato) {
                            ((Gato) mascota).maullar();
                        } else {
                            System.out.println("Esta accion es solo para perros o gatos.");
                        }
                        break;
                    case 5:
                        System.out.println("Ciao!");
                        break;
                    default:
                        System.out.println("Numero de accion invalida");
                }
            }
        } while (accion != 5);

        scanner.close();
    }
}
