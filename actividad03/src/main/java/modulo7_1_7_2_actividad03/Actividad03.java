package modulo7_1_7_2_actividad03;

public class Actividad03 {
  static class CheckingAccount {
    double balance;

    void deposit(double amount) {
      balance += amount;
    }
  }

  public static void main(String[] args) {
    deposit(1000);
    System.out.println("Saldo: " + balance);
  }
}
