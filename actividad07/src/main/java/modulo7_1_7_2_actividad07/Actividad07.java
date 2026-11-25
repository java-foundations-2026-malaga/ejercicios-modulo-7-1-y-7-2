package modulo7_1_7_2_actividad07;

public class Actividad07 {
    static class CheckingAccount {
        String name;
        double balance;
        // TODO: añade deposit.
        void deposit(double amount) {
        	balance += amount;
        }
    }

    public static void main(String[] args) {
        // TODO: deposita y muestra el saldo.
    	CheckingAccount cuenta1 = new CheckingAccount();
    	cuenta1.name = "mario";
    	cuenta1.balance = 1000;
    	cuenta1.deposit(450);
    	System.out.println("Saldo: " + cuenta1.balance);
    			
    }
}
