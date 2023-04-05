package mx.edu.utez.modules.persona;

public class Directivo extends Persona {
    private String email;
    private String ubicacion;
    // @TODO: En el diagrama de clases cambiar atributo "tipo" por "puesto"
    private String puesto;
    private double sueldo;

    public Directivo() {
    }

    public Directivo(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad,
            String direccion,
            String nacionalidad, String telefono, String email, String ubicacion, String puesto, double sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.email = email;
        this.ubicacion = ubicacion;
        this.puesto = puesto;
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getUbicacion() {
        return ubicacion;
    }

    public void setUbicacion(String ubicacion) {
        this.ubicacion = ubicacion;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // @TODO: Rellenar método de la clase con lo que debe hacer
    public void informarProblems() {
    }

    /*
     * @TODO:
     * -- Cambiar diagrama de clases con estos nuevos metodos --
     * Crud de alumnos y profesores
     */
    public void consultarAlumno() {
    }

    public void darAltaAlumno() {
    }

    public void actualizarAlumno() {
    }

    public void darBajaAlumno() {
    }

    public void consultarProfesor() {
    }

    public void darAltaProfesor() {
    }

    public void actualizarProfesor() {
    }

    public void darBajaProfesor() {
    }

    // @TODO: Rellenar método de la clase con lo que debe hacer
    public void administrar() {
    }
}
