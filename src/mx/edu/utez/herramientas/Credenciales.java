package mx.edu.utez.herramientas;

import java.util.Scanner;

//@TODO: Añadir esta clase al diagrama
public class Credenciales {

    private String[] usuariosEstu;
    private String[] contrasenasEstu;
    private String[] usuariosDir;
    private String[] contrasenasDir;
    private String[] usuariosProf;
    private String[] contrasenasProf;
    private int posUsuario;

    public Credenciales() {
        this.usuariosEstu = new String[]{"2023tn01", "2023tn02", "2023tn03", "2023tn04", "2023tn05"};
        this.contrasenasEstu = new String[]{"juan01", "maria02", "carlos03", "ana04", "luis05"};
        this.usuariosDir = new String[]{"pedrorector", "xiomaradatid"};
        this.contrasenasDir = new String[]{"pedroortiza2", "xiomarabenitezb1"};
        this.usuariosProf = new String[]{"juanlopez", "leonardonoriega"};
        this.contrasenasProf = new String[]{"juanlopez12", "leonardonoriega2"};
        this.posUsuario = -1;
    }

    public String getUsuarioEstu() {
        return usuariosEstu[posUsuario];
    }

    public int getPosUsuarioEstu() {
        return posUsuario;
    }

    public String getUsuarioDir() {
        return usuariosDir[posUsuario];
    }

    public int getPosUsuarioDir() {
        return posUsuario;
    }

    public String getUsuarioProf() {
        return usuariosProf[posUsuario];
    }

    public int getPosUsuarioProf() {
        return posUsuario;
    }

    public void validarCreedencialesEstu() {
        Scanner sc = new Scanner(System.in);
        boolean credencialesValidas = false;
        while (!credencialesValidas) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();
            for (int i = 0; i < usuariosEstu.length; i++) {
                if (usuario.equals(usuariosEstu[i]) && contrasena.equals(contrasenasEstu[i])) {
                    posUsuario = i;
                    credencialesValidas = true;
                    break;
                }
            }
            if (!credencialesValidas) {
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
    }

    public void validarCreedencialesDir() {
        Scanner sc = new Scanner(System.in);
        boolean credencialesValidas = false;
        while (!credencialesValidas) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();
            for (int i = 0; i < usuariosDir.length; i++) {
                if (usuario.equals(usuariosDir[i]) && contrasena.equals(contrasenasDir[i])) {
                    credencialesValidas = true;
                    posUsuario = i;
                    break;
                }
            }
            if (!credencialesValidas) {
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
    }

    public void validarCreedencialesProf() {
        Scanner sc = new Scanner(System.in);
        boolean credencialesValidas = false;
        while (!credencialesValidas) {
            System.out.println("Ingrese su usuario: ");
            String usuario = sc.nextLine();
            System.out.println("Ingrese su contraseña: ");
            String contrasena = sc.nextLine();
            for (int i = 0; i < usuariosProf.length; i++) {
                if (usuario.equals(usuariosProf[i]) && contrasena.equals(contrasenasProf[i])) {
                    credencialesValidas = true;
                    posUsuario = i;
                    break;
                }
            }
            if (!credencialesValidas) {
                System.out.println("Usuario o contraseña incorrectos");
            }
        }
    }
}
