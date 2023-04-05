package mx.edu.utez.modules.persona;

public class Persona {
    protected String nombre;
    protected String apellidoPaterno;
    protected String apellidoMaterno;
    protected char sexo;
    protected int edad;
    protected String direccion;
    protected String nacionalidad;
    protected String telefono;

    public Persona() {
    }

    public Persona(String nombre, String apellidoPaterno, String apellidoMaterno, char sexo, int edad, String direccion,
            String nacionalidad, String telefono) {
        this.nombre = nombre;
        this.apellidoPaterno = apellidoPaterno;
        this.apellidoMaterno = apellidoMaterno;
        this.sexo = sexo;
        this.edad = edad;
        this.direccion = direccion;
        this.nacionalidad = nacionalidad;
        this.telefono = telefono;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellidoPaterno() {
        return apellidoPaterno;
    }

    public void setApellidoPaterno(String apellidoPaterno) {
        this.apellidoPaterno = apellidoPaterno;
    }

    public String getApellidoMaterno() {
        return apellidoMaterno;
    }

    public void setApellidoMaterno(String apellidoMaterno) {
        this.apellidoMaterno = apellidoMaterno;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getNacionalidad() {
        return nacionalidad;
    }

    public void setNacionalidad(String nacionalidad) {
        this.nacionalidad = nacionalidad;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void ver() {
        System.out.println(nombre + "esta viendo");
    }

    public void caminar() {
        System.out.println(nombre + "esta caminando");
    }

    public void preguntar() {
        System.out.println(nombre + "esta preguntando");
    }

    public void comer() {
        System.out.println(nombre + "esta comiendo");
    }

    public void escribir() {
        System.out.println(nombre + "esta escribiendo");
    }
}
