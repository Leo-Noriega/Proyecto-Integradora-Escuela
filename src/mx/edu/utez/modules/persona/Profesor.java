package mx.edu.utez.modules.persona;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Profesor extends Persona {

    private String email;
    private String materia;
    private double sueldo;
    private String[] horario;

    public Profesor() {
    }

    public Profesor(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad,
            String direccion,
            String nacionalidad, String telefono, String email, String materia, double sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.email = email;
        this.materia = materia;
        this.sueldo = sueldo;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getMateria() {
        return materia;
    }

    public void setMaterias(String materia) {
        this.materia = materia;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // @TODO: Moficiar metodos en diagrama
    public void verHorario() {
        String[][] horario = new String[7][6];
        Random rand = new Random();
        String[] grupo = {"   2B    ", "   3A    ", "   1C    "};

        horario[0][0] = "    Horario     ";
        horario[0][1] = "  Lunes  ";
        horario[0][2] = "  Martes ";
        horario[0][3] = "Miercoles";
        horario[0][4] = "  jueves ";
        horario[0][5] = " Viernes ";
        horario[1][0] = "7:00 - 9:00   am";
        horario[2][0] = "9:00 - 10:00  am";
        horario[3][0] = "10:00 - 11:00 am";
        horario[4][0] = "11:00 - 13:00 pm";
        horario[5][0] = "13:00 - 15:00 am";
        horario[6][0] = "15:00 - 16:00 am";

        for (int i = 0; i < horario.length; i++) {
            for (int j = 0; j < horario[i].length; j++) {
                if ((i != 0 || j != 0) && (i != 0 || j != 1)
                        && (i != 0 || j != 2) && (i != 0 || j != 3)
                        && (i != 0 || j != 4) && (i != 0 || j != 5)
                        && (i != 1 || j != 0) && (i != 2 || j != 0)
                        && (i != 3 || j != 0) && (i != 4 || j != 0)
                        && (i != 5 || j != 0) && (i != 6 || j != 0)) {
                    int indiceAleatorio = rand.nextInt(grupo.length);
                    horario[i][j] = grupo[indiceAleatorio];
                }
                System.out.print("| " + horario[i][j] + " ");
            }
            System.out.println();
        }
    }

    private List<Alumno> alumnos = new ArrayList<>();

    public void añadirAlumnosL(Alumno alumno) {
        alumnos.add(alumno);
    }

    public String imprimirAlumnos() {
        String output = "";
        for (Alumno alumno : alumnos) {
            output += alumno.toString() + "\n";
        }
        return output;
    }

    public String toString() {
        return "========================================================================================="
                + "\nAlumno: " + nombre + " " + apellidoPaterno + " " + apellidoMaterno
                + "\nEdad: " + edad + " Sexo: " + sexo + " Dirección: " + direccion
                + "\nTelefono: " + telefono + " Nacionalidad: " + nacionalidad
                + "\nMateria a Impartir: " + materia + "  Correo Institucional:" + email + "  Sueldo=" + sueldo
                + "\n=========================================================================================";
    }
}
