package estructurales.adapter;

public class Lampara implements Enchufable {
  boolean corriente = false;

  @Override
  public void enciende() {
    corriente = true;
  }

  @Override
  public void apaga() {
    corriente = false;
  }

  @Override
  public boolean tieneCorriente() {
    return corriente;
  }
}
