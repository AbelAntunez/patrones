package creacionales.builder;

public class Vehiculo {
  public String marca;
  public String modelo;
  public int puertas;
  public String motor;
  public String color;

  public String getMarca() {
    return marca;
  }

  public String getModelo() {
    return modelo;
  }

  public int getPuertas() {
    return puertas;
  }

  public String getMotor() {
    return motor;
  }

  public String getColor() {
    return color;
  }

  @Override
  public String toString() {
    return "Vehiculo{" +
        "marca='" + marca + '\'' +
        ", modelo='" + modelo + '\'' +
        ", puertas=" + puertas +
        ", motor='" + motor + '\'' +
        ", color='" + color + '\'' +
        '}';
  }
}
