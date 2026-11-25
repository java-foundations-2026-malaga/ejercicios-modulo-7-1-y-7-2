package modulo7_1_7_2_actividad10;

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

public class Actividad10 {
    public static void main(String[] args) {
        // TODO: crea y compara ambos objetos.
    	boolean compara = false;
    	Prisoner buba = new Prisoner ("Bubba", 1.75,4);
    	Prisoner twitch = new Prisoner("Bubba", 1.75,4);
    	System.out.println("bubba == twitch: "+ (buba==twitch));
    }
}
