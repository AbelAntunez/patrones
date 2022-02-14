package comportamiento.mediator;

public class ColegaConcreto2 extends Colega {

  @Override
  void recibe() {
    System.out.println("He recibido el mensaje, soy ColegaConcreto2");
  }

  @Override
  void envia() {
    System.out.println("Soy ColegaConcreto2, envío un mensaje");
    mediator.reenvia(this);
  }

}
