package comportamiento.state;

public class MainState {

  public static void main(String[] args) {
    Telefono tel1 = new Telefono();

    System.out.println(tel1.estado.desbloquear());
    System.out.println(tel1.estado.abrirCamara());
    System.out.println(tel1.estado.hacerFoto());
  }
}
