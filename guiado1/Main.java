
public class Main {

    public static void main(String[] args) {


        Dispositivo dispositivo1 = new Dispositivo();
        Dispositivo dispositivo2 = new Dispositivo();


        dispositivo1.nombre = "Teclado";
        dispositivo1.tipo = "Entrada";
        dispositivo1.activo = true;


        dispositivo2.nombre = "Monitor";
        dispositivo2.tipo = "Salida";
        dispositivo2.activo = false;


        System.out.println("=== DISPOSITIVO 1 ===");
        dispositivo1.mostrarInformacion();
        dispositivo1.mostrarEstado();

        System.out.println();


        System.out.println("=== DISPOSITIVO 2 ===");
        dispositivo2.mostrarInformacion();
        dispositivo2.mostrarEstado();

        System.out.println();


        dispositivo2.activar();

        
        dispositivo2.mostrarEstado();
    }
}
