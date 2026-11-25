package modulo7_1_7_2_actividad09;

class Prisoner {
	
	String name = "";
	double height = 0.0; 
	int sentence = 0;
	void think() {
		System.out.println(name + " está pensando");
	}
public Prisoner(String name, double height, int sentence) {
		this.name = name;
		this.height = height;
		this.sentence = sentence;
	}
public Prisoner() {
super();
}


}
public class Actividad09 {
    public static void main(String[] args) {
        // TODO: crea Prisoner y dos objetos.
    	Prisoner prisionero01 = new Prisoner ("Bubba", 1.75,4);
    	Prisoner prisionero02 = new Prisoner("Twitch", 1.68, 3);
    	System.out.println(prisionero01.name + " mide " + prisionero01.height + " y cumple " + prisionero01.sentence + " años");
    	prisionero01.think();
    	System.out.println(prisionero02.name + " mide " + prisionero02.height + " y cumple " + prisionero02.sentence + " años");
    	prisionero02.think();
    	
    	
    }
}
