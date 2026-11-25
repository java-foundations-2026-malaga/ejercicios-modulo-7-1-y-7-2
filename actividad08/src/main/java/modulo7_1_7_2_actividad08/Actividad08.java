package modulo7_1_7_2_actividad08;

public class Actividad08 {
    
	static class CheckingAccount {
        double balance = 1000;
        // TODO: implementa withdraw.
        public void withdraw(double amount) {
        	if(amount > 0 && ((balance - amount) > 0)) {
        		balance = balance - amount;
        		System.out.println("Retirada realizada");
        		System.out.println("Saldo: " + balance);
        	} else {
        		System.out.println("Fondos insuficientes");
        		System.out.println("Saldo: " + balance);
        	}
        }
    }

    public static void main(String[] args) {
        // TODO: prueba retiradas válidas e inválidas.
    	CheckingAccount cA = new CheckingAccount();
    	cA.withdraw(300);
    	cA.withdraw(800);
    	}
}
