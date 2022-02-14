package creacionales.builder;

public class BuilderMain {
  public static void main(String[] args) {
    Vehiculo coche = new CocheBuilder("Renault")
        .setModelo("R19")
        .setMotor("Combustión")
        .setPuertas(5)
        .setColor("Rojo").build();

    System.out.println(coche.toString());
  }
}
