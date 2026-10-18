
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

        dispositivo1.setNombre(" Teclado ");
        dispositivo1.setTipo(" Dispositivo de salida ");

        dispositivo1.setNombre("");

        System.out.println();
        System.out.println("=== DESPUES DE MODIFICAR ===");
        System.out.println("Nombre: " + dispositivo1.getNombre());
        System.out.println("Tipo: " + dispositivo1.getTipo());

        System.out.println();

        dispositivo1.activar();
        dispositivo2.activar();
        dispositivo2.desactivar();

        System.out.println();

        dispositivo1.mostrarEstado();
        dispositivo2.mostrarEstado();

        System.out.println();


        System.out.println("=== DATOS FINALES ===");
        System.out.println(dispositivo1.getNombre());
        System.out.println(dispositivo1.getTipo());
        System.out.println(dispositivo1.isActivo());

        System.out.println(dispositivo2.getNombre());
        System.out.println(dispositivo2.getTipo());
        System.out.println(dispositivo2.isActivo());

    }
}
