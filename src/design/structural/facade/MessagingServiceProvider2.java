package design.structural.facade;

public class MessagingServiceProvider2 implements MessagingService {

    @Override
    public void publishMessageToTopic() {
        System.out.println("Provider 2 implementation of publishing....");
    }

    @Override
    public void subscribeToTopic() {
        System.out.println("Provider 2 implementation of subscribing...");
    }

}
