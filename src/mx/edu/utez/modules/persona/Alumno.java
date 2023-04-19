package mx.edu.utez.modules.persona;

public class Alumno extends Persona {

    private String matricula;
    private String correoInstitucional;
    // @TODO: Modificar en el diagrama de classses Calificaciones[] por un String[]
    private String[] calificaciones;
    // @TODO: Modificar en el diagrama de clases String a char y borrar "Horario"
    private char grado;

    public Alumno() {
    }

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion,
            String nacionalidad, String telefono, String matricula, String correoInstitucional, String[] calificaciones,
            char grado) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.matricula = matricula;
        this.correoInstitucional = correoInstitucional;
        this.calificaciones = calificaciones;
        this.grado = grado;
    }

    public Alumno(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion,
            String nacionalidad, String telefono, String matricula, String correoInstitucional, char grado) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.matricula = matricula;
        this.correoInstitucional = correoInstitucional;
        this.grado = grado;
    }

    public String getMatricula() {
        return matricula;
    }

    public void setMatricula(String matricula) {
        this.matricula = matricula;
    }

    public String getCorreoInstitucional() {
        return correoInstitucional;
    }

    public void setCorreoInstitucional(String correoInstitucional) {
        this.correoInstitucional = correoInstitucional;
    }

    public void setCalificaciones(String[] calificaciones) {
        this.calificaciones = calificaciones;
    }

    public String[] getCalificaciones() {
        return calificaciones;
    }

    public char getGrado() {
        return grado;
    }

    public void setGrado(char grado) {
        this.grado = grado;
    }

    /*
     * @TODO: Borrar métodos del diagrama de clases y añadir los nuevos
     * Asistir a clases
     * Poner Atencion
     * Hacer Tareas
     * Entregar Tareas
     */
    public String[] consultarCalificaciones() {
        return calificaciones;
    }

    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", correoInstitucional=" + correoInstitucional + ", calificaciones=" + calificaciones + ", grado=" + grado + '}';
    }
    
}
