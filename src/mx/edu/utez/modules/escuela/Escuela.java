package mx.edu.utez.modules.escuela;

import mx.edu.utez.modules.persona.Alumno;
import mx.edu.utez.modules.persona.Directivo;
import mx.edu.utez.modules.persona.Profesor;

public class Escuela {
    private String nombre;
    private Edificio[] edificios;
    private Alumno[] alumnos;
    private Profesor[] profesores;
    private Directivo[] directivos;
    private String telefono;

    public Escuela() {
    }

    public Escuela(String nombre, Edificio[] edificios, Alumno[] alumnos, Profesor[] profesores, Directivo[] directivos,
            String telefono) {
        this.nombre = nombre;
        this.edificios = edificios;
        this.alumnos = alumnos;
        this.profesores = profesores;
        this.directivos = directivos;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Edificio[] getEdificios() {
        return edificios;
    }

    public void setEdificios(Edificio[] edificios) {
        this.edificios = edificios;
    }

    public Alumno[] getAlumnos() {
        return alumnos;
    }

    public void setAlumnos(Alumno[] alumnos) {
        this.alumnos = alumnos;
    }

    public Profesor[] getProfesores() {
        return profesores;
    }

    public void setProfesores(Profesor[] profesores) {
        this.profesores = profesores;
    }

    public Directivo[] getDirectivos() {
        return directivos;
    }

    public void setDirectivos(Directivo[] directivos) {
        this.directivos = directivos;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

}
