package estructurales.decorator;

public class DecoratorMain {

  public static void main(String[] args) {
    TelefonoNextGen telefonoNextGen = new TelefonoNextGen(new TelefonoInteligente(new TelefonoBase()));
    telefonoNextGen.crear();
  }

}
