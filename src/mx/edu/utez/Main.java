package mx.edu.utez;

import java.util.Scanner;
import mx.edu.utez.herramientas.*;
import mx.edu.utez.modules.escuela.*;
import mx.edu.utez.modules.persona.*;

public class Main {

        public static void main(String[] args) {
                // Menu de para pedir credenciales
                Scanner sc = new Scanner(System.in);
                System.out.println("* BIENVENIDO AL SISTEMA *\nPor favor, indique si es 'estudiante' o 'directivo': ");
                String tipoUsuario = sc.nextLine().toLowerCase();
                while (!tipoUsuario.equals("estudiante") && !tipoUsuario.equals("directivo")) {
                        System.out.println(
                                        "Tipo de usuario incorrecto. Por favor, indique si es 'estudiante' o 'directivo': ");
                        tipoUsuario = sc.nextLine().toLowerCase();
                }
                // Creaación de credenciales staticas predeterminadas
                Credenciales credencial = new Credenciales();
                while (!credencial.getcredencialesValidas()) {
                        System.out.println("Ingrese su usuario: ");
                        String usuario = sc.nextLine();
                        System.out.println("Ingrese su contraseña: ");
                        String contrasena = sc.nextLine();
                        if (tipoUsuario.equals("estudiante")) {
                                credencial.validarCreedencialesEstu(usuario, contrasena);
                                // Creando alumnos iniciales (5)
                                Alumno alumno1 = new Alumno("Juan", "Pérez", "García", 'M', 18, "Calle 123", "Mexicana",
                                                "1234567890",
                                                "2023tn01", "juanperez@utez.edu.mx", new String[] { "9", "10", "8" },
                                                'A');

                                Alumno alumno2 = new Alumno("María", "Gómez", "Hernández", 'F', 20, "Calle 456",
                                                "Mexicana",
                                                "0987654321",
                                                "2023tn02", "mariagomez@utez.edu.mx", new String[] { "8", "7", "9" },
                                                'B');

                                Alumno alumno3 = new Alumno("Carlos", "Sánchez", "López", 'M', 22, "Calle 789",
                                                "Mexicana",
                                                "1357902468",
                                                "2023tn03", "carlossanchez@utez.edu.mx",
                                                new String[] { "10", "10", "10" },
                                                'C');

                                Alumno alumno4 = new Alumno("Ana", "Martínez", "Flores", 'F', 19, "Calle 321",
                                                "Mexicana",
                                                "2468013579",
                                                "2023tn04", "anamartinez@utez.edu.mx", new String[] { "7", "8", "6" },
                                                'A');

                                Alumno alumno5 = new Alumno("Luis", "Hernández", "Castillo", 'M', 21, "Calle 654",
                                                "Mexicana",
                                                "3692581470",
                                                "2023tn05", "luishernandez@utez.edu.mx", new String[] { "9", "7", "8" },
                                                'B');
                        }
                        if (tipoUsuario.equals("directivo")) {
                                credencial.validarCreedencialesDir(usuario, contrasena);
                                // Creando directivos iniciales (2)
                                Directivo directivo1 = new Directivo("Pedro", "Ortiz", "Gonzalez", 'H', 45,
                                                "Calle Revolución #2",
                                                "Mexicano",
                                                "555-123-4567", "pedroortiz@utez.edu.mx", "Edificio A, piso 2",
                                                "Rector",
                                                100000);
                                Directivo directivo2 = new Directivo("Xiomara", "Benitez", "Martinez", 'M', 42,
                                                "Calle Alta Tensión #99",
                                                "Mexicana",
                                                "555-987-6543", "xiomarabenitez@utez.edu.mx", "Edificio B, piso 1",
                                                "Directora DATID",
                                                90000);
                                // Creando alumnos iniciales (5)
                                Alumno alumno1 = new Alumno("Juan", "Pérez", "García", 'M', 18, "Calle 123", "Mexicana",
                                                "1234567890",
                                                "2023tn01", "juanperez@utez.edu.mx", new String[] { "9", "10", "8" },
                                                'A');

                                Alumno alumno2 = new Alumno("María", "Gómez", "Hernández", 'F', 20, "Calle 456",
                                                "Mexicana",
                                                "0987654321",
                                                "2023tn02", "mariagomez@utez.edu.mx", new String[] { "8", "7", "9" },
                                                'B');

                                Alumno alumno3 = new Alumno("Carlos", "Sánchez", "López", 'M', 22, "Calle 789",
                                                "Mexicana",
                                                "1357902468",
                                                "2023tn03", "carlossanchez@utez.edu.mx",
                                                new String[] { "10", "10", "10" },
                                                'C');

                                Alumno alumno4 = new Alumno("Ana", "Martínez", "Flores", 'F', 19, "Calle 321",
                                                "Mexicana",
                                                "2468013579",
                                                "2023tn04", "anamartinez@utez.edu.mx", new String[] { "7", "8", "6" },
                                                'A');

                                Alumno alumno5 = new Alumno("Luis", "Hernández", "Castillo", 'M', 21, "Calle 654",
                                                "Mexicana",
                                                "3692581470",
                                                "2023tn05", "luishernandez@utez.edu.mx", new String[] { "9", "7", "8" },
                                                'B');
                                // Creando profesores iniciales (5)
                        }
                }
                sc.close();
        }
}