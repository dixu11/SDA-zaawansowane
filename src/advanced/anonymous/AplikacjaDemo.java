package advanced.anonymous;

public class AplikacjaDemo {
    public static void main(String[] args) {
        Przycisk start = new PrzyciskStart();
        start.nacisnij();

        Przycisk exit = new Przycisk(){
            @Override
            public void nacisnij() {
                System.out.println("Wyjście");
            }
        };

        exit.nacisnij();
    }
}
