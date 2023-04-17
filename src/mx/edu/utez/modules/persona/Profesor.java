package mx.edu.utez.modules.persona;

public class Profesor extends Persona {

    private String email;
    private String[] materias;
    private double sueldo;
    private String[] salones;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad,
            String direccion,
            String nacionalidad, String telefono, String email, String[] materias, double sueldo, String[] salones) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.email = email;
        this.materias = materias;
        this.sueldo = sueldo;
        this.salones = salones;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String[] getMaterias() {
        return materias;
    }

    public void setMaterias(String[] materias) {
        this.materias = materias;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public String[] getSalones() {
        return salones;
    }

    public void setSalones(String[] salones) {
        this.salones = salones;
    }

    // @TODO: Moficiar metodos en diagrama
    public void registrarCalificacion() {
    }
}
