package mx.edu.utez.modules.persona;

import java.util.ArrayList;
import java.util.List;

public class Directivo extends Persona {

    private String email;
    private String ubicacion;
    // @TODO: En el diagrama de clases cambiar atributo "tipo" por "puesto"
    private String puesto;
    private double sueldo;
    private List<Alumno> alumnos = new ArrayList<>();
    private List<Profesor> profesores = new ArrayList<>();
    private List<Personal> personalE = new ArrayList<>();

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
    public void añadirAlumnosL(Alumno alumno) {
        alumnos.add(alumno);
    }

    public void añadirProfesores(Profesor profesor) {
        profesores.add(profesor);
    }

    public void añadirPersonalL(Personal personal) {
        personalE.add(personal);
    }

    public String imprimirAlumnos() {
        String output = "";
        for (Alumno alumno : alumnos) {
            output += alumno.toString() + "\n";
        }
        return output;
    }

    public String imprimirProfesores() {
        String output = "";
        for (Profesor profesor : profesores) {
            output += profesor.toString() + "\n";
        }
        return output;
    }

    public String imprimirPersonal() {
        String output = "";
        for (Personal personal : personalE) {
            output += personal.toString() + "\n";
        }
        return output;
    }

    public void consultarAlumnos(String matricula) {
        for (Alumno alumno : alumnos) {
            if (alumno.getMatricula().equals(matricula)) {
                System.out.println(alumno);
                return;
            }
        }
        System.out.println("No se encontró al alumno con el nombre proporcionado.");
    }

    public void darAltaAlumno(Alumno alumno) {
        alumnos.add(alumno);
        System.out.println("Se ha dado de alta al alumno exitosamente.");
    }

    public void actualizarAlumno(String matricula, Alumno alumno) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alm = alumnos.get(i);
            if (alm.getMatricula().equals(matricula)) {
                alumnos.set(i, alumno);
                System.out.println("Se ha actualizado al alumno exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró al alumno con la matricula proporcionada.");
    }

    public void darBajaAlumno(String matricula) {
        for (int i = 0; i < alumnos.size(); i++) {
            Alumno alumno = alumnos.get(i);
            if (alumno.getMatricula().equals(matricula)) {
                alumnos.remove(i);
                System.out.println("Se ha dado de baja al alumno exitosamente.");
                return;
            }
        }
    }

    public void consultarProfesor(String nombre) {
        for (Profesor profesor : profesores) {
            if (profesor.getNombre().equals(nombre)) {
                System.out.println(profesor);
                return;
            }
        }
        System.out.println("No se encontró al profesor con el nombre proporcionado.");
    }

    public void darAltaProfesor(Profesor profesor) {
        profesores.add(profesor);
        System.out.println("Se ha dado de alta al profesor exitosamente.");
    }

    public void actualizarProfesor(String nombre, Profesor profesor) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor prf = profesores.get(i);
            if (prf.getNombre().equals(nombre)) {
                profesores.set(i, profesor);
                System.out.println("Se ha actualizado al profesor exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró al profesor con el nombre proporcionado.");
    }

    public void darBajaProfesor(String nombre) {
        for (int i = 0; i < profesores.size(); i++) {
            Profesor profesor = profesores.get(i);
            if (profesor.getNombre().equals(nombre)) {
                profesores.remove(i);
                System.out.println("Se ha dado de baja al profesor exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró al profesor con el nombre proporcionado.");
    }

    //PERSONAL
    public void consultarPersonal(String nombre) {
        for (Personal personal : personalE) {
            if (personal.getNombre().equals(nombre)) {
                System.out.println(personal);
                return;
            }
        }
        System.out.println("No se encontró el personal con el nombre proporcionado.");
    }

    public void darAltaPersonal(Personal personal) {
        personalE.add(personal);
        System.out.println("Se ha dado de alta al personal exitosamente.");
    }

    public void actualizarPersonal(String nombre, Personal personal) {
        for (int i = 0; i < personalE.size(); i++) {
            Personal per = personalE.get(i);
            if (per.getNombre().equals(nombre)) {
                personalE.set(i, personal);
                System.out.println("Se ha actualizado al personal exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró al profesor con el nombre proporcionado.");
    }

    public void darBajaPersonal(String nombre) {
        for (int i = 0; i < personalE.size(); i++) {
            Personal personal = personalE.get(i);
            if (personal.getNombre().equals(nombre)) {
                personalE.remove(i);
                System.out.println("Se ha dado de baja al personal exitosamente.");
                return;
            }
        }
        System.out.println("No se encontró al personal con el nombre proporcionado.");
    }

}
