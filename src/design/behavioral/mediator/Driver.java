package design.behavioral.mediator;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServerImpl();

        User u1 = new User("user1", chatServer);
        User u2 = new User("user2", chatServer);
        User u3 = new User("user3", chatServer);

        u1.sendMessage("Hi All !!!");

    }
}
