package modulo7_1_7_2_actividad04;

public class Actividad04 {
  static class Prisoner {
    String name;
  }

  public static void main(String[] args) {
    Prisoner first = new Prisoner();
    Prisoner second = new Prisoner();
    first.name = "Bubba";
    second.name = "Bubba";
    System.out.println("Objetos iguales: " + (first == second));
  }
}
