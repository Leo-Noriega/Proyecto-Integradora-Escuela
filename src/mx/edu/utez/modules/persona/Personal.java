package mx.edu.utez.modules.persona;

public class Personal extends Persona {
    // @TODO: Eliminar "antiguedad" modificar puesto y sueldo
    private String puesto;
    private String horario;
    private double sueldo;

    public Personal() {
    }

    public Personal(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad,
            String direccion,
            String nacionalidad, String telefono, String puesto, String horario, double sueldo) {
        super(nombre, apellidoPaterno, apellidoMaterno, sexo, edad, direccion, nacionalidad, telefono);
        this.puesto = puesto;
        this.horario = horario;
        this.sueldo = sueldo;
    }

    public String getPuesto() {
        return puesto;
    }

    public void setPuesto(String puesto) {
        this.puesto = puesto;
    }

    public String getHorario() {
        return horario;
    }

    public void setHorario(String horario) {
        this.horario = horario;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    public void recibirPago() {
    }
}
