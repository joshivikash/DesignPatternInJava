package design.behavioral.command;

public class Request {
    private Command command;

    public Request(Command command) {
        // TODO Auto-generated constructor stub
        this.command = command;
    }

    public void invoke() {
        command.execute();
    }
}
