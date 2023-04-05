package mx.edu.utez.modules.escuela;

public class Edificio {
    private String nombre;
    private String ubicacion;
    private Salon[] salones;

    public Edificio() {
    }

    public Edificio(String nombre, String ubicacion, Salon[] salones) {
        this.nombre = nombre;
        this.ubicacion = ubicacion;
        this.salones = salones;
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

    public Salon[] getSalones() {
        return salones;
    }

    public void setSalones(Salon[] salones) {
        this.salones = salones;
    }
}
