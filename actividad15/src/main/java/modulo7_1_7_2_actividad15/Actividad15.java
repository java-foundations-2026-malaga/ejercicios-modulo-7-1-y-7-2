package modulo7_1_7_2_actividad15;

class Bond {
	double balance = 1000;
	double monthlyRate = 0.005;
	int monthsRemaining = 2;
	double saldo = 0.0;

public double earnInterest() {
	if(monthsRemaining >0) {
		saldo = (balance+(balance * monthlyRate));
		monthsRemaining--;
	} else {
		System.out.println("El bono ha vencido");
		saldo = -1;
	}
	this.balance = saldo;
	return saldo;
}
}
	
public class Actividad15 {
    public static void main(String[] args) {
        // TODO: implementa earnInterest().
    	double saldo = 0.0;
    	int mesesRestantes = 0;
    	Bond bono = new Bond();
    	for (int x=1; x<=3; x++) {
    		saldo = bono.earnInterest();
    		if (saldo != -1) System.out.println("Meses restantes: "+bono.monthsRemaining+"\nSaldo: "+saldo);
    	}
    }
}
