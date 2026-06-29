package MultiServiceSmartTV;

public interface GamingService {
    void Details();
    default void showSubscriptionDetails(){
        System.out.println("Streaming Subscription: Premium Movies Pack");
    }
}
