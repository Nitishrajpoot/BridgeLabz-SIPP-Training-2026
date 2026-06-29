package MultiServiceSmartTV;

public interface StreamingService {

        void playGame();

        default void showSubscriptionDetails() {
            System.out.println("Gaming Subscription: Ultimate Gaming Pass");

    }
}
