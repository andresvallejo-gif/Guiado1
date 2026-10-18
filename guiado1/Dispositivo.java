
public class Dispositivo {

    // Atributos
    private String nombre;
    private String tipo;
    private boolean activo;


    public Dispositivo() {
    }


    public String getNombre() {
        return nombre;
    }


    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: el nombre no puede estar vacio.");
        }
    }


    public String getTipo() {
        return tipo;
    }


    public void setTipo(String tipo) {
        this.tipo = tipo;
    }


    public boolean isActivo() {
        return activo;
    }


    public void setActivo(boolean activo) {
        this.activo = activo;
    }

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

    public void desactivar() {
        activo = false;
        System.out.println(nombre + " ha sido desactivado.");
    }
}

