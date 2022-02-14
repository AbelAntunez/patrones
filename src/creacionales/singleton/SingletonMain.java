package creacionales.singleton;

public class SingletonMain {
  public static void main(String[] args) {
    Singleton singleton1 = Singleton.getInstance();
    Singleton singleton2 = Singleton.getInstance();

    singleton1.setId("1");
    singleton2.setId("2");

    System.out.println("Singleton1: " + singleton1.getId() + " " + singleton1);
    System.out.println("Singleton2: " + singleton2.getId() + " " + singleton2);
  }
}
