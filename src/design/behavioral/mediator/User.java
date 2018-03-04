package design.behavioral.mediator;

public class User {
    private String     name;
    private ChatServer chatServer;

    public User(String name, ChatServer chatServer) {
        this.name = name;
        this.chatServer = chatServer;
        chatServer.addUsers(this);
    }

    public void sendMessage(String msg) {
        chatServer.sendMessage(this, msg);
    }

    public void receiveMsg(User user, String msg) {
        System.out.println(getName() + " : Message Received from user " + user.getName() + " is ::=> " + msg);
    }

    public String getName() {
        return name;
    }
}
