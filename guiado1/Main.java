
public class Main {

    public static void main(String[] args) {

        System.out.println("Total inicial: "
                + Dispositivo.getTotalCreados());


        Dispositivo dispositivo1 =
                new Dispositivo("Teclado", "Entrada");

        Dispositivo dispositivo2 =
                new Dispositivo("Monitor", "Salida");

        Dispositivo dispositivo3 =
                new Dispositivo("Laptop", "Computadora");

        System.out.println();

        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarInformacion();

        System.out.println();

        System.out.println("=== DISPOSITIVO 2 ===");
        dispositivo2.mostrarInformacion();

        System.out.println();

        System.out.println("=== DISPOSITIVO 3 ===");
        dispositivo3.mostrarInformacion();

        System.out.println();


        System.out.println("Total de dispositivos creados: "
                + Dispositivo.getTotalCreados());

        System.out.println();


        dispositivo1.setNombre("Laptop Gamer");
        dispositivo1.setTipo("Computadora portatil");


        dispositivo1.setNombre("");

        System.out.println();
        System.out.println("=== DATOS MODIFICADOS ===");
        dispositivo1.mostrarInformacion();

        System.out.println();


        dispositivo1.activar();
        dispositivo2.activar();
        dispositivo2.desactivar();

        System.out.println();


        dispositivo1.mostrarEstado();
        dispositivo2.mostrarEstado();
        dispositivo3.mostrarEstado();

        System.out.println();


        System.out.println("=== IDENTIFICADORES ===");
        System.out.println("Dispositivo 1: " + dispositivo1.getId());
        System.out.println("Dispositivo 2: " + dispositivo2.getId());
        System.out.println("Dispositivo 3: " + dispositivo3.getId());


        System.out.println("Total final: "
                + Dispositivo.getTotalCreados());
    }
}
