package comportamiento.iterator;

public class IteratorMain {

  public static void main(String[] args) {
    Usuarios usuarios = new Usuarios();
    usuarios.crear(new Usuario("Abel", 31));
    usuarios.crear(new Usuario("Pepe", 32));
    usuarios.crear(new Usuario("Lola", 22));
    usuarios.crear(new Usuario("Alfredo", 40));

    while (usuarios.hasNext()) {
      System.out.println(usuarios.next().getNombre());
    }
    usuarios.reset();
    System.out.println(usuarios.next().getNombre());

  }
}
