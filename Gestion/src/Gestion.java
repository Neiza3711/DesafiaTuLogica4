import java.util.Scanner;

// Clase Piloto
class Piloto {
    private int idPiloto;
    private String nomPiloto;
    private int horasVueloPiloto;
    private String rangoPiloto;

    // Constructor
    public Piloto(int idPiloto, String nomPiloto, int horasVueloPiloto, String rangoPiloto) {
        this.idPiloto = idPiloto;
        this.nomPiloto = nomPiloto;
        this.horasVueloPiloto = horasVueloPiloto;
        this.rangoPiloto = rangoPiloto;
    }

    // Método para mostrar la información del piloto
    public void mostrarPiloto() {
        System.out.println("ID: " + idPiloto + ", Nombre: " + nomPiloto + ", Horas de vuelo: " + horasVueloPiloto + ", Rango: " + rangoPiloto);
    }
}

// Clase Avión
class Avion {
    private int idAvion;
    private String modAvion;
    private int capAvion;
    private Piloto piloto;

    // Constructor
    public Avion(int idAvion, String modAvion, int capAvion, Piloto piloto) {
        this.idAvion = idAvion;
        this.modAvion = modAvion;
        this.capAvion = capAvion;
        this.piloto = piloto;
    }

    // Método para mostrar la información del avión y del piloto asignado
    public void mostrarAvion() {
        System.out.println("ID: " + idAvion + ", Modelo: " + modAvion + ", Capacidad: " + capAvion);
        piloto.mostrarPiloto();
    }
}

// Clase Gestion
public class Gestion {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Crear pilotos
        Piloto maverick = new Piloto(1, "Pete Maverick", 10000, "Capitán");
        Piloto phoenix = new Piloto(2, "Natasha Phoenix", 3000, "Teniente");
        Piloto rooster = new Piloto(3, "Bradley Rooster", 3500, "Teniente");

        // Mostrar información de algunos pilotos
        System.out.println("\nInformación del piloto Maverick:");
        maverick.mostrarPiloto();
        System.out.println("\nInformación del piloto Rooster:");
        rooster.mostrarPiloto();

        // Solicitar datos de pilotos al usuario
        System.out.println("\nIntroduce los datos para dos nuevos pilotos:");

        Piloto piloto4 = crearPilotoDesdeEntrada(scanner);
        Piloto piloto5 = crearPilotoDesdeEntrada(scanner);

        // Mostrar información de los pilotos introducidos por el usuario
        System.out.println("\nInformación del piloto introducido por el usuario 1:");
        piloto4.mostrarPiloto();
        System.out.println("\nInformación del piloto introducido por el usuario 2:");
        piloto5.mostrarPiloto();
    }

    // Método para crear un piloto a partir de la entrada del usuario
    public static Piloto crearPilotoDesdeEntrada(Scanner scanner) {
        System.out.print("ID del piloto: ");
        int id = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Nombre del piloto: ");
        String nombre = scanner.nextLine();
        System.out.print("Horas de vuelo del piloto: ");
        int horasVuelo = scanner.nextInt();
        scanner.nextLine(); // Consumir el salto de línea pendiente
        System.out.print("Rango del piloto: ");
        String rango = scanner.nextLine();

        return new Piloto(id, nombre, horasVuelo, rango);
    }
}
