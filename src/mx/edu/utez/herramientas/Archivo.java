package mx.edu.utez.herramientas;

import java.io.FileWriter;
import java.io.IOException;
import mx.edu.utez.modules.persona.*;

public class Archivo {

    public static void mensajeAltaEstu(String nombreArchivo, Alumno alumno) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
            escritor.write("Universidad Técnologica Emiliano Zapata"
                    + "\nFICHA DE ESTUDIANTE"
                    + "\nInformación del estudiante:"
                    + "\n" + alumno);
            escritor.close();
            System.out.println("Se ha generado tu inscripción correctamente, el nombre del archivo es:  " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrio un error al generar la ficha de inscripción");
            e.printStackTrace();
        }
    }

    public static void mensajeAltaProf(String nombreArchivo, Profesor profesor) {
        try {
            FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
            escritor.write("Universidad Técnologica Emiliano Zapata"
                    + "\nFICHA DE PROFESOR"
                    + "\nInformación del profesor:"
                    + "\n" + profesor);
            escritor.close();
            System.out.println("Se ha generado tu inscripción correctamente, el nombre del archivo es:  " + nombreArchivo);
        } catch (IOException e) {
            System.out.println("Ocurrio un error al generar la ficha de inscripción");
            e.printStackTrace();
        }
    }

    public static void mensajeBaja(String nombreArchivo, Alumno alumno) {
        try {
            FileReader lector = new FileReader(nombreArchivo + ".txt");
            BufferedReader buffer = new BufferedReader(lector);
            StringBuilder contenido = new StringBuilder();
            String linea;
            boolean encontrar = false;
            while ((linea = buffer.readLine()) != null) {
                if (linea.contains(alumno.getMatricula())) {
                    encontrar = true;
                } else {
                    contenido.append(linea).append("\n");
                }
            }
            buffer.close();
            lector.close();
            if (encontrar) {
                FileWriter escritor = new FileWriter(nombreArchivo + ".txt");
                escritor.write(contenido.toString());
                escritor.close();
                System.out.println("Se ha dado de baja al usuario con Matricula " + alumno.getMatricula());
            } else {
                System.out.println("No se encontró al usuario con número de control " + alumno.getMatricula());
            }
        } catch (IOException e) {
            System.out.println("Ocurrio un error al dar de baja al usuario");
            e.printStackTrace();
        }
    }

}
