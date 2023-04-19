package mx.edu.utez.modules.persona;

import java.util.Random;

public class Alumno extends Persona {

    private String matricula;
    private String correoInstitucional;
    // @TODO: Modificar en el diagrama de classses Calificaciones[] por un String[]
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
    @Override
    public String toString() {
        return "Alumno{" + "matricula=" + matricula + ", correoInstitucional=" + correoInstitucional + ", calificaciones=" + calificaciones + ", grado=" + grado + '}';
    }

    public void consultarCalificaciones() {
        String[][] arreglo = new String[7][6];
        Random rand = new Random();
        String[] calificaciones = {"  SA    ", "  DE    ", "  AU    "};

        arreglo[0][0] = "  Materias  ";
        arreglo[0][1] = "Unidad 1";
        arreglo[0][2] = "Unidad 2";
        arreglo[0][3] = "Unidad 3";
        arreglo[0][4] = "Unidad 4";
        arreglo[0][5] = "Unidad 5";
        arreglo[1][0] = "Programación";
        arreglo[2][0] = "Matematicas ";
        arreglo[3][0] = "Español     ";
        arreglo[4][0] = "Ingles      ";
        arreglo[5][0] = "Química     ";
        arreglo[6][0] = "Física      ";

        for (int i = 0; i < arreglo.length; i++) {
            for (int j = 0; j < arreglo[i].length; j++) {
                if ((i != 0 || j != 0) && (i != 0 || j != 1)
                        && (i != 0 || j != 2) && (i != 0 || j != 3)
                        && (i != 0 || j != 4) && (i != 0 || j != 5)
                        && (i != 1 || j != 0)
                        && (i != 2 || j != 0) && (i != 3 || j != 0)
                        && (i != 4 || j != 0) && (i != 5 || j != 0)
                        && (i != 6 || j != 0)) {
                    int indiceAleatorio = rand.nextInt(calificaciones.length);
                    arreglo[i][j] = calificaciones[indiceAleatorio];
                }
                System.out.print("| " + arreglo[i][j] + " ");
            }
            System.out.println();
        }
        //return calificaciones;
    }
}
