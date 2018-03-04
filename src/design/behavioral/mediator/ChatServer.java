package design.behavioral.mediator;

public interface ChatServer {
    void addUsers(User user);

    void sendMessage(User user, String msg);
}
