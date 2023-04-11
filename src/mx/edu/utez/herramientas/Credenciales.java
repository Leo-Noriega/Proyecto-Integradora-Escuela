package mx.edu.utez.herramientas;

import java.util.Scanner;

//@TODO: Añadir esta clase al diagrama

public class Credenciales {
    private String[] usuariosEstu;
    private String[] contrasenasEstu;
    private String[] usuariosDir;
    private String[] contrasenasDir;
    private boolean credencialesValidas;
    private int posUsuario;

    public Credenciales() {
        this.usuariosEstu = new String[] { "2023tn01", "2023tn02", "2023tn03", "2023tn04", "2023tn05" };
        this.contrasenasEstu = new String[] { "juan01", "maria02", "carlos03", "ana04", "luis05" };
        this.usuariosDir = new String[] { "pedrorector", "xiomaradatid" };
        this.contrasenasDir = new String[] { "pedroortiza2", "xiomarabenitezb1" };
        this.credencialesValidas = false;
        this.posUsuario = -1;
    }

    public boolean getCredencialesValidas() {
        return credencialesValidas;
    }

    public String getUsuario() {
        return usuariosEstu[posUsuario];
    }

    public int getPosUsuario() {
        return posUsuario;
    }

    public void validarCreedencialesEstu() {
        Scanner sc = new Scanner(System.in);
        while (!credencialesValidas) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();
            for (int i = 0; i < usuariosEstu.length;) {
                if (usuario.equals(usuariosEstu[i]) && contrasena.equals(contrasenasEstu[i])) {
                    credencialesValidas = true;
                    posUsuario = i;
                    System.out.println("Has iniciado sesión correctamente " + usuariosEstu[posUsuario]);
                    break;
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
                break;
            }
        }
    }

    public void validarCreedencialesDir() {
        Scanner sc = new Scanner(System.in);
        while (!credencialesValidas) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();
            for (int i = 0; i < usuariosDir.length;) {
                if (usuario.equals(usuariosDir[i]) && contrasena.equals(contrasenasDir[i])) {
                    credencialesValidas = true;
                    posUsuario = i;
                    System.out.println("Has iniciado sesión correctamente " + usuariosDir[posUsuario]);
                    break;
                } else {
                    System.out.println("Usuario o contraseña incorrectos");
                }
                break;
            }
        }
    }
}