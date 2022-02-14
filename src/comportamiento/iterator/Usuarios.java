package comportamiento.iterator;

import java.util.ArrayList;
import java.util.List;

public class Usuarios implements UsuarioIterator {
  private List<Usuario> usuarios = new ArrayList<>();
  private int posicion = 0;

  public void crear(Usuario usuario) {
    this.usuarios.add(usuario);
  }

  @Override
  public Usuario next() {
    Usuario usuario = usuarios.get(posicion);
    posicion++;
    return usuario;
  }

  @Override
  public boolean hasNext() {
    return this.posicion < usuarios.size();
  }

  @Override
  public void reset() {
    posicion = 0;
  }
}
