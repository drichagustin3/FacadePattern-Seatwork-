public class HomeApp {

    public static void main(String[] args) {

        HomeInterface home = new HomeInterface();

        System.out.println("Turning ON all home services:");
        home.turnOnAll();

        System.out.println();

        System.out.println("Turning OFF all home services:");
        home.turnOffAll();
    }
}