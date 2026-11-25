package modulo7_1_7_2_actividad06;



public class Actividad06 {
	static class CheckingAccount {
	    String name;
	    double balance;
	}
	public static void main(String[] args) {
        // TODO: crea CheckingAccount y muestra sus datos.
    	CheckingAccount account = new CheckingAccount();
        account.name = "Ana";
        account.balance = 1200;
        System.out.println("Cuenta: "+ account.name + "\nSaldo: " + account.balance);
    	
    }
}
