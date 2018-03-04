package design.structural.facade;

public class MessagingServiceProvider1 implements MessagingService {

    @Override
    public void publishMessageToTopic() {
        System.out.println("Provider 1 implementation of publishing...");
    }

    @Override
    public void subscribeToTopic() {
        System.out.println("Provider 1 implementation of subscribing...");
    }

}
