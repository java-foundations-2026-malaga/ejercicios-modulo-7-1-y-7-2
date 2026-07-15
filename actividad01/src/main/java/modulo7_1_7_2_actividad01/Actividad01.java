package modulo7_1_7_2_actividad01;

public class Actividad01 {
  static class CheckingAccount {}

  String name;
  double balance;

  public static void main(String[] args) {
    CheckingAccount account = new CheckingAccount();
    account.name = "Ana";
    account.balance = 500;
    System.out.println("Nombre: " + account.name);
    System.out.println("Saldo: " + account.balance);
  }
}
