package mx.edu.utez.modules.persona;

import mx.edu.utez.modules.escuela.Materia;
import mx.edu.utez.modules.escuela.Salon;

public class Profesor extends Persona {
    private String email;
    private Materia[] materias;
    private double sueldo;
    private Salon[] salones;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad,
            String direccion,
            String nacionalidad, String telefono, String email, Materia[] materias, double sueldo, Salon[] salones) {
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

    public Materia[] getMaterias() {
        return materias;
    }

    public void setMaterias(Materia[] materias) {
        this.materias = materias;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public Salon[] getSalones() {
        return salones;
    }

    public void setSalones(Salon[] salones) {
        this.salones = salones;
    }

    // @TODO: Moficiar metodos en diagrama
    public void recibirPago() {
    }

    public void registrarCalificacion() {
    }

    public void modificarCalificacion() {
    }
}
