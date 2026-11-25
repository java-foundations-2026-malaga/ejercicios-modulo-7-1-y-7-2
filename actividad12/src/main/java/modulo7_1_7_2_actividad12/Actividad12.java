package modulo7_1_7_2_actividad12;
class SavingsAccount {
	int balance = 1200;
	double interestRate = 0.05;
	
	public double calcInterest() {
		double interesMensual = balance * interestRate / 12;
		return interesMensual;
	}
}
public class Actividad12 {
    public static void main(String[] args) {
        // TODO: crea SavingsAccount y calcInterest().
    	SavingsAccount sA = new SavingsAccount();
    	System.out.println("Interés mensual: " + sA.calcInterest());
    }
}
