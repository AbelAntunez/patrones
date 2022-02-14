package creacionales.factory;

public class PrecioFactory {
  Precio precio;

  private PrecioFactory() { }

  public PrecioFactory(String pais) {
    if (pais.equalsIgnoreCase("España")) {
      System.out.println("Precio para España");
      precio = new PrecioEUR();
    } else if (pais.equalsIgnoreCase("UK")) {
      System.out.println("Precio para UK");
      precio = new PrecioGBP();
    }
    else {
      System.out.println("Precio para USA");
      precio = new PrecioUSD();
    }
  }

  public double getPrecio() {
    return precio.getPrecio();
  }
}
