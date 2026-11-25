package modulo7_1_7_2_actividad14;

class Bond {
	int term = 0;
	double rate = 0;
public double setTermAndRate(int term) {
	this.term = term;
	if (term <12) rate = 0.015;
	if (term < 60) rate = 0.025;
	if (term >= 60) rate = 0.03;
	return rate;
}
}
public class Actividad14 {
    public static void main(String[] args) {
        // TODO: modela Bond y configura plazo y tasa.
    	Bond bono = new Bond();
    	int plazo = 36;
    	double tasa = 0.0;
    	tasa = bono.setTermAndRate(plazo);
    	System.out.println("Plazo: "+plazo+"\nTasa: "+ tasa);
    }
}
