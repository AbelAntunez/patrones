package comportamiento.mediator;

import java.util.ArrayList;
import java.util.List;

public class MediadorConcreto extends Mediator {
  List<Colega> colegas = new ArrayList<>();

  @Override
  void registra(Colega colega) {
    if (!colegas.contains(colega)) {
      colegas.add(colega);
      colega.setMediator(this);
    }
  }

  @Override
  void reenvia(Colega colega) {
    for (Colega actual : colegas) {
      if (!actual.equals(colega)) {
        actual.recibe();
      }
    }
  }
}
