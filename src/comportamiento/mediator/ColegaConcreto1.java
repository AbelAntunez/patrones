package comportamiento.mediator;

public class ColegaConcreto1 extends Colega {

  @Override
  void recibe() {
    System.out.println("He recibido el mensaje, soy ColegaConcreto1");
  }

  @Override
  void envia() {
    System.out.println("Soy ColegaConcreto1, envío un mensaje");
    mediator.reenvia(this);
  }
}
