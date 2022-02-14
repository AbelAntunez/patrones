package estructurales.decorator;

public class TelefonoBase implements Telefono {

  @Override
  public void crear() {
    System.out.println("Soy un teléfono básico. Mis características son: ");

    tengoGSM();
    tengoSMS();
  }

  private void tengoGSM() {
    System.out.println("  -> Red 2G/3G");
  }

  private void tengoSMS() {
    System.out.println("  -> SMS/MMS");
  }
}
