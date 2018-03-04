package design.structural.facade;

public class MessagingClient {
    public static void main(String[] args) {
        MessagingService messagingService = new MessagingServiceProvider1();
        messagingService.subscribeToTopic();
        messagingService.publishMessageToTopic();

        messagingService = new MessagingServiceProvider2();
        messagingService.subscribeToTopic();
        messagingService.publishMessageToTopic();
    }
}
