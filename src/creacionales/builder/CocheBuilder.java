package creacionales.builder;

public class CocheBuilder {

  Vehiculo vehiculo;

  public CocheBuilder(String marca) {
    vehiculo = new Vehiculo();
    vehiculo.marca = marca;
  }

  public CocheBuilder setModelo(String modelo) {
    vehiculo.modelo = modelo;
    return this;
  }

  public CocheBuilder setPuertas(int puertas) {
    vehiculo.puertas = puertas;
    return this;
  }

  public CocheBuilder setMotor(String motor) {
    vehiculo.motor = motor;
    return this;
  }

  public CocheBuilder setColor(String color) {
    vehiculo.color = color;
    return this;
  }

  public Vehiculo build() {
    return vehiculo;
  }
}
