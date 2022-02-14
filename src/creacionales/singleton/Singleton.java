package creacionales.singleton;

public class Singleton {

  private String id;
  private static Singleton singleton;

  private Singleton() { }

  public static Singleton getInstance() {
    if (singleton == null) {
      singleton = new Singleton();
    }
    return singleton;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }
}
