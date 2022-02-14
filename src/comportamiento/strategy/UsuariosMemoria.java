package comportamiento.strategy;

import java.util.ArrayList;
import java.util.List;

public class UsuariosMemoria implements Usuarios {

  private List<String> usuarios = new ArrayList<>();

  @Override
  public void crear(String usuario) {
    this.usuarios.add(usuario);
  }

  @Override
  public List<String> listar() {
    return this.usuarios;
  }

}
