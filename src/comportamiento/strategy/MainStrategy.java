package comportamiento.strategy;

import java.util.List;

public class MainStrategy {

  public static void main(String[] args) {
    UsuariosFichero usuariosFichero = new UsuariosFichero();

    crear(usuariosFichero, "AbelFichero");
    crear(usuariosFichero, "PacoFichero");
    crear(usuariosFichero, "LauraFichero");

    for (String usuario : listar(usuariosFichero)) {
      System.out.println(usuario);
    }

    UsuariosMemoria usuariosMemoria = new UsuariosMemoria();

    crear(usuariosMemoria, "AbelMemoria");
    crear(usuariosMemoria, "PacoMemoria");
    crear(usuariosMemoria, "LauraMemoria");

    for (String usuario : listar(usuariosMemoria)) {
      System.out.println(usuario);
    }
  }

  public static void crear(Usuarios usuarios, String nombre) {
    usuarios.crear(nombre);
  }

  public static List<String> listar(Usuarios usuarios) {
    return usuarios.listar();
  }

}
