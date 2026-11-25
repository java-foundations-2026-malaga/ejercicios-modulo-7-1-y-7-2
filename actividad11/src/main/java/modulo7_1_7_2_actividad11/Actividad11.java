package modulo7_1_7_2_actividad11;


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
public class Actividad11 {
    public static void main(String[] args) {
        // TODO: demuestra la referencia compartida.
    	Prisoner buba = new Prisoner ("Bubba", 1.75,4);
    	Prisoner twitch = buba;
    	twitch.name = "Nuevo nombre";
    	buba.name = "Nuevo nombre";
    	System.out.println("bubba: "+ buba.name + "\ntwitch: " + twitch.name + "\nMisma referencia: "+ (buba.name==twitch.name));
    }
}
