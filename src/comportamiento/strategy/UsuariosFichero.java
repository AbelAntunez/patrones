package comportamiento.strategy;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintStream;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class UsuariosFichero implements Usuarios {

  private String ficheroUsuarios = "usuarios.txt";
  private PrintStream fichero;

  public UsuariosFichero() {
    try {
      fichero = new PrintStream(ficheroUsuarios);
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }
  }

  @Override
  public void crear(String nombre) {
    fichero.println(nombre);
  }

  @Override
  public List<String> listar() {
    List<String> usuarios = new ArrayList<>();
    try {
      Scanner scanner = new Scanner(new File(ficheroUsuarios));

      while (scanner.hasNext()) {
        usuarios.add(scanner.next());
      }
      scanner.close();
    } catch (FileNotFoundException e) {
      e.printStackTrace();
    }

    return usuarios;
  }
}
