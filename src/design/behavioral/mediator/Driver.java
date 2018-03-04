package design.behavioral.mediator;

public class Driver {
    public static void main(String[] args) {
        ChatServer chatServer = new ChatServerImpl();

        User u1 = new User("vicky", chatServer);
        User u2 = new User("nicky", chatServer);
        User u3 = new User("gudia", chatServer);

        u1.sendMessage("Hi All !!!");

    }
}
