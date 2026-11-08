package modulo7_1_7_2_actividad02;

public class Actividad02 {
    static class CheckingAccount {
        String name;
        double balance;
    }

    public static void main(String[] args) {
        CheckingAccount account;
        account.name = "Ana";
        account.balance = 750;
        System.out.println(account.name + ": " + account.balance);
    }
}
