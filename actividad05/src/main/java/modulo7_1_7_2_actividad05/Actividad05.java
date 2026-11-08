package modulo7_1_7_2_actividad05;

public class Actividad05 {
    static class Prisoner {
        String name;
    }

    public static void main(String[] args) {
        Prisoner first = new Prisoner();
        Prisoner second = first;
        first.name = "Bubba";
        second.name = "Twitch";
        System.out.println("Primero: " + first.name);
        System.out.println("Segundo: " + second.name);
    }
}
