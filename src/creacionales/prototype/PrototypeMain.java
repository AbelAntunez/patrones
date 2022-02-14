package creacionales.prototype;

public class PrototypeMain {
  public static void main(String[] args) {

    Coche coche = new Coche();
    coche.setMarca("Ford");
    coche.setModelo("Focus");
    coche.setPuertas(5);
    System.out.println(coche.toString());

    try {
      Coche clon = coche.clonar();
      clon.setPuertas(3);
      System.out.println(clon.toString());
    } catch (CloneNotSupportedException e) {
      System.err.println(e.getMessage());
    }

  }
}
