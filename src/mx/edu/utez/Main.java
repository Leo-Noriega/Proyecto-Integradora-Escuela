package mx.edu.utez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.edu.utez.herramientas.*;
import mx.edu.utez.modules.persona.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String tipoUsuario;

        do {
            // Menu de para pedir credenciales
            System.out.print("\n* BIENVENIDO AL SISTEMA *"
                    + "\nPor favor, indique si es 'estudiante', 'directivo' o 'Profesor', "
                    + "\nSi desea salir del programa en cualquier momento, escriba salir: ");
            tipoUsuario = sc.nextLine().toLowerCase();

            while (!tipoUsuario.equals("estudiante")
                    && !tipoUsuario.equals("directivo")
                    && !tipoUsuario.equals("profesor")
                    && !tipoUsuario.equals("salir")) {

                System.out.print("Tipo de usuario incorrecto. "
                        + "Por favor, indique si es 'estudiante', 'directivo' o 'Profesor':  ");
                tipoUsuario = sc.nextLine().toLowerCase();
            }

            // Creación de credenciales staticas predeterminadas
            Credenciales credencial = new Credenciales();

            // Llamar metodo para validar credenciales segun corresponda
            if (tipoUsuario.equals("estudiante")) {
                credencial.validarCreedencialesEstu();
                // Creando alumnos predeterminados para sus métodos (5)
                Alumno alumno1 = new Alumno("Juan", "Pérez", "García", 'M', 18, "Calle 123", "Mexicana",
                        "1234567890", "2023tn01", "juanperez@utez.edu.mx", new String[]{"9", "10", "8"}, 'A');
                Alumno alumno2 = new Alumno("María", "Gómez", "Hernández", 'F', 20, "Calle 456", "Mexicana",
                        "0987654321", "2023tn02", "mariagomez@utez.edu.mx", new String[]{"8", "7", "9"}, 'B');
                Alumno alumno3 = new Alumno("Carlos", "Sánchez", "López", 'M', 22, "Calle 789", "Mexicana",
                        "1357902468", "2023tn03", "carlossanchez@utez.edu.mx", new String[]{"10", "10", "10"}, 'C');
                Alumno alumno4 = new Alumno("Ana", "Martínez", "Flores", 'F', 19, "Calle 321", "Mexicana",
                        "2468013579", "2023tn04", "anamartinez@utez.edu.mx", new String[]{"7", "8", "6"}, 'A');
                Alumno alumno5 = new Alumno("Luis", "Hernández", "Castillo", 'M', 21, "Calle 654", "Mexicana",
                        "3692581470", "2023tn05", "luishernandez@utez.edu.mx", new String[]{"9", "7", "8"}, 'B');
                //Creando arraylist y agregando a los alumnos a un ArrayList
                List<Alumno> alumnos = new ArrayList<>();
                alumnos.add(alumno1);
                alumnos.add(alumno2);
                alumnos.add(alumno3);
                alumnos.add(alumno4);
                alumnos.add(alumno5);
                System.out.println("BIENVENIDO: "
                        + "\n¿Qué deseas hacer?"
                        + "\n1.- Solicitar calificaciones"
                        + "\n2.- Darse de baja");
                int decisionA = sc.nextInt();
                sc.nextLine();
                if (decisionA == 1) {
                    //Pidiendo mátricula al usuario para saber su identidad
                    System.out.println("Porfavor, introduce tu matricula:");
                    String matricula = sc.nextLine();
                    for (int i = 0; i < alumnos.size(); i++) {
                        Alumno alumno = alumnos.get(i);
                        if (alumno.getMatricula().equals(matricula)) {
                            for (int j = 0; j < 3; j++) {
                                System.out.println(alumno.getCalificaciones());
                            }
                        }
                    }
                }
                if (decisionA == 2) {
                    //Pidiendo mátricula al usuario para saber su identidad
                    System.out.println("Porfavor, introduce tu matricula:");
                    String matricula = sc.nextLine();
                    for (int i = 0; i < alumnos.size(); i++) {
                        Alumno alumno = alumnos.get(i);
                        if (alumno.getMatricula().equals(matricula)) {
                            alumnos.remove(i);
                            System.out.println("Se ha dado de baja al alumno " + alumno.getNombre() + " " + alumno.getApellidoPaterno() + " exitosamente.");
                            return;
                        }
                    }
                }
            }
            if (tipoUsuario.equals("directivo")) {
                credencial.validarCreedencialesDir();
                if (credencial.getUsuarioDir().equals("pedrorector")) {
                    // Creando directivo para sus métodos
                    Directivo directivo = new Directivo("Pedro", "Ortiz", "Gonzalez", 'H', 45, "Calle Revolución #2",
                            "Mexicano", "555-123-4567", "pedroortiz@utez.edu.mx", "Edificio A, piso 2", "Rector", 100000);
                    System.out.println("Bienvenido " + directivo.getNombre() + " "
                            + directivo.getApellidoPaterno() + " "
                            + directivo.getApellidoMaterno() + "");

                    // Creando alumnos predeterminados para sus métodos (5)
                    Alumno alumno1 = new Alumno("Juan", "Pérez", "García", 'M', 18, "Calle 123", "Mexicana",
                            "1234567890", "2023tn01", "juanperez@utez.edu.mx", new String[]{"9", "10", "8"}, 'A');
                    Alumno alumno2 = new Alumno("María", "Gómez", "Hernández", 'F', 20, "Calle 456", "Mexicana",
                            "0987654321", "2023tn02", "mariagomez@utez.edu.mx", new String[]{"8", "7", "9"}, 'B');
                    Alumno alumno3 = new Alumno("Carlos", "Sánchez", "López", 'M', 22, "Calle 789", "Mexicana",
                            "1357902468", "2023tn03", "carlossanchez@utez.edu.mx", new String[]{"10", "10", "10"}, 'C');
                    Alumno alumno4 = new Alumno("Ana", "Martínez", "Flores", 'F', 19, "Calle 321", "Mexicana",
                            "2468013579", "2023tn04", "anamartinez@utez.edu.mx", new String[]{"7", "8", "6"}, 'A');
                    Alumno alumno5 = new Alumno("Luis", "Hernández", "Castillo", 'M', 21, "Calle 654", "Mexicana",
                            "3692581470", "2023tn05", "luishernandez@utez.edu.mx", new String[]{"9", "7", "8"}, 'B');

                    //Añadiendo alumnos a ArrayList de directivo
                    directivo.añadirAlumnosL(alumno1);
                    directivo.añadirAlumnosL(alumno2);
                    directivo.añadirAlumnosL(alumno3);
                    directivo.añadirAlumnosL(alumno4);
                    directivo.añadirAlumnosL(alumno5);

                    System.out.println("Indica el número según la opción que deseas realizar"
                            + "\n1.- Dar altas"
                            + "\n2.- Consultar"
                            + "\n3.- Actualizar Información "
                            + "\n4.- Dar bajas"
                            + "\n5.- Salir");
                    int decision = sc.nextInt();
                    sc.nextLine();

                    switch (decision) {
                        case 1:
                            System.out.println("¿Qué persona deseas dar de alta?"
                                    + "\n1.- Alumno"
                                    + "\n2.- Profesor"
                                    + "\n3.- Personal"
                                    + "\n5.- Salir");
                            int decision2 = sc.nextInt();
                            sc.nextLine();
                            switch (decision2) {
                                case 1:
                                    System.out.println("\nA continuación te pediremos unos datos necesarios para dar de alta al alumno"
                                            + "\nIntroduce el nombre del alumno deseado a dar de alta");
                                    String nombre = sc.nextLine();
                                    System.out.println("Introduce el apellido paterno del alumno deseado a dar de alta");
                                    String apPa = sc.nextLine();
                                    System.out.println("Introduce el apellido materno del alumno deseado a dar de alta");
                                    String apMa = sc.nextLine();
                                    System.out.println("Introduce el género del alumno deseado a dar de alta");
                                    char sexo = sc.next().charAt(0);
                                    System.out.println("Introduce la edad del alumno deseado a dar de alta");
                                    int edad = sc.nextInt();
                                    sc.nextLine();
                                    System.out.println("Introduce la dirección del alumno deseado a dar de alta");
                                    String dir = sc.nextLine();
                                    System.out.println("Introduce la nacionalidad del alumno deseado a dar de alta");
                                    String nacionalidad = sc.nextLine();
                                    System.out.println("Introduce el telefono del alumno deseado a dar de alta");
                                    String telefono = sc.nextLine();
                                    System.out.println("Introduce la mátricula del alumno deseado a dar de alta: ");
                                    String matricula = sc.nextLine();
                                    System.out.println("Introduce el correo institucional del alumno deseado a dar de alta");
                                    String correo = sc.nextLine();
                                    System.out.println("Introduce el grado del alumno deseado a dar de alta");
                                    char grado = sc.next().charAt(0);
                                    Alumno alta = new Alumno(nombre, apPa, apMa, sexo, edad, dir, nacionalidad, telefono, matricula, correo, grado);
                                    directivo.darAltaAlumno(alta);
                                    System.out.println(alta.toString());
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 2:
                            System.out.println("¿Qué personas deseas Consultar?"
                                    + "\n1.- Alumno"
                                    + "\n2.- Profesor"
                                    + "\n3.- Personal"
                                    + "\n5.- Salir");
                            int decision3 = sc.nextInt();
                            switch (decision3) {
                                case 1:
                                    System.out.println(directivo.imprimirAlumnos());
                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    throw new AssertionError();
                            }

                            break;
                        case 3:
                            System.out.println("¿Qué persona deseas Actualizar?"
                                    + "\n1.- Alumno"
                                    + "\n2.- Profesor"
                                    + "\n3.- Personal"
                                    + "\n4.- Salir");
                            int decision4 = sc.nextInt();
                            switch (decision4) {
                                case 1:

                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        case 4:
                            System.out.println("¿Qué persona deseas dar de baja?"
                                    + "\n1.- Alumno"
                                    + "\n2.- Profesor"
                                    + "\n3.- Personal"
                                    + "\n5.- Salir");
                            int decision5 = sc.nextInt();
                            switch (decision5) {
                                case 1:

                                    break;
                                case 2:
                                    break;
                                case 3:
                                    break;
                                case 4:
                                    break;
                                default:
                                    throw new AssertionError();
                            }
                            break;
                        case 5:
                            System.out.println("Gracias por usar el sistema");
                        default:
                            throw new AssertionError();
                    }
                }
            }
            if (tipoUsuario.equals("profesor")) {
                credencial.validarCreedencialesProf();
                if (credencial.getUsuarioProf().equals("leonardonoriega")) {

                }
            }
        } while (!tipoUsuario.equals("salir"));
    }

}
