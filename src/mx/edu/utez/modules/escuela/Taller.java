package mx.edu.utez.modules.escuela;

public class Taller {
    private String nombre;
    private double costo;
    private String maestro;
    private Salon salon;

    public Taller() {
    }

    public Taller(String nombre, double costo, String maestro, Salon salon) {
        this.nombre = nombre;
        this.costo = costo;
        this.maestro = maestro;
        this.salon = salon;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public double getCosto() {
        return costo;
    }

    public void setCosto(double costo) {
        this.costo = costo;
    }

    public String getMaestro() {
        return maestro;
    }

    public void setMaestro(String maestro) {
        this.maestro = maestro;
    }

    public Salon getSalon() {
        return salon;
    }

    public void setSalon(Salon salon) {
        this.salon = salon;
    }
}
