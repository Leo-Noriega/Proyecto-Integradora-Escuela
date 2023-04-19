package mx.edu.utez.herramientas;

import java.io.FileWriter;
import java.io.IOException;
import mx.edu.utez.modules.persona.Alumno;

public class Archivo {

    public static void escribir(String nombreArchivo, String[] mensajes) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
            //
            for (String mensaje : mensajes) {
                escritor.write(mensaje + "\n");
            }
            escritor.close();
            System.out.println("Se ha creado el archivo " + nombreArchivo + " correctamente");
        } catch (IOException e) {
            System.out.println("Ocurrio un error");
            e.printStackTrace();
        }
    }

    public static void mensajeAlta(String nombreArchivo, Alumno alumno) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
            escritor.write("Universidad Técnologica Emiliano Zapata"
                    + "\nFICHA DE INSCRIPCIÓN"
                    + "\nInformación del estudiante:"
                    + "\n" + alumno);
            escritor.close();
            System.out.println("Se ha generado tu inscripción correctamente, el nombre del archivo es:  " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrio un error al generar la ficha de inscripción");
            e.printStackTrace();
        }
    }
}
