package mx.edu.utez.modules.escuela;

public class Salon {
    // @TODO: Moficiar atributos del diagrama
    private String nombre;
    private String ubicacion;

    public Salon() {
    }

    public Salon(String nombre, String ubicacion) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }
}
