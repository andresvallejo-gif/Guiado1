
public class Dispositivo {

    // Atributos
    public String nombre;
    String tipo;
    public boolean activo;


    public void mostrarInformacion() {
        System.out.println("Nombre: " + nombre);
        System.out.println("Tipo: " + tipo);
        System.out.println("Activo: " + activo);
    }


    void mostrarEstado() {
        if (activo) {
            System.out.println("El dispositivo está activo.");
        } else {
            System.out.println("El dispositivo está inactivo.");
        }
    }

    public void activar() {
        activo = true;
        System.out.println(nombre + " ha sido activado.");
    }
}

