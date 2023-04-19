package mx.edu.utez;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mx.edu.utez.herramientas.*;
import mx.edu.utez.modules.persona.*;

public class Main {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Archivo archivo = new Archivo();
        String tipoUsuario;
        int decisionA, decision, decision2, decision3, decision4, decision5, decision6;

        do {
            // Menu de para pedir credenciales
            System.out.println("\n* BIENVENIDO AL SISTEMA *"
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
                do {
                    System.out.println("BIENVENIDO: "
                            + "\n¿Qué deseas hacer?"
                            + "\n1.- Solicitar calificaciones"
                            + "\n2.- Darse de baja"
                            + "\n3.- Salir");
                    decisionA = sc.nextInt();
                    sc.nextLine();
                    Alumno alumnos1 = new Alumno();
                    switch (decisionA) {
                        case 1:
                            //Pidiendo mátricula al usuario para saber su identidad
                            System.out.println("Porfavor, introduce tu matricula:");
                            String matricula = sc.nextLine();
                            alumnos1.consultarCalificaciones();
                            break;
                        case 2:
                            System.out.println("Porfavor, introduce tu matricula:");
                            matricula = sc.nextLine();
                            alumnos1.darseBaja(matricula, alumnos);
                            break;
                        case 3:
                            System.out.println("Has salido");
                            break;
                        default:
                            System.out.println("Decision incorrecta");
                    }
                } while (decisionA != 3);

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

                    //Profesores
                    Profesor profesor1 = new Profesor("Griselda", "Leiva", "González", 'F', 35, "Calle 1 #123", "Mexicana", "1234567890", "griselda.leiva@utez.edu.mx", "Programación", 15000.0);
                    Profesor profesor2 = new Profesor("Adriel", "Campos", "Rojas", 'M', 28, "Calle 2 #456", "Mexicana", "2345678901", "adriel.campos@utez.edu.mx", "Matemáticas", 12000.0);
                    Profesor profesor3 = new Profesor("Eunice", "Santos", "Pérez", 'F', 42, "Calle 3 #789", "Mexicana", "3456789012", "eunice.santos@utez.edu.mx", "Español", 13000.0);
                    Profesor profesor4 = new Profesor("Winston", "Clarke", "Williams", 'M', 50, "Calle 4 #101", "Jamaicana", "4567890123", "winston.clarke@utez.edu.mx", "Inglés", 18000.0);
                    Profesor profesor5 = new Profesor("Silvia", "López", "Ramírez", 'F', 39, "Calle 5 #234", "Mexicana", "5678901234", "silvia.lopez@utez.edu.mx", "Química", 16000.0);
                    Profesor profesor6 = new Profesor("Felipe", "Sánchez", "Martínez", 'M', 45, "Calle 6 #567", "Mexicana", "6789012345", "felipe.sanchez@utez.edu.mx", "Física", 17000.0);
                    directivo.añadirProfesores(profesor1);
                    directivo.añadirProfesores(profesor2);
                    directivo.añadirProfesores(profesor3);
                    directivo.añadirProfesores(profesor4);
                    directivo.añadirProfesores(profesor5);

                    //Personal 
                    Personal personal1 = new Personal("Ernestina", "Morales", "Madrid", 'F', 45, "Av. Roma #5",
                            "Hondureña", "9832379487", "Limpieza", "8:00 am - 3:00 pm", 2500);

                    Personal personal2 = new Personal("Jose", "Peréz", "León", 'M', 30, "Calle las palmas #15",
                            "Salvadoreño", "2948720933", "Limpieza", "10:00 am - 5:00 pm", 3500);

                    Personal personal3 = new Personal("Henry", "Victoria", "Castro", 'M', 25, "Av. Sauces #60",
                            "Mexicano", "9623981987", "Seguridad", "8:00 am - 8:00 pm", 5000);

                    Personal personal4 = new Personal("Julia", "Hernández", "Salvador", 'F', 32, "Col. Los Laureles #2",
                            "Mexicana", "7776765687", "Seguridad", "7:00 am - 5:00 pm", 4500);

                    Personal personal5 = new Personal("Selene", "Delgado", "López", 'F', 27, "Delegación Álvaro Obregon",
                            "Mexicana", "5506894949", "Limpieza", "7:00 am - 5:00 pm", 4000);
                    directivo.añadirPersonalL(personal1);
                    directivo.añadirPersonalL(personal2);
                    directivo.añadirPersonalL(personal3);
                    directivo.añadirPersonalL(personal4);
                    directivo.añadirPersonalL(personal5);

                    do {
                        System.out.println("Indica el número según la opción que deseas realizar"
                                + "\n1.- Dar altas"
                                + "\n2.- Consultar"
                                + "\n3.- Actualizar Información "
                                + "\n4.- Dar bajas"
                                + "\n5.- Salir");
                        decision = sc.nextInt();
                        sc.nextLine();

                        switch (decision) {
                            case 1:
                                do {
                                    System.out.println("¿Qué persona deseas dar de alta?"
                                            + "\n1.- Alumno"
                                            + "\n2.- Profesor"
                                            + "\n3.- Salir");
                                    decision2 = sc.nextInt();
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
                                            Alumno altaEstu = new Alumno(nombre, apPa, apMa, sexo, edad, dir, nacionalidad, telefono, matricula, correo, grado);
                                            directivo.darAltaAlumno(altaEstu);
                                            System.out.println(altaEstu.toString());
                                            archivo.mensajeAltaEstu("FichaEstudiante-" + (altaEstu.getMatricula()), altaEstu);
                                            break;
                                        case 2:
                                            System.out.println("\nA continuación te pediremos unos datos necesarios para dar de alta al profesor"
                                                    + "\nIntroduce el nombre del profesor deseado a dar de alta");
                                            nombre = sc.nextLine();
                                            System.out.println("Introduce el apellido paterno del profesor deseado a dar de alta");
                                            apPa = sc.nextLine();
                                            System.out.println("Introduce el apellido materno del profesor deseado a dar de alta");
                                            apMa = sc.nextLine();
                                            System.out.println("Introduce el género del profesor deseado a dar de alta");
                                            sexo = sc.next().charAt(0);
                                            System.out.println("Introduce la edad del profesor deseado a dar de alta");
                                            edad = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Introduce la dirección del profesor deseado a dar de alta");
                                            dir = sc.nextLine();
                                            System.out.println("Introduce la nacionalidad del profesor deseado a dar de alta");
                                            nacionalidad = sc.nextLine();
                                            System.out.println("Introduce el telefono del profesor deseado a dar de alta");
                                            telefono = sc.nextLine();
                                            System.out.println("Introduce el correo institucional del profesor deseado a dar de alta");
                                            correo = sc.nextLine();
                                            System.out.println("Introduce la materia asignada al profesor");
                                            String materia = sc.nextLine();
                                            System.out.println("Introduce el sueldo del profesor deseado a dar de alta");
                                            double sueldo = sc.nextDouble();
                                            Profesor altaProf = new Profesor(nombre, apPa, apMa, sexo, edad, dir, nacionalidad, telefono, correo, materia, sueldo);
                                            directivo.darAltaProfesor(altaProf);
                                            System.out.println(altaProf.toString());
                                            archivo.mensajeAltaProf("FichaProfesor-" + (altaProf.getNombre()), altaProf);
                                            break;
                                        case 3:
                                            System.out.println("Has salido");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                } while (decision2 != 4);

                                break;
                            case 2:
                                do {
                                    System.out.println("¿Qué personas deseas Consultar?"
                                            + "\n1.- Alumno"
                                            + "\n2.- Profesor"
                                            + "\n3.- Personal"
                                            + "\n4.- Salir");
                                    decision3 = sc.nextInt();
                                    switch (decision3) {
                                        case 1:
                                            System.out.println(directivo.imprimirAlumnos());
                                            break;
                                        case 2:
                                            System.out.println(directivo.imprimirProfesores());
                                            break;
                                        case 3:
                                            System.out.println(directivo.imprimirPersonal());
                                            break;
                                        case 4:
                                            System.out.println("Has salido");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }

                                } while (decision3 != 4);
                                break;
                            case 3:
                                do {
                                    System.out.println("¿Qué persona deseas Actualizar?"
                                            + "\n1.- Alumno"
                                            + "\n2.- Profesor"
                                            + "\n3.- Salir");
                                    decision4 = sc.nextInt();
                                    switch (decision4) {
                                        case 1:
                                            System.out.println("Introduce la matricula del alumno que desea modificar: ");
                                            String mat = sc.nextLine();
                                            System.out.println("\nA continuación te pediremos que ingreses los nuevos datos alumno o confirmarlos si es que no necesitan ser actualizados"
                                                    + "\nIntroduce el nombre del alumno");
                                            String nombre = sc.nextLine();
                                            System.out.println("Introduce el apellido paterno del alumno");
                                            String apPa = sc.nextLine();
                                            System.out.println("Introduce el apellido materno del alumno");
                                            String apMa = sc.nextLine();
                                            System.out.println("Introduce el género del alumno");
                                            char sexo = sc.next().charAt(0);
                                            System.out.println("Introduce la edad del alumno");
                                            int edad = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Introduce la dirección del alumno");
                                            String dir = sc.nextLine();
                                            System.out.println("Introduce la nacionalidad del alumno");
                                            String nacionalidad = sc.nextLine();
                                            System.out.println("Introduce el telefono del alumno");
                                            String telefono = sc.nextLine();
                                            System.out.println("Introduce la mátricula del alumno");
                                            String matricula = sc.nextLine();
                                            System.out.println("Introduce el correo institucional del alumno");
                                            String correo = sc.nextLine();
                                            System.out.println("Introduce el grado del alumno");
                                            char grado = sc.next().charAt(0);
                                            Alumno actualizadoEstu = new Alumno(nombre, apPa, apMa, sexo, edad, dir, nacionalidad, telefono, matricula, correo, grado);
                                            directivo.actualizarAlumno(mat, actualizadoEstu);
                                            break;
                                        case 2:
                                            System.out.println("\nA continuación te pediremos los nuevos  datos del profesor o confirmarlos si es que no necesitan ser actualizados"
                                                    + "\nIntroduce el nombre del profesor");
                                            nombre = sc.nextLine();
                                            System.out.println("Introduce el apellido paterno del profesor");
                                            apPa = sc.nextLine();
                                            System.out.println("Introduce el apellido materno del profesor");
                                            apMa = sc.nextLine();
                                            System.out.println("Introduce el género del profesor");
                                            sexo = sc.next().charAt(0);
                                            System.out.println("Introduce la edad del profesor");
                                            edad = sc.nextInt();
                                            sc.nextLine();
                                            System.out.println("Introduce la dirección del profesor");
                                            dir = sc.nextLine();
                                            System.out.println("Introduce la nacionalidad del profesor");
                                            nacionalidad = sc.nextLine();
                                            System.out.println("Introduce el telefono del profesor");
                                            telefono = sc.nextLine();
                                            System.out.println("Introduce el correo institucional del profesor");
                                            correo = sc.nextLine();
                                            System.out.println("Introduce la materia asignada al profesor");
                                            String materia = sc.nextLine();
                                            System.out.println("Introduce el sueldo del profesor");
                                            double sueldo = sc.nextDouble();
                                            Profesor actualizadoProf = new Profesor(nombre, apPa, apMa, sexo, edad, dir, nacionalidad, telefono, correo, materia, sueldo);
                                            directivo.darAltaProfesor(actualizadoProf);
                                            System.out.println(actualizadoProf.toString());
                                            break;
                                        case 3:
                                            System.out.println("Has salido");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } while (decision4 != 4);

                                break;
                            case 4:
                                do {
                                    System.out.println("¿Qué persona deseas dar de baja?"
                                            + "\n1.- Alumno"
                                            + "\n2.- Profesor"
                                            + "\n3.- Personal"
                                            + "\n4.- Salir");
                                    decision5 = sc.nextInt();
                                    switch (decision5) {
                                        case 1:
                                            System.out.println("Introduce la matricula del alumno que deseas dar de baja: ");
                                            String matricula = sc.nextLine();
                                            Alumno alumno = new Alumno();
                                            directivo.darBajaAlumno(matricula, alumno);
                                            archivo.mensajeBajaEstu("SolicitudBaja-" + matricula, alumno);
                                            break;
                                        case 2:
                                            System.out.println("Introduce el nombre del profesor que deseas dar de baja");
                                            String nombre = sc.nextLine();
                                            Profesor profesor = new Profesor();
                                            directivo.darBajaProfesor(nombre, profesor);
                                            archivo.mensajeBajaProf("SolicitudDespido-" + nombre, profesor);
                                            break;
                                        case 3:
                                            System.out.println("Introduce el nombre del personal que deseas dar de baja");
                                            nombre = sc.nextLine();
                                            directivo.darBajaPersonal(nombre);
                                            break;
                                        case 4:
                                            System.out.println("Has salido");
                                            break;
                                        default:
                                            throw new AssertionError();
                                    }
                                } while (decision5 != 4);

                                break;
                            case 5:
                                System.out.println("Gracias por usar el sistema");

                        }
                    } while (decision != 5);

                }
            }
            if (tipoUsuario.equals("profesor")) {
                credencial.validarCreedencialesProf();
                if (credencial.getUsuarioProf().equals("leonardonoriega")) {
                    Profesor profesor1 = new Profesor("Leonardo", "Noriega", "Rangel", 'M', 25, "Calle 1 #123",
                            "Estadounidense", "1234567890", "LeonardoNoriega@utez.edu.mx", "Programación", 25000.0);
                    System.out.println("Bienvenido " + profesor1.getNombre() + " "
                            + profesor1.getApellidoPaterno() + " "
                            + profesor1.getApellidoMaterno() + "");
                    do {
                        System.out.println("Indica el número según la opción que deseas realizar"
                                + "\n1.- Ver Horario"
                                + "\n2.- Ver Lista"
                                + "\n3.- Salir");
                        decision6 = sc.nextInt();
                        sc.nextLine();
                        switch (decision6) {
                            case 1:
                                profesor1.verHorario();
                                break;
                            case 2:
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
                                profesor1.añadirAlumnosL(alumno1);
                                profesor1.añadirAlumnosL(alumno2);
                                profesor1.añadirAlumnosL(alumno3);
                                profesor1.añadirAlumnosL(alumno4);
                                profesor1.añadirAlumnosL(alumno5);
                                profesor1.imprimirAlumnos();
                                break;
                            case 3:
                                System.out.println("Has salido");
                                break;
                            default:
                                throw new AssertionError();
                        }
                    } while (decision6 != 3);
                }
            }
            System.out.println("Hasta Pronto");
        } while (!tipoUsuario.equals("salir"));
    }
}
