package musica;

/**
 *
 * @author a
 */
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Musica {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        List<Cancion> canciones = new ArrayList<>(); 
        canciones.add(new Cancion("A", "1", true, false, 180));
        canciones.add(new Cancion("B", "2", false, true, 240));
        canciones.add(new Cancion("C", "3", true, true, 200));

        int opcion;

        do {
            System.out.println("   MENÚ");
            System.out.println("..............");
            System.out.println("1. Mostrar detalles de canción");
            System.out.println("2. Salir");
            opcion = scanner.nextInt();

            switch (opcion) {
                case 1:
                    System.out.println("Lista de canciones disponibles:");
                    for (int i = 0; i < canciones.size(); i++) {
                        System.out.println((i + 1) + ". " + canciones.get(i).mostrarDetalles());
                    }
                    System.out.println("Ingrese el número de la canción que desea ver:");
                    int numeroCancion = scanner.nextInt();
                    if (numeroCancion >= 1 && numeroCancion <= canciones.size()) {
                        Cancion cancionSeleccionada = canciones.get(numeroCancion - 1);
                        System.out.println("Detalles de la canción " + numeroCancion + ":");
                        System.out.println(cancionSeleccionada.mostrarDetalles());
                    } else {
                        System.out.println("Número de canción no válido.");
                    }
                    break;
                case 2:
                    System.out.println("Saliendo del programa.");
                    break;
                default:
                    System.out.println("Opción inválida");
            }
        } while (opcion != 2);
    }
}
