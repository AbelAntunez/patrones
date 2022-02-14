package comportamiento.observer;

public class ObserverMain {

  public static void main(String[] args) {
    Emisor emisor = new Emisor();

    ReceptorSatelite receptorSatelite = new ReceptorSatelite();
    ReceptorRadio receptorRadio = new ReceptorRadio();
    ReceptorTv receptorTv = new ReceptorTv();

    emisor.addReceptor(receptorSatelite);
    emisor.addReceptor(receptorRadio);
    emisor.addReceptor(receptorTv);

    emisor.emite();
  }

}
