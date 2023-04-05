package mx.edu.utez.modules.escuela;

import mx.edu.utez.modules.persona.Profesor;

public class Materia {
    // @TODO: Modificar atributos del diagrama
    private String nombre;
    private Profesor[] profesor;

    public Materia() {
    }

    public Materia(String nombre, Profesor[] profesor) {
        this.nombre = nombre;
        this.profesor = profesor;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Profesor[] getProfesor() {
        return profesor;
    }

    public void setProfesor(Profesor[] profesor) {
        this.profesor = profesor;
    }
}
