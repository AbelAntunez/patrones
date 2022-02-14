package comportamiento.observer;

import java.util.ArrayList;
import java.util.List;

public class Emisor {

  private List<Receptor> receptores = new ArrayList<>();

  public void addReceptor(Receptor receptor) {
    this.receptores.add(receptor);
  }

  public void emite() {
    for (Receptor receptor : receptores) {
      receptor.recibe();
    }
  }
}
