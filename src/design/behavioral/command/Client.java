package design.behavioral.command;

public class Client {
    public static void main(String[] args) {
        Request loginRequest = new Request(new LoginCommandHandler());
        loginRequest.invoke();

        Request logoutRequest = new Request(new LogoutCommandHandler());
        logoutRequest.invoke();
    }
}
