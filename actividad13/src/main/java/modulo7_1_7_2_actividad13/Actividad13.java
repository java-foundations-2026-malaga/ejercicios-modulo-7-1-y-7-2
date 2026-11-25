package modulo7_1_7_2_actividad13;


class SavingsAccount {
	int balance = 1200;
	double interestRate = 0.05;
	
	public double calcInterest() {
		double interesMensual = balance * interestRate / 12;
		return interesMensual;
	}
}

public class Actividad13 {
    public static void main(String[] args) {
        // TODO: aplica el interés retornado.
    	SavingsAccount sA = new SavingsAccount();
    	
    	System.out.println("Interés: "+ sA.calcInterest() +"\nNuevo saldo: "+ (sA.balance + sA.calcInterest()));
    }
}
