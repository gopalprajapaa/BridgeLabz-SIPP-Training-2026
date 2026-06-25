interface StreamingService {

    void streamMovie(String movie);

    default void showSubscriptionDetails() {
        System.out.println("Streaming Service Subscription Active");
    }
}

interface GamingService {

    void playGame(String game);

    default void showSubscriptionDetails() {
        System.out.println("Gaming Service Subscription Active");
    }
}

class SmartTV implements StreamingService, GamingService {

    @Override
    public void streamMovie(String movie) {
        System.out.println("Streaming Movie: " + movie);
    }

    @Override
    public void playGame(String game) {
        System.out.println("Playing Game: " + game);
    }

    // Resolving default method conflict
    @Override
    public void showSubscriptionDetails() {
        System.out.println("Smart TV Subscription Details:");

        StreamingService.super.showSubscriptionDetails();
        GamingService.super.showSubscriptionDetails();
    }
}

public class Smart{
    public static void main(String[] args) {

        String[] movies = {
            "Inception",
            "Interstellar",
            "Avengers"
        };

        String[] games = {
            "FIFA 25",
            "Minecraft",
            "Need for Speed"
        };

        SmartTV tv = new SmartTV();

        tv.showSubscriptionDetails();

        System.out.println("\nAvailable Movies:");
        for (String movie : movies) {
            tv.streamMovie(movie);
        }

        System.out.println("\nAvailable Games:");
        for (String game : games) {
            tv.playGame(game);
        }
    }
}