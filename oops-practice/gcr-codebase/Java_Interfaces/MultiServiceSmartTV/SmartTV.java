package MultiServiceSmartTV;

class SmartTV implements StreamingService, GamingService {

    String[] movies = {"Avengers", "Inception", "Interstellar"};
    String[] games = {"FIFA", "Minecraft", "GTA V"};
public void streamMovie() {
    System.out.println("Available Movies:");
    for (String movie : movies) {
        System.out.println(movie);
    }
}

@Override
public void playGame() {
    System.out.println("\nAvailable Games:");
    for (String game : games) {
        System.out.println(game);
    }
}

// Resolving default method conflict
@Override
public void showSubscriptionDetails() {

    StreamingService.super.showSubscriptionDetails();
    GamingService.super.showSubscriptionDetails();
}
}
