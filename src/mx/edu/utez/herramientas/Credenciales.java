package mx.edu.utez.herramientas;

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

    public boolean getcredencialesValidas() {
        return credencialesValidas;
    }

    public boolean validarCreedencialesEstu(String usuario, String contrasena) {
        for (int i = 0; i < usuariosEstu.length; i++) {
            if (usuario.equals(usuariosEstu[i]) && contrasena.equals(contrasenasEstu[i])) {
                credencialesValidas = true;
                posUsuario = i;
                break;
            }
        }
        System.out.println("Usuario o contraseña incorrectos");
        return credencialesValidas;
    }

    public boolean validarCreedencialesDir(String usuario, String contrasena) {
        for (int i = 0; i < usuariosDir.length; i++) {
            if (usuario.equals(usuariosDir[i]) && contrasena.equals(contrasenasDir[i])) {
                credencialesValidas = true;
                posUsuario = i;
                break;
            }
        }
        System.out.println("Usuario o contraseña incorrectos");
        return credencialesValidas;
    }
}
